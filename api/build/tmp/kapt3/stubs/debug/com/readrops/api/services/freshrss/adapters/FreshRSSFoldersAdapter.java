package com.readrops.api.services.freshrss.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0007\u00a8\u0006\f"}, d2 = {"Lcom/readrops/api/services/freshrss/adapters/FreshRSSFoldersAdapter;", "", "()V", "fromJson", "", "Lcom/readrops/db/entities/Folder;", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "folder", "Companion", "api_debug"})
public final class FreshRSSFoldersAdapter {
    @org.jetbrains.annotations.NotNull()
    private static final com.squareup.moshi.JsonReader.Options NAMES = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.readrops.api.services.freshrss.adapters.FreshRSSFoldersAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.ToJson()
    public final java.lang.String toJson(@org.jetbrains.annotations.NotNull()
    com.readrops.db.entities.Folder folder) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @com.squareup.moshi.FromJson()
    public final java.util.List<com.readrops.db.entities.Folder> fromJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonReader reader) {
        return null;
    }
    
    public FreshRSSFoldersAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/readrops/api/services/freshrss/adapters/FreshRSSFoldersAdapter$Companion;", "", "()V", "NAMES", "Lcom/squareup/moshi/JsonReader$Options;", "getNAMES", "()Lcom/squareup/moshi/JsonReader$Options;", "api_debug"})
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