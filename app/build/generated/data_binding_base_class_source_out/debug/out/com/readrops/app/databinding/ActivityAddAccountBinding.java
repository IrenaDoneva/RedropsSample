// Generated by view binder compiler. Do not edit!
package com.readrops.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.readrops.app.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAddAccountBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final ProgressBar addAccountLoading;

  @NonNull
  public final TextInputEditText addAccountLogin;

  @NonNull
  public final TextInputLayout addAccountLoginLayout;

  @NonNull
  public final TextInputEditText addAccountName;

  @NonNull
  public final TextInputLayout addAccountNameLayout;

  @NonNull
  public final TextInputEditText addAccountPassword;

  @NonNull
  public final TextInputLayout addAccountPasswordLayout;

  @NonNull
  public final ConstraintLayout addAccountRoot;

  @NonNull
  public final TextInputEditText addAccountUrl;

  @NonNull
  public final TextInputLayout addAccountUrlLayout;

  @NonNull
  public final Button addAccountValidate;

  @NonNull
  public final ImageView providerImage;

  @NonNull
  public final TextView providerName;

  private ActivityAddAccountBinding(@NonNull NestedScrollView rootView,
      @NonNull ProgressBar addAccountLoading, @NonNull TextInputEditText addAccountLogin,
      @NonNull TextInputLayout addAccountLoginLayout, @NonNull TextInputEditText addAccountName,
      @NonNull TextInputLayout addAccountNameLayout, @NonNull TextInputEditText addAccountPassword,
      @NonNull TextInputLayout addAccountPasswordLayout, @NonNull ConstraintLayout addAccountRoot,
      @NonNull TextInputEditText addAccountUrl, @NonNull TextInputLayout addAccountUrlLayout,
      @NonNull Button addAccountValidate, @NonNull ImageView providerImage,
      @NonNull TextView providerName) {
    this.rootView = rootView;
    this.addAccountLoading = addAccountLoading;
    this.addAccountLogin = addAccountLogin;
    this.addAccountLoginLayout = addAccountLoginLayout;
    this.addAccountName = addAccountName;
    this.addAccountNameLayout = addAccountNameLayout;
    this.addAccountPassword = addAccountPassword;
    this.addAccountPasswordLayout = addAccountPasswordLayout;
    this.addAccountRoot = addAccountRoot;
    this.addAccountUrl = addAccountUrl;
    this.addAccountUrlLayout = addAccountUrlLayout;
    this.addAccountValidate = addAccountValidate;
    this.providerImage = providerImage;
    this.providerName = providerName;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddAccountBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddAccountBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_account, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddAccountBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.add_account_loading;
      ProgressBar addAccountLoading = rootView.findViewById(id);
      if (addAccountLoading == null) {
        break missingId;
      }

      id = R.id.add_account_login;
      TextInputEditText addAccountLogin = rootView.findViewById(id);
      if (addAccountLogin == null) {
        break missingId;
      }

      id = R.id.add_account_login_layout;
      TextInputLayout addAccountLoginLayout = rootView.findViewById(id);
      if (addAccountLoginLayout == null) {
        break missingId;
      }

      id = R.id.add_account_name;
      TextInputEditText addAccountName = rootView.findViewById(id);
      if (addAccountName == null) {
        break missingId;
      }

      id = R.id.add_account_name_layout;
      TextInputLayout addAccountNameLayout = rootView.findViewById(id);
      if (addAccountNameLayout == null) {
        break missingId;
      }

      id = R.id.add_account_password;
      TextInputEditText addAccountPassword = rootView.findViewById(id);
      if (addAccountPassword == null) {
        break missingId;
      }

      id = R.id.add_account_password_layout;
      TextInputLayout addAccountPasswordLayout = rootView.findViewById(id);
      if (addAccountPasswordLayout == null) {
        break missingId;
      }

      id = R.id.add_account_root;
      ConstraintLayout addAccountRoot = rootView.findViewById(id);
      if (addAccountRoot == null) {
        break missingId;
      }

      id = R.id.add_account_url;
      TextInputEditText addAccountUrl = rootView.findViewById(id);
      if (addAccountUrl == null) {
        break missingId;
      }

      id = R.id.add_account_url_layout;
      TextInputLayout addAccountUrlLayout = rootView.findViewById(id);
      if (addAccountUrlLayout == null) {
        break missingId;
      }

      id = R.id.add_account_validate;
      Button addAccountValidate = rootView.findViewById(id);
      if (addAccountValidate == null) {
        break missingId;
      }

      id = R.id.provider_image;
      ImageView providerImage = rootView.findViewById(id);
      if (providerImage == null) {
        break missingId;
      }

      id = R.id.provider_name;
      TextView providerName = rootView.findViewById(id);
      if (providerName == null) {
        break missingId;
      }

      return new ActivityAddAccountBinding((NestedScrollView) rootView, addAccountLoading,
          addAccountLogin, addAccountLoginLayout, addAccountName, addAccountNameLayout,
          addAccountPassword, addAccountPasswordLayout, addAccountRoot, addAccountUrl,
          addAccountUrlLayout, addAccountValidate, providerImage, providerName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
