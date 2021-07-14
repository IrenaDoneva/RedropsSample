// Generated by view binder compiler. Do not edit!
package com.readrops.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.readrops.app.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAddFeedBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final Spinner addFeedAccountSpinner;

  @NonNull
  public final TextInputLayout addFeedInputLayout;

  @NonNull
  public final ProgressBar addFeedInsertProgressbar;

  @NonNull
  public final RecyclerView addFeedInsertedResultsRecyclerview;

  @NonNull
  public final Button addFeedLoad;

  @NonNull
  public final ProgressBar addFeedLoading;

  @NonNull
  public final TextView addFeedLoadingMessage;

  @NonNull
  public final ConstraintLayout addFeedMainLayout;

  @NonNull
  public final Button addFeedOk;

  @NonNull
  public final RecyclerView addFeedResults;

  @NonNull
  public final TextView addFeedResultsTextView;

  @NonNull
  public final NestedScrollView addFeedRoot;

  @NonNull
  public final TextInputEditText addFeedTextInput;

  private ActivityAddFeedBinding(@NonNull NestedScrollView rootView,
      @NonNull Spinner addFeedAccountSpinner, @NonNull TextInputLayout addFeedInputLayout,
      @NonNull ProgressBar addFeedInsertProgressbar,
      @NonNull RecyclerView addFeedInsertedResultsRecyclerview, @NonNull Button addFeedLoad,
      @NonNull ProgressBar addFeedLoading, @NonNull TextView addFeedLoadingMessage,
      @NonNull ConstraintLayout addFeedMainLayout, @NonNull Button addFeedOk,
      @NonNull RecyclerView addFeedResults, @NonNull TextView addFeedResultsTextView,
      @NonNull NestedScrollView addFeedRoot, @NonNull TextInputEditText addFeedTextInput) {
    this.rootView = rootView;
    this.addFeedAccountSpinner = addFeedAccountSpinner;
    this.addFeedInputLayout = addFeedInputLayout;
    this.addFeedInsertProgressbar = addFeedInsertProgressbar;
    this.addFeedInsertedResultsRecyclerview = addFeedInsertedResultsRecyclerview;
    this.addFeedLoad = addFeedLoad;
    this.addFeedLoading = addFeedLoading;
    this.addFeedLoadingMessage = addFeedLoadingMessage;
    this.addFeedMainLayout = addFeedMainLayout;
    this.addFeedOk = addFeedOk;
    this.addFeedResults = addFeedResults;
    this.addFeedResultsTextView = addFeedResultsTextView;
    this.addFeedRoot = addFeedRoot;
    this.addFeedTextInput = addFeedTextInput;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddFeedBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddFeedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_feed, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddFeedBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.add_feed_account_spinner;
      Spinner addFeedAccountSpinner = rootView.findViewById(id);
      if (addFeedAccountSpinner == null) {
        break missingId;
      }

      id = R.id.add_feed_input_layout;
      TextInputLayout addFeedInputLayout = rootView.findViewById(id);
      if (addFeedInputLayout == null) {
        break missingId;
      }

      id = R.id.add_feed_insert_progressbar;
      ProgressBar addFeedInsertProgressbar = rootView.findViewById(id);
      if (addFeedInsertProgressbar == null) {
        break missingId;
      }

      id = R.id.add_feed_inserted_results_recyclerview;
      RecyclerView addFeedInsertedResultsRecyclerview = rootView.findViewById(id);
      if (addFeedInsertedResultsRecyclerview == null) {
        break missingId;
      }

      id = R.id.add_feed_load;
      Button addFeedLoad = rootView.findViewById(id);
      if (addFeedLoad == null) {
        break missingId;
      }

      id = R.id.add_feed_loading;
      ProgressBar addFeedLoading = rootView.findViewById(id);
      if (addFeedLoading == null) {
        break missingId;
      }

      id = R.id.add_feed_loading_message;
      TextView addFeedLoadingMessage = rootView.findViewById(id);
      if (addFeedLoadingMessage == null) {
        break missingId;
      }

      id = R.id.add_feed_main_layout;
      ConstraintLayout addFeedMainLayout = rootView.findViewById(id);
      if (addFeedMainLayout == null) {
        break missingId;
      }

      id = R.id.add_feed_ok;
      Button addFeedOk = rootView.findViewById(id);
      if (addFeedOk == null) {
        break missingId;
      }

      id = R.id.add_feed_results;
      RecyclerView addFeedResults = rootView.findViewById(id);
      if (addFeedResults == null) {
        break missingId;
      }

      id = R.id.add_feed_results_text_view;
      TextView addFeedResultsTextView = rootView.findViewById(id);
      if (addFeedResultsTextView == null) {
        break missingId;
      }

      NestedScrollView addFeedRoot = (NestedScrollView) rootView;

      id = R.id.add_feed_text_input;
      TextInputEditText addFeedTextInput = rootView.findViewById(id);
      if (addFeedTextInput == null) {
        break missingId;
      }

      return new ActivityAddFeedBinding((NestedScrollView) rootView, addFeedAccountSpinner,
          addFeedInputLayout, addFeedInsertProgressbar, addFeedInsertedResultsRecyclerview,
          addFeedLoad, addFeedLoading, addFeedLoadingMessage, addFeedMainLayout, addFeedOk,
          addFeedResults, addFeedResultsTextView, addFeedRoot, addFeedTextInput);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
