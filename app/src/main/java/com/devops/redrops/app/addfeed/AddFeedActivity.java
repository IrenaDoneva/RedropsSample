package com.devops.redrops.app.addfeed;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Patterns;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.devops.redrops.app.R;
import com.devops.redrops.app.databinding.ActivityAddFeedBinding;
import com.devops.redrops.app.utils.SharedPreferencesManager;
import com.devops.redrops.app.utils.Utils;
import com.devops.redrops.app.utils.customviews.ReadropsItemTouchCallback;
import com.mikepenz.fastadapter.FastAdapter;
import com.mikepenz.fastadapter.adapters.ItemAdapter;
import com.mikepenz.fastadapter.commons.utils.DiffCallback;
import com.mikepenz.fastadapter.commons.utils.FastAdapterDiffUtil;
import com.readrops.db.entities.Feed;
import com.readrops.db.entities.account.Account;

import org.koin.androidx.viewmodel.compat.ViewModelCompat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

import static com.devops.redrops.app.utils.ReadropsKeys.ACCOUNT_ID;
import static com.devops.redrops.app.utils.ReadropsKeys.FEEDS;

public class AddFeedActivity extends AppCompatActivity implements View.OnClickListener {

    private AccountArrayAdapter arrayAdapter;

    private ItemAdapter<ParsingResult> parseItemsAdapter;
    private ItemAdapter<FeedInsertionResult> insertionResultsAdapter;
    FastAdapter<ParsingResult> fastAdapter;

    private AddFeedsViewModel viewModel;
    private ArrayList<Feed> feedsToUpdate;

    private ActivityAddFeedBinding binding;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityAddFeedBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.addFeedLoad.setOnClickListener(this);
        binding.addFeedOk.setOnClickListener(this);
        binding.addFeedOk.setEnabled(false);

        viewModel = ViewModelCompat.getViewModel(this, AddFeedsViewModel.class);

        parseItemsAdapter = new ItemAdapter<>();
        fastAdapter = FastAdapter.with(parseItemsAdapter);
        fastAdapter.withSelectable(true);
        fastAdapter.withOnClickListener((v, adapter, item, position) -> {
            item.setChecked(!item.isChecked());
            
            fastAdapter.notifyAdapterItemChanged(position);
            binding.addFeedOk.setEnabled(recyclerViewHasCheckedItems());

            return true;
        });

