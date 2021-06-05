package com.readrops.db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006\u001e"}, d2 = {"Lcom/readrops/db/QueryFilters;", "", "showReadItems", "", "filterFeedId", "", "accountId", "filterType", "Lcom/readrops/db/filters/FilterType;", "sortType", "Lcom/readrops/db/filters/ListSortType;", "(ZIILcom/readrops/db/filters/FilterType;Lcom/readrops/db/filters/ListSortType;)V", "getAccountId", "()I", "setAccountId", "(I)V", "getFilterFeedId", "setFilterFeedId", "getFilterType", "()Lcom/readrops/db/filters/FilterType;", "setFilterType", "(Lcom/readrops/db/filters/FilterType;)V", "getShowReadItems", "()Z", "setShowReadItems", "(Z)V", "getSortType", "()Lcom/readrops/db/filters/ListSortType;", "setSortType", "(Lcom/readrops/db/filters/ListSortType;)V", "db_debug"})
public final class QueryFilters {
    private boolean showReadItems;
    private int filterFeedId;
    private int accountId;
    @org.jetbrains.annotations.NotNull()
    private com.readrops.db.filters.FilterType filterType;
    @org.jetbrains.annotations.NotNull()
    private com.readrops.db.filters.ListSortType sortType;
    
    public final boolean getShowReadItems() {
        return false;
    }
    
    public final void setShowReadItems(boolean p0) {
    }
    
    public final int getFilterFeedId() {
        return 0;
    }
    
    public final void setFilterFeedId(int p0) {
    }
    
    public final int getAccountId() {
        return 0;
    }
    
    public final void setAccountId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.readrops.db.filters.FilterType getFilterType() {
        return null;
    }
    
    public final void setFilterType(@org.jetbrains.annotations.NotNull()
    com.readrops.db.filters.FilterType p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.readrops.db.filters.ListSortType getSortType() {
        return null;
    }
    
    public final void setSortType(@org.jetbrains.annotations.NotNull()
    com.readrops.db.filters.ListSortType p0) {
    }
    
    public QueryFilters(boolean showReadItems, int filterFeedId, int accountId, @org.jetbrains.annotations.NotNull()
    com.readrops.db.filters.FilterType filterType, @org.jetbrains.annotations.NotNull()
    com.readrops.db.filters.ListSortType sortType) {
        super();
    }
    
    public QueryFilters() {
        super();
    }
}