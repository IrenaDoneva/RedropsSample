package com.readrops.app.notifications.sync;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/readrops/app/notifications/sync/SyncResultDebugData;", "", "()V", "Companion", "app_debug"})
public final class SyncResultDebugData {
    @org.jetbrains.annotations.NotNull()
    public static final com.readrops.app.notifications.sync.SyncResultDebugData.Companion Companion = null;
    
    public SyncResultDebugData() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004J\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004J\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004J\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a8\u0006\n"}, d2 = {"Lcom/readrops/app/notifications/sync/SyncResultDebugData$Companion;", "Lorg/koin/core/KoinComponent;", "()V", "multipleAccounts", "", "Lcom/readrops/db/entities/account/Account;", "Lcom/readrops/api/services/SyncResult;", "oneAccountMultipleFeeds", "oneAccountOneFeedMultipleItems", "oneAccountOneFeedOneItem", "app_debug"})
    public static final class Companion implements org.koin.core.KoinComponent {
        
        @org.jetbrains.annotations.NotNull()
        @org.jetbrains.annotations.TestOnly()
        public final java.util.Map<com.readrops.db.entities.account.Account, com.readrops.api.services.SyncResult> oneAccountOneFeedOneItem() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @org.jetbrains.annotations.TestOnly()
        public final java.util.Map<com.readrops.db.entities.account.Account, com.readrops.api.services.SyncResult> oneAccountOneFeedMultipleItems() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @org.jetbrains.annotations.TestOnly()
        public final java.util.Map<com.readrops.db.entities.account.Account, com.readrops.api.services.SyncResult> oneAccountMultipleFeeds() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<com.readrops.db.entities.account.Account, com.readrops.api.services.SyncResult> multipleAccounts() {
            return null;
        }
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public org.koin.core.Koin getKoin() {
            return null;
        }
    }
}