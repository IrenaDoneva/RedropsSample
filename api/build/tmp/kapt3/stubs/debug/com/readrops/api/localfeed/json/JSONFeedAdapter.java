package com.readrops.api.localfeed.json;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/readrops/api/localfeed/json/JSONFeedAdapter;", "", "()V", "fromJson", "Lcom/readrops/db/entities/Feed;", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "feed", "Companion", "api_debug"})
public final class JSONFeedAdapter {
    @org.jetbrains.annotations.NotNull()
    private static final com.squareup.moshi.JsonReader.Options names = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.readrops.api.localfeed.json.JSONFeedAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.ToJson()
    public final java.lang.String toJson(@org.jetbrains.annotations.NotNull()
    com.readrops.db.entities.Feed feed) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.FromJson()
    public final com.readrops.db.entities.Feed fromJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonReader reader) {
        return null;
    }
    
    public JSONFeedAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/readrops/api/localfeed/json/JSONFeedAdapter$Companion;", "", "()V", "names", "Lcom/squareup/moshi/JsonReader$Options;", "getNames", "()Lcom/squareup/moshi/JsonReader$Options;", "api_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.squareup.moshi.JsonReader.Options getNames() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}