package com.readrops.api.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u00002\u00020\u0001Ba\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u0012R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0010\"\u0004\b\u001d\u0010\u0012\u00a8\u0006\u001e"}, d2 = {"Lcom/readrops/api/services/SyncResult;", "", "items", "", "Lcom/readrops/db/entities/Item;", "starredItems", "feeds", "Lcom/readrops/db/entities/Feed;", "folders", "Lcom/readrops/db/entities/Folder;", "unreadIds", "", "isError", "", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Z)V", "getFeeds", "()Ljava/util/List;", "setFeeds", "(Ljava/util/List;)V", "getFolders", "setFolders", "()Z", "setError", "(Z)V", "getItems", "setItems", "getStarredItems", "setStarredItems", "getUnreadIds", "setUnreadIds", "api_debug"})
public final class SyncResult {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<? extends com.readrops.db.entities.Item> items;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<? extends com.readrops.db.entities.Item> starredItems;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<? extends com.readrops.db.entities.Feed> feeds;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<? extends com.readrops.db.entities.Folder> folders;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.String> unreadIds;
    private boolean isError;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.readrops.db.entities.Item> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.readrops.db.entities.Item> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.readrops.db.entities.Item> getStarredItems() {
        return null;
    }
    
    public final void setStarredItems(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.readrops.db.entities.Item> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.readrops.db.entities.Feed> getFeeds() {
        return null;
    }
    
    public final void setFeeds(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.readrops.db.entities.Feed> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.readrops.db.entities.Folder> getFolders() {
        return null;
    }
    
    public final void setFolders(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.readrops.db.entities.Folder> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getUnreadIds() {
        return null;
    }
    
    public final void setUnreadIds(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    public final boolean isError() {
        return false;
    }
    
    public final void setError(boolean p0) {
    }
    
    public SyncResult(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.readrops.db.entities.Item> items, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.readrops.db.entities.Item> starredItems, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.readrops.db.entities.Feed> feeds, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.readrops.db.entities.Folder> folders, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> unreadIds, boolean isError) {
        super();
    }
    
    public SyncResult() {
        super();
    }
}