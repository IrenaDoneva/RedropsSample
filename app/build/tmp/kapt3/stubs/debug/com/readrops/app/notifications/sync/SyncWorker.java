package com.readrops.app.notifications.sync;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0003\u001c\u001d\u001eB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u001c\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0014H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/readrops/app/notifications/sync/SyncWorker;", "Landroidx/work/Worker;", "Lorg/koin/core/KoinComponent;", "context", "Landroid/content/Context;", "parameters", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "database", "Lcom/readrops/db/Database;", "disposable", "Lio/reactivex/disposables/Disposable;", "notificationManager", "Landroidx/core/app/NotificationManagerCompat;", "buildMarkAsRead", "Landroidx/core/app/NotificationCompat$Action;", "item", "Lcom/readrops/db/entities/Item;", "buildReadlaterAction", "displaySyncResultNotif", "", "syncResults", "", "Lcom/readrops/db/entities/account/Account;", "Lcom/readrops/api/services/SyncResult;", "doWork", "Landroidx/work/ListenableWorker$Result;", "onStopped", "Companion", "MarkReadReceiver", "ReadLaterReceiver", "app_debug"})
public final class SyncWorker extends androidx.work.Worker implements org.koin.core.KoinComponent {
    private io.reactivex.disposables.Disposable disposable;
    private final androidx.core.app.NotificationManagerCompat notificationManager = null;
    private final com.readrops.db.Database database = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = null;
    private static final int SYNC_NOTIFICATION_ID = 2;
    public static final int SYNC_RESULT_NOTIFICATION_ID = 3;
    @org.jetbrains.annotations.NotNull()
    public static final com.readrops.app.notifications.sync.SyncWorker.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.work.ListenableWorker.Result doWork() {
        return null;
    }
    
    @java.lang.Override()
    public void onStopped() {
    }
    
    private final void displaySyncResultNotif(java.util.Map<com.readrops.db.entities.account.Account, com.readrops.api.services.SyncResult> syncResults) {
    }
    
    private final androidx.core.app.NotificationCompat.Action buildReadlaterAction(com.readrops.db.entities.Item item) {
        return null;
    }
    
    private final androidx.core.app.NotificationCompat.Action buildMarkAsRead(com.readrops.db.entities.Item item) {
        return null;
    }
    
    public SyncWorker(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.work.WorkerParameters parameters) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016\u00a8\u0006\n"}, d2 = {"Lcom/readrops/app/notifications/sync/SyncWorker$MarkReadReceiver;", "Landroid/content/BroadcastReceiver;", "Lorg/koin/core/KoinComponent;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_debug"})
    public static final class MarkReadReceiver extends android.content.BroadcastReceiver implements org.koin.core.KoinComponent {
        
        @java.lang.Override()
        public void onReceive(@org.jetbrains.annotations.Nullable()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        android.content.Intent intent) {
        }
        
        public MarkReadReceiver() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public org.koin.core.Koin getKoin() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016\u00a8\u0006\n"}, d2 = {"Lcom/readrops/app/notifications/sync/SyncWorker$ReadLaterReceiver;", "Landroid/content/BroadcastReceiver;", "Lorg/koin/core/KoinComponent;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_debug"})
    public static final class ReadLaterReceiver extends android.content.BroadcastReceiver implements org.koin.core.KoinComponent {
        
        @java.lang.Override()
        public void onReceive(@org.jetbrains.annotations.Nullable()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        android.content.Intent intent) {
        }
        
        public ReadLaterReceiver() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public org.koin.core.Koin getKoin() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/readrops/app/notifications/sync/SyncWorker$Companion;", "", "()V", "SYNC_NOTIFICATION_ID", "", "SYNC_RESULT_NOTIFICATION_ID", "TAG", "", "getTAG", "()Ljava/lang/String;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTAG() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}