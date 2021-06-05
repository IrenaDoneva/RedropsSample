package com.readrops.api.localfeed;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0004J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/readrops/api/localfeed/LocalRSSHelper;", "", "()V", "ATOM_CONTENT_TYPE", "", "ATOM_REGEX", "JSONFEED_CONTENT_TYPE", "JSON_CONTENT_TYPE", "RSS_1_CONTENT_TYPE", "RSS_1_REGEX", "RSS_2_CONTENT_TYPE", "RSS_2_REGEX", "getRSSContentType", "Lcom/readrops/api/localfeed/LocalRSSHelper$RSSType;", "content", "Ljava/io/InputStream;", "getRSSType", "contentType", "isRSSType", "", "type", "RSSType", "api_debug"})
public final class LocalRSSHelper {
    private static final java.lang.String RSS_1_CONTENT_TYPE = "application/rdf+xml";
    private static final java.lang.String RSS_2_CONTENT_TYPE = "application/rss+xml";
    private static final java.lang.String ATOM_CONTENT_TYPE = "application/atom+xml";
    private static final java.lang.String JSONFEED_CONTENT_TYPE = "application/feed+json";
    private static final java.lang.String JSON_CONTENT_TYPE = "application/json";
    private static final java.lang.String RSS_1_REGEX = "<rdf:RDF.*xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"";
    private static final java.lang.String RSS_2_REGEX = "rss.*version=\"2.0\"";
    private static final java.lang.String ATOM_REGEX = "<feed.* xmlns=\"http://www.w3.org/2005/Atom\"";
    @org.jetbrains.annotations.NotNull()
    public static final com.readrops.api.localfeed.LocalRSSHelper INSTANCE = null;
    
    /**
     * Guess RSS type based on content-type header
     */
    @org.jetbrains.annotations.NotNull()
    public final com.readrops.api.localfeed.LocalRSSHelper.RSSType getRSSType(@org.jetbrains.annotations.NotNull()
    java.lang.String contentType) {
        return null;
    }
    
    /**
     * Guess RSS type based on xml content
     */
    @org.jetbrains.annotations.NotNull()
    public final com.readrops.api.localfeed.LocalRSSHelper.RSSType getRSSContentType(@org.jetbrains.annotations.NotNull()
    java.io.InputStream content) {
        return null;
    }
    
    public static final boolean isRSSType(@org.jetbrains.annotations.Nullable()
    java.lang.String type) {
        return false;
    }
    
    private LocalRSSHelper() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/readrops/api/localfeed/LocalRSSHelper$RSSType;", "", "(Ljava/lang/String;I)V", "RSS_1", "RSS_2", "ATOM", "JSONFEED", "UNKNOWN", "api_debug"})
    public static enum RSSType {
        /*public static final*/ RSS_1 /* = new RSS_1() */,
        /*public static final*/ RSS_2 /* = new RSS_2() */,
        /*public static final*/ ATOM /* = new ATOM() */,
        /*public static final*/ JSONFEED /* = new JSONFEED() */,
        /*public static final*/ UNKNOWN /* = new UNKNOWN() */;
        
        RSSType() {
        }
    }
}