package com.readrops.api.localfeed;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u0007*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0007J\u0015\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/readrops/api/localfeed/XmlAdapter;", "T", "", "fromXml", "inputStream", "Ljava/io/InputStream;", "(Ljava/io/InputStream;)Ljava/lang/Object;", "Companion", "api_debug"})
public abstract interface XmlAdapter<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    public static final com.readrops.api.localfeed.XmlAdapter.Companion Companion = null;
    public static final int AUTHORS_MAX = 4;
    
    public abstract T fromXml(@org.jetbrains.annotations.NotNull()
    java.io.InputStream inputStream);
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/readrops/api/localfeed/XmlAdapter$Companion;", "", "()V", "AUTHORS_MAX", "", "xmlFeedAdapterFactory", "Lcom/readrops/api/localfeed/XmlAdapter;", "Lcom/readrops/db/entities/Feed;", "type", "Lcom/readrops/api/localfeed/LocalRSSHelper$RSSType;", "xmlItemsAdapterFactory", "", "Lcom/readrops/db/entities/Item;", "api_debug"})
    public static final class Companion {
        public static final int AUTHORS_MAX = 4;
        
        @org.jetbrains.annotations.NotNull()
        public final com.readrops.api.localfeed.XmlAdapter<com.readrops.db.entities.Feed> xmlFeedAdapterFactory(@org.jetbrains.annotations.NotNull()
        com.readrops.api.localfeed.LocalRSSHelper.RSSType type) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.readrops.api.localfeed.XmlAdapter<java.util.List<com.readrops.db.entities.Item>> xmlItemsAdapterFactory(@org.jetbrains.annotations.NotNull()
        com.readrops.api.localfeed.LocalRSSHelper.RSSType type) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}