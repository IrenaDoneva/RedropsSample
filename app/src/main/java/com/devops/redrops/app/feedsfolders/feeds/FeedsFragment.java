package com.devops.redrops.app.feedsfolders.feeds;


import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.afollestad.materialdialogs.MaterialDialog;
import com.devops.redrops.app.R;
import com.devops.redrops.app.databinding.FragmentFeedsBinding;
import com.devops.redrops.app.feedsfolders.ManageFeedsFoldersViewModel;
import com.devops.redrops.app.utils.SharedPreferencesManager;
import com.devops.redrops.app.utils.Utils;
import com.readrops.db.entities.Feed;
import com.readrops.db.entities.account.Account;
import com.readrops.db.pojo.FeedWithFolder;

import org.koin.androidx.viewmodel.compat.SharedViewModelCompat;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableCompletableObserver;
import io.reactivex.schedulers.Schedulers;

import static com.devops.redrops.app.utils.ReadropsKeys.ACCOUNT;


public class FeedsFragment extends Fragment {

    private FeedsAdapter adapter;
    private ManageFeedsFoldersViewModel viewModel;
    private Account account;

    private FragmentFeedsBinding binding;

    public FeedsFragment() {
        // Required empty public constructor
    }

    public static FeedsFragment newInstance(Account account) {
        FeedsFragment fragment = new FeedsFragment();
        Bundle args = new Bundle();

        args.putParcelable(ACCOUNT, account);
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        account = getArguments().getParcelable(ACCOUNT);

        if (account.getLogin() == null)
            account.setLogin(SharedPreferencesManager.readString(account.getLoginKey()));
        if (account.getPassword() == null)
            account.setPassword(SharedPreferencesManager.readString(account.getPasswordKey()));

        viewModel = SharedViewModelCompat.getSharedViewModel(this, ManageFeedsFoldersViewModel.class);
        viewModel.setAccount(account);

        viewModel.getFeedsWithFolder().observe(this, feedWithFolders -> {
            adapter.submitList(feedWithFolders);

            if (feedWithFolders.size() > 0) {
                binding.feedsEmptyList.setVisibility(View.GONE);
            } else {
                binding.feedsEmptyList.setVisibility(View.VISIBLE);
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFeedsBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.feedsRecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));

        adapter = new FeedsAdapter(new FeedsAdapter.ManageFeedsListener() {
            @Override
            public void onEdit(FeedWithFolder feedWithFolder) {
                openFeedOptionsFragment(feedWithFolder);
            }

            @Override
            public void onOpenLink(FeedWithFolder feedWithFolder) {
            }
        });

        binding.feedsRecyclerview.setAdapter(adapter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void deleteFeed(Feed feed) {
        new MaterialDialog.Builder(getContext())
                .title(R.string.delete_feed)
                .positiveText(R.string.validate)
                .negativeText(R.string.cancel)
                .onPositive((dialog, which) -> viewModel.deleteFeed(feed)
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new DisposableCompletableObserver() {
                            @Override
                            public void onComplete() {
                                Utils.showSnackbar(binding.feedsRoot,
                                        getString(R.string.feed_deleted, feed.getName()));
                            }

                            @Override
                            public void onError(Throwable e) {
                                String message;
                                if (e instanceof Resources.NotFoundException)
                                    message = getString(R.string.feed_doesnt_exist, feed.getName());
                                else
                                    message = getString(R.string.error_occured);

                                Utils.showSnackbar(binding.feedsRoot, message);
                            }
                        }))
                .show();
    }

    private void openFeedOptionsFragment(FeedWithFolder feedWithFolder) {
        FeedOptionsDialogFragment dialogFragment = FeedOptionsDialogFragment.Companion.newInstance(feedWithFolder, account);

        getChildFragmentManager()
                .beginTransaction()
                .add(dialogFragment, "")
                .commit();
    }
}
