package com.readrops.api.localfeed;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J \u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\nH\u0002J.\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u00182\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007J\u001a\u0010\u001b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/readrops/api/localfeed/LocalRSSDataSource;", "Lorg/koin/core/KoinComponent;", "httpClient", "Lokhttp3/OkHttpClient;", "(Lokhttp3/OkHttpClient;)V", "handleSpecialCases", "", "feed", "Lcom/readrops/db/entities/Feed;", "type", "Lcom/readrops/api/localfeed/LocalRSSHelper$RSSType;", "response", "Lokhttp3/Response;", "isUrlRSSResource", "", "url", "", "parseFeed", "stream", "Ljava/io/InputStream;", "parseItems", "", "Lcom/readrops/db/entities/Item;", "queryRSSResource", "Lkotlin/Pair;", "headers", "Lokhttp3/Headers;", "queryUrl", "api_debug"})
public final class LocalRSSDataSource implements org.koin.core.KoinComponent {
    private final okhttp3.OkHttpClient httpClient = null;
    
    /**
     * Query RSS url
     * @param url url to query
     * @param headers request headers
     * @return a Feed object with its items
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    public final kotlin.Pair<com.readrops.db.entities.Feed, java.util.List<com.readrops.db.entities.Item>> queryRSSResource(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    okhttp3.Headers headers) {
        return null;
    }
    
    /**
     * Checks if the provided url is a RSS resource
     * @param url url to check
     * @return true if [url] is a RSS resource, false otherwise
     */
    @androidx.annotation.WorkerThread()
    public final boolean isUrlRSSResource(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return false;
    }
    
    private final okhttp3.Response queryUrl(java.lang.String url, okhttp3.Headers headers) throws java.io.IOException {
        return null;
    }
    
    private final com.readrops.db.entities.Feed parseFeed(java.io.InputStream stream, com.readrops.api.localfeed.LocalRSSHelper.RSSType type, okhttp3.Response response) {
        return null;
    }
    
    private final java.util.List<com.readrops.db.entities.Item> parseItems(java.io.InputStream stream, com.readrops.api.localfeed.LocalRSSHelper.RSSType type) {
        return null;
    }
    
    private final void handleSpecialCases(com.readrops.db.entities.Feed feed, com.readrops.api.localfeed.LocalRSSHelper.RSSType type, okhttp3.Response response) {
    }
    
    public LocalRSSDataSource(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient httpClient) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
}