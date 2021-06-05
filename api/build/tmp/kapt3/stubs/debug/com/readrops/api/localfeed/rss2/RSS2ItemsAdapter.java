package com.readrops.api.localfeed.rss2;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00162\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0002H\u0002J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0002\u00a8\u0006\u0017"}, d2 = {"Lcom/readrops/api/localfeed/rss2/RSS2ItemsAdapter;", "Lcom/readrops/api/localfeed/XmlAdapter;", "", "Lcom/readrops/db/entities/Item;", "()V", "finalizeItem", "", "item", "creators", "", "fromXml", "inputStream", "Ljava/io/InputStream;", "isMediumImage", "", "konsumer", "Lcom/gitlab/mvysny/konsumexml/Konsumer;", "isTypeImage", "parseEnclosure", "parseMediaContent", "parseMediaGroup", "validateItem", "Companion", "api_debug"})
public final class RSS2ItemsAdapter implements com.readrops.api.localfeed.XmlAdapter<java.util.List<? extends com.readrops.db.entities.Item>> {
    @org.jetbrains.annotations.NotNull()
    private static final com.gitlab.mvysny.konsumexml.Names names = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.readrops.api.localfeed.rss2.RSS2ItemsAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.readrops.db.entities.Item> fromXml(@org.jetbrains.annotations.NotNull()
    java.io.InputStream inputStream) {
        return null;
    }
    
    private final void parseEnclosure(com.gitlab.mvysny.konsumexml.Konsumer konsumer, com.readrops.db.entities.Item item) {
    }
    
    private final boolean isMediumImage(com.gitlab.mvysny.konsumexml.Konsumer konsumer) {
        return false;
    }
    
    private final boolean isTypeImage(com.gitlab.mvysny.konsumexml.Konsumer konsumer) {
        return false;
    }
    
    private final void parseMediaContent(com.gitlab.mvysny.konsumexml.Konsumer konsumer, com.readrops.db.entities.Item item) {
    }
    
    private final void parseMediaGroup(com.gitlab.mvysny.konsumexml.Konsumer konsumer, com.readrops.db.entities.Item item) {
    }
    
    private final void finalizeItem(com.readrops.db.entities.Item item, java.util.List<java.lang.String> creators) {
    }
    
    private final void validateItem(com.readrops.db.entities.Item item) {
    }
    
    public RSS2ItemsAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/readrops/api/localfeed/rss2/RSS2ItemsAdapter$Companion;", "", "()V", "names", "Lcom/gitlab/mvysny/konsumexml/Names;", "getNames", "()Lcom/gitlab/mvysny/konsumexml/Names;", "api_debug"})
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