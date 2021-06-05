package com.readrops.api.services.freshrss.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\u001e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H\u0002J \u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/readrops/api/services/freshrss/adapters/FreshRSSItemsAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/readrops/db/entities/Item;", "()V", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "getContent", "", "getLink", "getRemoteFeedId", "getStates", "", "item", "parseItems", "items", "", "toJson", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "Companion", "api_debug"})
public final class FreshRSSItemsAdapter extends com.squareup.moshi.JsonAdapter<java.util.List<? extends com.readrops.db.entities.Item>> {
    @org.jetbrains.annotations.NotNull()
    private static final com.squareup.moshi.JsonReader.Options NAMES = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.readrops.api.services.freshrss.adapters.FreshRSSItemsAdapter.Companion Companion = null;
    
    @java.lang.Override()
    public void toJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonWriter writer, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends com.readrops.db.entities.Item> value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.util.List<com.readrops.db.entities.Item> fromJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonReader reader) {
        return null;
    }
    
    private final void parseItems(com.squareup.moshi.JsonReader reader, java.util.List<com.readrops.db.entities.Item> items) {
    }
    
    private final java.lang.String getContent(com.squareup.moshi.JsonReader reader) {
        return null;
    }
    
    private final java.lang.String getLink(com.squareup.moshi.JsonReader reader) {
        return null;
    }
    
    private final void getStates(com.squareup.moshi.JsonReader reader, com.readrops.db.entities.Item item) {
    }
    
    private final java.lang.String getRemoteFeedId(com.squareup.moshi.JsonReader reader) {
        return null;
    }
    
    public FreshRSSItemsAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/readrops/api/services/freshrss/adapters/FreshRSSItemsAdapter$Companion;", "", "()V", "NAMES", "Lcom/squareup/moshi/JsonReader$Options;", "getNAMES", "()Lcom/squareup/moshi/JsonReader$Options;", "TAG", "", "getTAG", "()Ljava/lang/String;", "api_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.squareup.moshi.JsonReader.Options getNAMES() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTAG() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}