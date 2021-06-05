package com.readrops.db;

import java.lang.System;

@dev.matrix.roomigrant.GenerateRoomMigrations(rules = {})
@androidx.room.TypeConverters(value = {com.readrops.db.Converters.class})
@androidx.room.Database(entities = {com.readrops.db.entities.Feed.class, com.readrops.db.entities.Item.class, com.readrops.db.entities.Folder.class, com.readrops.db.entities.account.Account.class, com.readrops.db.entities.UnreadItemsIds.class, com.readrops.db.entities.ReadStarStateChange.class, com.readrops.db.entities.StarredItem.class}, version = 3)
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&\u00a8\u0006\u000f"}, d2 = {"Lcom/readrops/db/Database;", "Landroidx/room/RoomDatabase;", "()V", "accountDao", "Lcom/readrops/db/dao/AccountDao;", "feedDao", "Lcom/readrops/db/dao/FeedDao;", "folderDao", "Lcom/readrops/db/dao/FolderDao;", "itemDao", "Lcom/readrops/db/dao/ItemDao;", "itemsIdsDao", "Lcom/readrops/db/dao/ItemsIdsDao;", "starredItemDao", "Lcom/readrops/db/dao/StarredItemDao;", "db_debug"})
public abstract class Database extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.readrops.db.dao.FeedDao feedDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.readrops.db.dao.ItemDao itemDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.readrops.db.dao.FolderDao folderDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.readrops.db.dao.AccountDao accountDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.readrops.db.dao.ItemsIdsDao itemsIdsDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.readrops.db.dao.StarredItemDao starredItemDao();
    
    public Database() {
        super();
    }
}