package com.readrops.app.notifications;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\rJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001a"}, d2 = {"Lcom/readrops/app/notifications/NotificationPermissionViewModel;", "Landroidx/lifecycle/ViewModel;", "database", "Lcom/readrops/db/Database;", "(Lcom/readrops/db/Database;)V", "account", "Lcom/readrops/db/entities/account/Account;", "getAccount", "()Lcom/readrops/db/entities/account/Account;", "setAccount", "(Lcom/readrops/db/entities/account/Account;)V", "getDatabase", "()Lcom/readrops/db/Database;", "Landroidx/lifecycle/LiveData;", "accountId", "", "getFeedsWithNotifPermission", "", "Lcom/readrops/db/entities/Feed;", "setAccountNotificationsState", "Lio/reactivex/Completable;", "enabled", "", "setAllFeedsNotificationState", "setFeedNotificationState", "feed", "app_debug"})
public final class NotificationPermissionViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.Nullable()
    private com.readrops.db.entities.account.Account account;
    @org.jetbrains.annotations.NotNull()
    private final com.readrops.db.Database database = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.readrops.db.entities.account.Account getAccount() {
        return null;
    }
    
    public final void setAccount(@org.jetbrains.annotations.Nullable()
    com.readrops.db.entities.account.Account p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.readrops.db.entities.account.Account> getAccount(int accountId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.readrops.db.entities.Feed>> getFeedsWithNotifPermission() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable setAccountNotificationsState(boolean enabled) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable setFeedNotificationState(@org.jetbrains.annotations.NotNull()
    com.readrops.db.entities.Feed feed) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable setAllFeedsNotificationState(boolean enabled) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.readrops.db.Database getDatabase() {
        return null;
    }
    
    public NotificationPermissionViewModel(@org.jetbrains.annotations.NotNull()
    com.readrops.db.Database database) {
        super();
    }
}