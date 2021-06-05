package com.readrops.api.localfeed.rss1;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000b2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u0002\u00a8\u0006\f"}, d2 = {"Lcom/readrops/api/localfeed/rss1/RSS1ItemsAdapter;", "Lcom/readrops/api/localfeed/XmlAdapter;", "", "Lcom/readrops/db/entities/Item;", "()V", "fromXml", "inputStream", "Ljava/io/InputStream;", "validateItem", "", "item", "Companion", "api_debug"})
public final class RSS1ItemsAdapter implements com.readrops.api.localfeed.XmlAdapter<java.util.List<? extends com.readrops.db.entities.Item>> {
    @org.jetbrains.annotations.NotNull()
    private static final com.gitlab.mvysny.konsumexml.Names names = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.readrops.api.localfeed.rss1.RSS1ItemsAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.readrops.db.entities.Item> fromXml(@org.jetbrains.annotations.NotNull()
    java.io.InputStream inputStream) {
        return null;
    }
    
    private final void validateItem(com.readrops.db.entities.Item item) {
    }
    
    public RSS1ItemsAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/readrops/api/localfeed/rss1/RSS1ItemsAdapter$Companion;", "", "()V", "names", "Lcom/gitlab/mvysny/konsumexml/Names;", "getNames", "()Lcom/gitlab/mvysny/konsumexml/Names;", "api_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.gitlab.mvysny.konsumexml.Names getNames() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}