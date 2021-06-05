package com.readrops.api.localfeed.atom;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002\u00a8\u0006\r"}, d2 = {"Lcom/readrops/api/localfeed/atom/ATOMFeedAdapter;", "Lcom/readrops/api/localfeed/XmlAdapter;", "Lcom/readrops/db/entities/Feed;", "()V", "fromXml", "inputStream", "Ljava/io/InputStream;", "parseLink", "", "konsume", "Lcom/gitlab/mvysny/konsumexml/Konsumer;", "feed", "Companion", "api_debug"})
public final class ATOMFeedAdapter implements com.readrops.api.localfeed.XmlAdapter<com.readrops.db.entities.Feed> {
    @org.jetbrains.annotations.NotNull()
    private static final com.gitlab.mvysny.konsumexml.Names names = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.readrops.api.localfeed.atom.ATOMFeedAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.readrops.db.entities.Feed fromXml(@org.jetbrains.annotations.NotNull()
    java.io.InputStream inputStream) {
        return null;
    }
    
    private final void parseLink(com.gitlab.mvysny.konsumexml.Konsumer konsume, com.readrops.db.entities.Feed feed) {
    }
    
    public ATOMFeedAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/readrops/api/localfeed/atom/ATOMFeedAdapter$Companion;", "", "()V", "names", "Lcom/gitlab/mvysny/konsumexml/Names;", "getNames", "()Lcom/gitlab/mvysny/konsumexml/Names;", "api_debug"})
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