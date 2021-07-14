package com.devops.redrops.app.feedsfolders.feeds;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.devops.redrops.app.R;
import com.devops.redrops.app.feedsfolders.ManageFeedsFoldersViewModel;
import com.google.android.material.textfield.TextInputEditText;
import com.readrops.db.entities.Feed;
import com.readrops.db.entities.Folder;
import com.readrops.db.entities.account.Account;
import com.readrops.db.pojo.FeedWithFolder;

import org.koin.androidx.viewmodel.compat.SharedViewModelCompat;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

import static com.devops.redrops.app.utils.ReadropsKeys.ACCOUNT;


public class EditFeedDialogFragment extends DialogFragment implements AdapterView.OnItemSelectedListener {

    private TextInputEditText feedName;
    private TextInputEditText feedUrl;
    private Spinner folder;

    private Map<String, Integer> values;

    private FeedWithFolder feedWithFolder;
    private Account account;
    private ManageFeedsFoldersViewModel viewModel;

    public EditFeedDialogFragment() {
    }

    public static EditFeedDialogFragment newInstance(FeedWithFolder feedWithFolder, Account account) {
        Bundle args = new Bundle();
        args.putParcelable("feedWithFolder", feedWithFolder);
        args.putParcelable(ACCOUNT, account);

        EditFeedDialogFragment fragment = new EditFeedDialogFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        viewModel = SharedViewModelCompat.getSharedViewModel(this, ManageFeedsFoldersViewModel.class);

        feedWithFolder = getArguments().getParcelable("feedWithFolder");
        account = getArguments().getParcelable(ACCOUNT);

        viewModel.setAccount(account);

        View v = getActivity().getLayoutInflater().inflate(R.layout.edit_feed_layout, null);

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity())
                .setTitle(R.string.edit_feed)
                .setPositiveButton(R.string.validate, (dialog, which) -> {
                    Feed feed = feedWithFolder.getFeed();
                    feed.setName(feedName.getText().toString().trim());
                    feed.setUrl(feedUrl.getText().toString().trim());

                    viewModel.updateFeedWithFolder(feed)
                            .subscribeOn(Schedulers.io())
                            .observeOn(AndroidSchedulers.mainThread())
                            .subscribe();
                });

        builder.setView(v);
        fillData(v);

        viewModel.getFolders().observe(this, folders -> {
            values = new TreeMap<>(String::compareTo);

            if (!account.getAccountType().getAccountConfig().isNoFolderCase())
                values.put(getString(R.string.no_folder), 0);

            for (Folder folder : folders) {
                values.put(folder.getName(), folder.getId());
            }

            ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),
                    android.R.layout.simple_spinner_dropdown_item, new ArrayList<>(values.keySet()));
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            folder.setAdapter(adapter);
            folder.setOnItemSelectedListener(this);

            if (feedWithFolder.getFolder() != null)
                folder.setSelection(adapter.getPosition(feedWithFolder.getFolder().getName()));
            else
                folder.setSelection(adapter.getPosition(getString(R.string.no_folder)));
        });

        return builder.create();
    }

    private void fillData(View v) {
        feedName = v.findViewById(R.id.edit_feed_name_edit_text);
        feedUrl = v.findViewById(R.id.edit_feed_url_edit_text);
        folder = v.findViewById(R.id.edit_feed_folder_spinner);

        if (!account.getAccountType().getAccountConfig().isFeedUrlEditable())
            feedUrl.setEnabled(false);

        feedName.setText(feedWithFolder.getFeed().getName());
        feedUrl.setText(feedWithFolder.getFeed().getUrl());
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String folderName = (String) parent.getAdapter().getItem(position);
        int folderId = values.get(folderName);

        feedWithFolder.getFeed().setFolderId(folderId == 0 ? null : folderId);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
