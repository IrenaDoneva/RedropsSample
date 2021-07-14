package com.readrops.app.notifications;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001f2\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u00012\u00020\u0004:\u0002\u001f B0\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\b\u00a2\u0006\u0002\u0010\rJ\u001c\u0010\u0014\u001a\u00020\f2\n\u0010\u0015\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J*\u0010\u0014\u001a\u00020\f2\n\u0010\u0015\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016J\u001c\u0010\u001b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0017H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R,\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006!"}, d2 = {"Lcom/readrops/app/notifications/NotificationPermissionListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/readrops/db/entities/Feed;", "Lcom/readrops/app/notifications/NotificationPermissionListAdapter$NotificationPermissionViewHolder;", "Lorg/koin/core/KoinComponent;", "enableAll", "", "listener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "feed", "", "(ZLkotlin/jvm/functions/Function1;)V", "getEnableAll", "()Z", "setEnableAll", "(Z)V", "getListener", "()Lkotlin/jvm/functions/Function1;", "onBindViewHolder", "holder", "position", "", "payloads", "", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "NotificationPermissionViewHolder", "app_debug"})
public final class NotificationPermissionListAdapter extends androidx.recyclerview.widget.ListAdapter<com.readrops.db.entities.Feed, com.readrops.app.notifications.NotificationPermissionListAdapter.NotificationPermissionViewHolder> implements org.koin.core.KoinComponent {
    private boolean enableAll;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.readrops.db.entities.Feed, kotlin.Unit> listener = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.readrops.db.entities.Feed> DIFF_CALLBACK = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.readrops.app.notifications.NotificationPermissionListAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.readrops.app.notifications.NotificationPermissionListAdapter.NotificationPermissionViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.readrops.app.notifications.NotificationPermissionListAdapter.NotificationPermissionViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.readrops.app.notifications.NotificationPermissionListAdapter.NotificationPermissionViewHolder holder, int position, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Object> payloads) {
    }
    
    public final boolean getEnableAll() {
        return false;
    }
    
    public final void setEnableAll(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.readrops.db.entities.Feed, kotlin.Unit> getListener() {
        return null;
    }
    
    public NotificationPermissionListAdapter(boolean enableAll, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.readrops.db.entities.Feed, kotlin.Unit> listener) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/readrops/app/notifications/NotificationPermissionListAdapter$NotificationPermissionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/readrops/app/databinding/NotificationPermissionLayoutBinding;", "(Lcom/readrops/app/notifications/NotificationPermissionListAdapter;Lcom/readrops/app/databinding/NotificationPermissionLayoutBinding;)V", "getBinding", "()Lcom/readrops/app/databinding/NotificationPermissionLayoutBinding;", "app_debug"})
    public final class NotificationPermissionViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.readrops.app.databinding.NotificationPermissionLayoutBinding binding = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.readrops.app.databinding.NotificationPermissionLayoutBinding getBinding() {
            return null;
        }
        
        public NotificationPermissionViewHolder(@org.jetbrains.annotations.NotNull()
        com.readrops.app.databinding.NotificationPermissionLayoutBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/readrops/app/notifications/NotificationPermissionListAdapter$Companion;", "", "()V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/readrops/db/entities/Feed;", "getDIFF_CALLBACK", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.readrops.db.entities.Feed> getDIFF_CALLBACK() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}