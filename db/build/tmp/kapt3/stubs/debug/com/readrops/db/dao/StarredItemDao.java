package com.readrops.db.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u0006H\'J\u001e\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\'\u00a8\u0006\u000f"}, d2 = {"Lcom/readrops/db/dao/StarredItemDao;", "Lcom/readrops/db/dao/BaseDao;", "Lcom/readrops/db/entities/StarredItem;", "deleteStarredItems", "", "accountId", "", "getStarredItemById", "Landroidx/lifecycle/LiveData;", "Lcom/readrops/db/pojo/ItemWithFeed;", "id", "selectAll", "Landroidx/paging/DataSource$Factory;", "query", "Landroidx/sqlite/db/SupportSQLiteQuery;", "db_debug"})
public abstract interface StarredItemDao extends com.readrops.db.dao.BaseDao<com.readrops.db.entities.StarredItem> {
    
    @androidx.room.Query(value = "Delete From StarredItem Where feed_id In (Select feed_id From Feed Where account_id = :accountId)")
    public abstract void deleteStarredItems(int accountId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.RawQuery(observedEntities = {com.readrops.db.entities.StarredItem.class, com.readrops.db.entities.Folder.class, com.readrops.db.entities.Feed.class, com.readrops.db.entities.UnreadItemsIds.class})
    public abstract androidx.paging.DataSource.Factory<java.lang.Integer, com.readrops.db.pojo.ItemWithFeed> selectAll(@org.jetbrains.annotations.Nullable()
    androidx.sqlite.db.SupportSQLiteQuery query);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "Select StarredItem.id, title, StarredItem.description, content, link, pub_date, image_link, author, read, text_color, background_color, read_time, starred, Feed.name, Feed.id as feedId, siteUrl, Folder.id as folder_id, Folder.name as folder_name from StarredItem Inner Join Feed On StarredItem.feed_id = Feed.id Left Join Folder on Folder.id = Feed.folder_id Where StarredItem.id = :id")
    @java.lang.SuppressWarnings(value = {"ROOM_CURSOR_MISMATCH"})
    public abstract androidx.lifecycle.LiveData<com.readrops.db.pojo.ItemWithFeed> getStarredItemById(int id);
}