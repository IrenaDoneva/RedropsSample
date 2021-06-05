package com.readrops.db.entities;

import java.lang.System;

@androidx.room.Entity(foreignKeys = {@androidx.room.ForeignKey(entity = com.readrops.db.entities.Feed.class, childColumns = {"feed_id"}, onDelete = 5, parentColumns = {"id"})}, inheritSuperIndices = true)
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/readrops/db/entities/StarredItem;", "Lcom/readrops/db/entities/Item;", "item", "(Lcom/readrops/db/entities/Item;)V", "()V", "db_debug"})
public final class StarredItem extends com.readrops.db.entities.Item {
    
    public StarredItem() {
        super();
    }
    
    @androidx.room.Ignore()
    public StarredItem(@org.jetbrains.annotations.NotNull()
    com.readrops.db.entities.Item item) {
        super();
    }
}