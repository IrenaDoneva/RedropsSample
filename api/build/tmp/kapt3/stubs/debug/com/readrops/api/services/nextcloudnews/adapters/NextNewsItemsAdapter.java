package com.readrops.api.services.nextcloudnews.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016\u00a8\u0006\u000e"}, d2 = {"Lcom/readrops/api/services/nextcloudnews/adapters/NextNewsItemsAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/readrops/db/entities/Item;", "()V", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "Companion", "api_debug"})
public final class NextNewsItemsAdapter extends com.squareup.moshi.JsonAdapter<java.util.List<? extends com.readrops.db.entities.Item>> {
    @org.jetbrains.annotations.NotNull()
    private static final com.squareup.moshi.JsonReader.Options NAMES = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.readrops.api.services.nextcloudnews.adapters.NextNewsItemsAdapter.Companion Companion = null;
    
    @java.lang.Override()
    public void toJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonWriter writer, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends com.readrops.db.entities.Item> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    public java.util.List<com.readrops.db.entities.Item> fromJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonReader reader) {
        return null;
    }
    
    public NextNewsItemsAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/readrops/api/services/nextcloudnews/adapters/NextNewsItemsAdapter$Companion;", "", "()V", "NAMES", "Lcom/squareup/moshi/JsonReader$Options;", "getNAMES", "()Lcom/squareup/moshi/JsonReader$Options;", "api_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.squareup.moshi.JsonReader.Options getNAMES() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}