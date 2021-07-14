package com.readrops.app.notifications.sync;

import java.lang.System;

/**
 * Simple class to get synchro notification content (title, content and largeIcon) according to some rules
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0007H\u0002J\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0002J\u0006\u0010\u0015\u001a\u00020\u0010J\u001e\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00122\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0017H\u0002J\u001e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00132\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u0012H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/readrops/app/notifications/sync/SyncResultAnalyser;", "Lorg/koin/core/KoinComponent;", "context", "Landroid/content/Context;", "syncResults", "", "Lcom/readrops/db/entities/account/Account;", "Lcom/readrops/api/services/SyncResult;", "database", "Lcom/readrops/db/Database;", "(Landroid/content/Context;Ljava/util/Map;Lcom/readrops/db/Database;)V", "getContext", "()Landroid/content/Context;", "getDatabase", "()Lcom/readrops/db/Database;", "notifContent", "Lcom/readrops/app/notifications/sync/SyncResultNotifContent;", "getFeedsIdsForNewItems", "", "", "syncResult", "getSyncNotifContent", "isFeedNotificationEnabledForItem", "", "feeds", "Lcom/readrops/db/entities/Feed;", "item", "Lcom/readrops/db/entities/Item;", "newItemsInMultipleAccounts", "oneFeedCase", "", "feedId", "items", "app_debug"})
public final class SyncResultAnalyser implements org.koin.core.KoinComponent {
    private final com.readrops.app.notifications.sync.SyncResultNotifContent notifContent = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final java.util.Map<com.readrops.db.entities.account.Account, com.readrops.api.services.SyncResult> syncResults = null;
    @org.jetbrains.annotations.NotNull()
    private final com.readrops.db.Database database = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.readrops.app.notifications.sync.SyncResultNotifContent getSyncNotifContent() {
        return null;
    }
    
    private final void oneFeedCase(long feedId, java.util.List<? extends com.readrops.db.entities.Item> items) {
    }
    
    private final boolean newItemsInMultipleAccounts() {
        return false;
    }
    
    private final java.util.List<java.lang.Long> getFeedsIdsForNewItems(com.readrops.api.services.SyncResult syncResult) {
        return null;
    }
    
    private final java.util.List<java.lang.Long> getFeedsIdsForNewItems(java.util.Map<com.readrops.db.entities.account.Account, com.readrops.api.services.SyncResult> syncResults) {
        return null;
    }
    
    private final boolean isFeedNotificationEnabledForItem(java.util.List<? extends com.readrops.db.entities.Feed> feeds, com.readrops.db.entities.Item item) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.readrops.db.Database getDatabase() {
        return null;
    }
    
    public SyncResultAnalyser(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.Map<com.readrops.db.entities.account.Account, com.readrops.api.services.SyncResult> syncResults, @org.jetbrains.annotations.NotNull()
    com.readrops.db.Database database) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
}