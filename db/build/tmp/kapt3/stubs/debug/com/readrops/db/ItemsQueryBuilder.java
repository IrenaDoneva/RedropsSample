package com.readrops.db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u0005H\u0002\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0002J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0002J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\b\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/readrops/db/ItemsQueryBuilder;", "", "()V", "COLUMNS", "", "", "[Ljava/lang/String;", "ITEM_COLUMNS", "ORDER_BY_ASC", "ORDER_BY_DESC", "buildItemColumns", "tableName", "(Ljava/lang/String;)[Ljava/lang/String;", "buildItemsQuery", "Landroidx/sqlite/db/SupportSQLiteQuery;", "queryFilters", "Lcom/readrops/db/QueryFilters;", "buildOrderByAsc", "buildQuery", "starQuery", "", "buildSelectAllJoin", "buildStarredItemsQuery", "buildWhereClause", "db_debug"})
public final class ItemsQueryBuilder {
    private static final java.lang.String[] COLUMNS = {"title", "clean_description", "image_link", "pub_date", "read_it_later", "Feed.name", "text_color", "background_color", "icon_url", "read_time", "Feed.id as feedId", "Feed.account_id", "Folder.id as folder_id", "Folder.name as folder_name", "case When UnreadItemsIds.remote_id is NULL Then 1 else 0 End read"};
    private static final java.lang.String[] ITEM_COLUMNS = {".id", ".remoteId"};
    private static final java.lang.String ORDER_BY_ASC = ".id DESC";
    private static final java.lang.String ORDER_BY_DESC = "pub_date ASC";
    @org.jetbrains.annotations.NotNull()
    public static final com.readrops.db.ItemsQueryBuilder INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public static final androidx.sqlite.db.SupportSQLiteQuery buildItemsQuery(@org.jetbrains.annotations.NotNull()
    com.readrops.db.QueryFilters queryFilters) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final androidx.sqlite.db.SupportSQLiteQuery buildStarredItemsQuery(@org.jetbrains.annotations.NotNull()
    com.readrops.db.QueryFilters queryFilters) {
        return null;
    }
    
    private final androidx.sqlite.db.SupportSQLiteQuery buildQuery(com.readrops.db.QueryFilters queryFilters, boolean starQuery) {
        return null;
    }
    
    private final java.lang.String buildWhereClause(com.readrops.db.QueryFilters queryFilters) {
        return null;
    }
    
    private final java.lang.String tableName(boolean starQuery) {
        return null;
    }
    
    private final java.lang.String[] buildItemColumns(java.lang.String tableName) {
        return null;
    }
    
    private final java.lang.String buildOrderByAsc(java.lang.String tableName) {
        return null;
    }
    
    private final java.lang.String buildSelectAllJoin(java.lang.String tableName) {
        return null;
    }
    
    private ItemsQueryBuilder() {
        super();
    }
}