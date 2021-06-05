// Generated by view binder compiler. Do not edit!
package com.readrops.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.readrops.app.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FeedOptionsLayoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView feedEditFeed;

  @NonNull
  public final TextView feedOpenRoot;

  @NonNull
  public final TextView feedOptionsDelete;

  @NonNull
  public final LinearLayout feedOptionsDeleteLayout;

  @NonNull
  public final LinearLayout feedOptionsEditLayout;

  @NonNull
  public final LinearLayout feedOptionsOpenRootLayout;

  @NonNull
  public final TextView feedOptionsTitle;

  private FeedOptionsLayoutBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView feedEditFeed, @NonNull TextView feedOpenRoot,
      @NonNull TextView feedOptionsDelete, @NonNull LinearLayout feedOptionsDeleteLayout,
      @NonNull LinearLayout feedOptionsEditLayout, @NonNull LinearLayout feedOptionsOpenRootLayout,
      @NonNull TextView feedOptionsTitle) {
    this.rootView = rootView;
    this.feedEditFeed = feedEditFeed;
    this.feedOpenRoot = feedOpenRoot;
    this.feedOptionsDelete = feedOptionsDelete;
    this.feedOptionsDeleteLayout = feedOptionsDeleteLayout;
    this.feedOptionsEditLayout = feedOptionsEditLayout;
    this.feedOptionsOpenRootLayout = feedOptionsOpenRootLayout;
    this.feedOptionsTitle = feedOptionsTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FeedOptionsLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FeedOptionsLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.feed_options_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FeedOptionsLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.feed_edit_feed;
      TextView feedEditFeed = rootView.findViewById(id);
      if (feedEditFeed == null) {
        break missingId;
      }

      id = R.id.feed_open_root;
      TextView feedOpenRoot = rootView.findViewById(id);
      if (feedOpenRoot == null) {
        break missingId;
      }

      id = R.id.feed_options_delete;
      TextView feedOptionsDelete = rootView.findViewById(id);
      if (feedOptionsDelete == null) {
        break missingId;
      }

      id = R.id.feed_options_delete_layout;
      LinearLayout feedOptionsDeleteLayout = rootView.findViewById(id);
      if (feedOptionsDeleteLayout == null) {
        break missingId;
      }

      id = R.id.feed_options_edit_layout;
      LinearLayout feedOptionsEditLayout = rootView.findViewById(id);
      if (feedOptionsEditLayout == null) {
        break missingId;
      }

      id = R.id.feed_options_open_root_layout;
      LinearLayout feedOptionsOpenRootLayout = rootView.findViewById(id);
      if (feedOptionsOpenRootLayout == null) {
        break missingId;
      }

      id = R.id.feed_options_title;
      TextView feedOptionsTitle = rootView.findViewById(id);
      if (feedOptionsTitle == null) {
        break missingId;
      }

      return new FeedOptionsLayoutBinding((ConstraintLayout) rootView, feedEditFeed, feedOpenRoot,
          feedOptionsDelete, feedOptionsDeleteLayout, feedOptionsEditLayout,
          feedOptionsOpenRootLayout, feedOptionsTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