        binding.addFeedResults.setAdapter(fastAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        binding.addFeedResults.setLayoutManager(layoutManager);

        new ItemTouchHelper(new ReadropsItemTouchCallback(this,
                new ReadropsItemTouchCallback.Config.Builder()
                        .swipeDirs(ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT)
                        .leftDraw(Color.RED, R.drawable.ic_delete, null)
                        .rightDraw(Color.RED, R.drawable.ic_delete, null)
                        .swipeCallback((viewHolder, direction) -> {
                            parseItemsAdapter.remove(viewHolder.getAdapterPosition());

                            if (parseItemsAdapter.getAdapterItemCount() == 0) {
                                binding.addFeedResultsTextView.setVisibility(View.GONE);
                                binding.addFeedResults.setVisibility(View.GONE);
                            }
                        })
                        .build()))
                .attachToRecyclerView(binding.addFeedResults);

        insertionResultsAdapter = new ItemAdapter<>();
        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(this);
        binding.addFeedInsertedResultsRecyclerview.setAdapter(FastAdapter.with(insertionResultsAdapter));
        binding.addFeedInsertedResultsRecyclerview.setLayoutManager(layoutManager1);

        viewModel.getAccounts().observe(this, accounts -> {
            // set the current account at the top of the list
            int currentAccountId = getIntent().getIntExtra(ACCOUNT_ID, 1);
            Collections.sort(accounts, (o1, o2) -> {
                if (o1.getId() == currentAccountId) {
                    return -1;
                } else if (o2.getId() == currentAccountId) {
                    return 1;
                } else {
                    return 0;
                }
            });

            arrayAdapter = new AccountArrayAdapter(this, accounts);
            arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            binding.addFeedAccountSpinner.setAdapter(arrayAdapter);
        });

        feedsToUpdate = new ArrayList<>();

        // new feed intent
        if (getIntent().getAction() != null && getIntent().getAction().equals(Intent.ACTION_SEND)) {
            String text = getIntent().getStringExtra(Intent.EXTRA_TEXT);
            binding.addFeedTextInput.setText(text);
            onClick(binding.addFeedLoad);
        }
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.add_feed_load) {
            if (isValidUrl()) {
                binding.addFeedLoadingMessage.setVisibility(View.GONE);
                binding.addFeedLoading.setVisibility(View.VISIBLE);
                loadFeed();
            }
        } else if (v.getId() == R.id.add_feed_ok) {
            insertionResultsAdapter.clear();
            insertFeeds();
        }
    }

    private boolean isValidUrl() {
        String url = binding.addFeedTextInput.getText().toString().trim();

        if (url.isEmpty()) {
            binding.addFeedTextInput.setError(getString(R.string.empty_field));
            return false;
        } else if (!Patterns.WEB_URL.matcher(url).matches()) {
            binding.addFeedTextInput.setError(getString(R.string.wrong_url));
            return false;
        } else
            return true;
    }

    private boolean recyclerViewHasCheckedItems() {
        for (ParsingResult result : parseItemsAdapter.getAdapterItems()) {
            if (result.isChecked())
                return true;
        }

        return false;
    }

    private void disableParsingResult(ParsingResult parsingResult) {
        for (ParsingResult result : parseItemsAdapter.getAdapterItems()) {
            if (result.getUrl().equals(parsingResult.getUrl())) {
                result.setChecked(false);
                fastAdapter.notifyAdapterItemChanged(parseItemsAdapter.getAdapterPosition(result));
            }
        }
    }

    private void loadFeed() {
        String url = binding.addFeedTextInput.getText().toString().trim();

        final String finalUrl;
        if (!(url.contains(Utils.HTTP_PREFIX) || url.contains(Utils.HTTPS_PREFIX)))
            finalUrl = Utils.HTTPS_PREFIX + url;
        else
            finalUrl = url;

        viewModel.parseUrl(finalUrl)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new DisposableSingleObserver<List<ParsingResult>>() {
                    @Override
                    public void onSuccess(List<ParsingResult> parsingResultList) {
                        displayParseResults(parsingResultList);
                    }

                    @Override
                    public void onError(Throwable e) {
                        Utils.showSnackbar(binding.addFeedRoot, e.getMessage());
                        binding.addFeedLoading.setVisibility(View.GONE);
                    }
                });
    }

    private void displayParseResults(List<ParsingResult> parsingResultList) {
        binding.addFeedLoading.setVisibility(View.GONE);

        if (!parsingResultList.isEmpty()) {
            binding.addFeedResultsTextView.setVisibility(View.VISIBLE);
            binding.addFeedResults.setVisibility(View.VISIBLE);

            DiffUtil.DiffResult diffResult = FastAdapterDiffUtil.calculateDiff(parseItemsAdapter, parsingResultList, new DiffCallback<ParsingResult>() {
                @Override
                public boolean areItemsTheSame(ParsingResult oldItem, ParsingResult newItem) {
                    return oldItem.getUrl().equals(newItem.getUrl());
                }

                @Override
                public boolean areContentsTheSame(ParsingResult oldItem, ParsingResult newItem) {
                    return oldItem.getUrl().equals(newItem.getUrl()) &&
                            oldItem.isChecked() == newItem.isChecked();
                }

                @Nullable
                @Override
                public Object getChangePayload(ParsingResult oldItem, int oldItemPosition, ParsingResult newItem, int newItemPosition) {
                    newItem.setChecked(oldItem.isChecked());
                    return newItem;
                }
            }, false);

            FastAdapterDiffUtil.set(parseItemsAdapter, diffResult);
            binding.addFeedOk.setEnabled(recyclerViewHasCheckedItems());
        } else {
            parseItemsAdapter.clear();
            binding.addFeedResultsTextView.setVisibility(View.GONE);
            binding.addFeedResults.setVisibility(View.GONE);

            binding.addFeedLoadingMessage.setVisibility(View.VISIBLE);
            binding.addFeedLoadingMessage.setText(R.string.no_feed_found);
        }
    }

    private void insertFeeds() {
        binding.addFeedInsertProgressbar.setVisibility(View.VISIBLE);
        binding.addFeedOk.setEnabled(false);

        List<ParsingResult> feedsToInsert = new ArrayList<>();
        for (ParsingResult result : parseItemsAdapter.getAdapterItems()) {
            if (result.isChecked())
                feedsToInsert.add(result);
        }

        Account account = (Account) binding.addFeedAccountSpinner.getSelectedItem();

        account.setLogin(SharedPreferencesManager.readString(account.getLoginKey()));
        account.setPassword(SharedPreferencesManager.readString(account.getPasswordKey()));

        viewModel.addFeeds(feedsToInsert, account)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new DisposableSingleObserver<List<FeedInsertionResult>>() {
                    @Override
                    public void onSuccess(List<FeedInsertionResult> feedInsertionResults) {
                        displayInsertionResults(feedInsertionResults);
                    }

                    @Override
                    public void onError(Throwable e) {
                        binding.addFeedInsertProgressbar.setVisibility(View.GONE);
                        binding.addFeedOk.setEnabled(true);
                        Utils.showSnackbar(binding.addFeedRoot, e.getMessage());
                    }
                });
    }

    private void displayInsertionResults(List<FeedInsertionResult> feedInsertionResults) {
        binding.addFeedInsertProgressbar.setVisibility(View.GONE);
        binding.addFeedInsertedResultsRecyclerview.setVisibility(View.VISIBLE);

        for (FeedInsertionResult feedInsertionResult : feedInsertionResults) {
            if (feedInsertionResult.getFeed() != null)
                feedsToUpdate.add(feedInsertionResult.getFeed());

            disableParsingResult(feedInsertionResult.getParsingResult());
        }

        insertionResultsAdapter.add(feedInsertionResults);
        binding.addFeedOk.setEnabled(recyclerViewHasCheckedItems());
    }


    @Override
    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void finish() {
        if (!feedsToUpdate.isEmpty()) {
            Intent intent = new Intent();
            intent.putParcelableArrayListExtra(FEEDS, feedsToUpdate);

            setResult(RESULT_OK, intent);
        }

        super.finish();
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_ENTER) {
            onClick(binding.addFeedLoad);
            return true;
        }

        return super.onKeyUp(keyCode, event);
    }
}
