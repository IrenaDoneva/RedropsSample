package com.readrops.db.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\'J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\'J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\'J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0007\u001a\u00020\bH\'J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0007\u001a\u00020\bH\'J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H\'J\u0016\u0010\u0016\u001a\u00020\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u000fH\'J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\bH\'J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\bH\'J\u0018\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\'J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016\u00a8\u0006 "}, d2 = {"Lcom/readrops/db/dao/ItemsIdsDao;", "", "deleteReadStarStateChange", "", "readStarStateChange", "Lcom/readrops/db/entities/ReadStarStateChange;", "deleteReadStarStateChanges", "accountId", "", "deleteStateChanges", "deleteUnreadItemId", "remoteId", "", "deleteUnreadItemsIds", "getItemStateChanges", "", "Lcom/readrops/db/pojo/ItemReadStarState;", "getStarredItemStateChanges", "insertReadStarStateChange", "insertUnreadItemId", "unreadItemId", "Lcom/readrops/db/entities/UnreadItemsIds;", "insertUnreadItemsIds", "unreadItemsIds", "readStateChangeExists", "", "itemId", "starStateChangeExists", "unreadItemIdExists", "upsertReadStarStateChange", "Lio/reactivex/Completable;", "upsertUnreadItemId", "db_debug"})
public abstract interface ItemsIdsDao {
    
    @androidx.room.Insert()
    public abstract void insertUnreadItemsIds(@org.jetbrains.annotations.NotNull()
    java.util.List<com.readrops.db.entities.UnreadItemsIds> unreadItemsIds);
    
    @androidx.room.Insert()
    public abstract void insertUnreadItemId(@org.jetbrains.annotations.NotNull()
    com.readrops.db.entities.UnreadItemsIds unreadItemId);
    
    @androidx.room.Query(value = "Delete From UnreadItemsIds Where remote_id = :remoteId And account_id = :accountId")
    public abstract void deleteUnreadItemId(@org.jetbrains.annotations.NotNull()
    java.lang.String remoteId, int accountId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Completable upsertUnreadItemId(@org.jetbrains.annotations.NotNull()
    com.readrops.db.entities.UnreadItemsIds unreadItemId);
    
    @androidx.room.Query(value = "Select case When Exists (Select remote_id, account_id From UnreadItemsIds Where remote_id = :remoteId And account_id = :accountId) Then 1 else 0 End")
    public abstract boolean unreadItemIdExists(@org.jetbrains.annotations.NotNull()
    java.lang.String remoteId, int accountId);
    
    @androidx.room.Insert()
    public abstract void insertReadStarStateChange(@org.jetbrains.annotations.NotNull()
    com.readrops.db.entities.ReadStarStateChange readStarStateChange);
    
    @androidx.room.Delete()
    public abstract void deleteReadStarStateChange(@org.jetbrains.annotations.NotNull()
    com.readrops.db.entities.ReadStarStateChange readStarStateChange);
    
    @androidx.room.Query(value = "Delete From UnreadItemsIds Where account_id = :accountId")
    public abstract void deleteUnreadItemsIds(int accountId);
    
    @androidx.room.Query(value = "Delete From ReadStarStateChange Where account_id = :accountId")
    public abstract void deleteReadStarStateChanges(int accountId);
    
    @androidx.room.Query(value = "Delete From ReadStarStateChange Where account_id = :accountId")
    public abstract void deleteStateChanges(int accountId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "Select case When UnreadItemsIds.remote_id is NULL Then 1 else 0 End read, Item.remoteId, ReadStarStateChange.read_change, Item.starred, ReadStarStateChange.star_change From ReadStarStateChange Inner Join Item On ReadStarStateChange.id = Item.id Left Join UnreadItemsIds On UnreadItemsIds.remote_id = Item.remoteId Where ReadStarStateChange.account_id = :accountId")
    public abstract java.util.List<com.readrops.db.pojo.ItemReadStarState> getItemStateChanges(int accountId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "Select StarredItem.remoteId, Case When StarredItem.read = 1 then 0 else 1 end read, StarredItem.starred, ReadStarStateChange.read_change, ReadStarStateChange.star_change From StarredItem Inner Join ReadStarStateChange On StarredItem.id = ReadStarStateChange.id Where account_id = :accountId")
    public abstract java.util.List<com.readrops.db.pojo.ItemReadStarState> getStarredItemStateChanges(int accountId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Completable upsertReadStarStateChange(@org.jetbrains.annotations.NotNull()
    com.readrops.db.entities.ReadStarStateChange readStarStateChange);
    
    @androidx.room.Query(value = "Select Case When :itemId In (Select id From ReadStarStateChange Where read_change = 1) Then 1 Else 0 End")
    public abstract boolean readStateChangeExists(int itemId);
    
    @androidx.room.Query(value = "Select Case When :itemId In (Select id From ReadStarStateChange Where star_change = 1) Then 1 Else 0 End")
    public abstract boolean starStateChangeExists(int itemId);
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        public static io.reactivex.Completable upsertUnreadItemId(@org.jetbrains.annotations.NotNull()
        com.readrops.db.dao.ItemsIdsDao $this, @org.jetbrains.annotations.NotNull()
        com.readrops.db.entities.UnreadItemsIds unreadItemId) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static io.reactivex.Completable upsertReadStarStateChange(@org.jetbrains.annotations.NotNull()
        com.readrops.db.dao.ItemsIdsDao $this, @org.jetbrains.annotations.NotNull()
        com.readrops.db.entities.ReadStarStateChange readStarStateChange) {
            return null;
        }
    }
}