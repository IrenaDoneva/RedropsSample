package com.readrops.app.notifications;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/readrops/app/notifications/NotificationPermissionActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/readrops/app/notifications/NotificationPermissionListAdapter;", "binding", "Lcom/readrops/app/databinding/ActivityNotificationPermissionBinding;", "feedStateChanged", "", "feeds", "", "Lcom/readrops/db/entities/Feed;", "isFirstCheck", "viewModel", "Lcom/readrops/app/notifications/NotificationPermissionViewModel;", "canUpdateAllFeedsPermissions", "isChecked", "displayAutoSynchroPopup", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "setupUI", "account", "Lcom/readrops/db/entities/account/Account;", "app_debug"})
public final class NotificationPermissionActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.readrops.app.databinding.ActivityNotificationPermissionBinding binding;
    private com.readrops.app.notifications.NotificationPermissionViewModel viewModel;
    private com.readrops.app.notifications.NotificationPermissionListAdapter adapter;
    private boolean isFirstCheck = true;
    private boolean feedStateChanged = false;
    private java.util.List<? extends com.readrops.db.entities.Feed> feeds;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupUI(com.readrops.db.entities.account.Account account) {
    }
    
    /**
     * Inform if is possible to update all feeds notifications permissions in the same time.
     * The method takes into account the following states :
     * - first check : when opening the activity with all feeds permissions enabled,
     * the enable all feeds permissions switch will be checked but the request mustn't be executed
     * - feed state : if all feeds permissions are enabled and a feed permission is disabled,
     * the enable all feeds permissions switch will be unchecked but the request mustn't be executed as only one feed permission is disabled
     * - all feeds permissions switch checked : if the setOnCheckedChangeListener method is triggered because all feeds permissions were enabled,
     * do not execute the request as it would be pointless
     */
    private final boolean canUpdateAllFeedsPermissions(boolean isChecked) {
        return false;
    }
    
    private final void displayAutoSynchroPopup() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public NotificationPermissionActivity() {
        super();
    }
}