package com.readrops.api.opml;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JJ\u0010\u0007\u001a\u00020\b2\u001a\u0010\t\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\n2\u001a\u0010\u000e\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0002J$\u0010\u0010\u001a\u00020\u00112\u001a\u0010\t\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0012H\u0002J$\u0010\u0013\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00122\u0006\u0010\u0014\u001a\u00020\u0011H\u0002J$\u0010\u0015\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\n2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J2\u0010\u0018\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00120\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J*\u0010\u0018\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00120\u00192\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J,\u0010 \u001a\u00020!2\u001a\u0010\t\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00122\u0006\u0010\"\u001a\u00020#H\u0007R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006$"}, d2 = {"Lcom/readrops/api/opml/OPMLParser;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "associateOrphanFeedsToFolder", "", "foldersAndFeeds", "", "Lcom/readrops/db/entities/Folder;", "", "Lcom/readrops/db/entities/Feed;", "parsingResult", "folder", "foldersAndFeedsToOPML", "Lcom/readrops/api/opml/model/OPML;", "", "opmlToFoldersAndFeeds", "opml", "parseOutline", "outline", "Lcom/readrops/api/opml/model/Outline;", "read", "Lio/reactivex/Single;", "uri", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "stream", "Ljava/io/InputStream;", "write", "Lio/reactivex/Completable;", "outputStream", "Ljava/io/OutputStream;", "api_debug"})
public final class OPMLParser {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.readrops.api.opml.OPMLParser INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final io.reactivex.Single<java.util.Map<com.readrops.db.entities.Folder, java.util.List<com.readrops.db.entities.Feed>>> read(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final io.reactivex.Single<java.util.Map<com.readrops.db.entities.Folder, java.util.List<com.readrops.db.entities.Feed>>> read(@org.jetbrains.annotations.NotNull()
    java.io.InputStream stream) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final io.reactivex.Completable write(@org.jetbrains.annotations.NotNull()
    java.util.Map<com.readrops.db.entities.Folder, ? extends java.util.List<? extends com.readrops.db.entities.Feed>> foldersAndFeeds, @org.jetbrains.annotations.NotNull()
    java.io.OutputStream outputStream) {
        return null;
    }
    
    private final java.util.Map<com.readrops.db.entities.Folder, java.util.List<com.readrops.db.entities.Feed>> opmlToFoldersAndFeeds(com.readrops.api.opml.model.OPML opml) {
        return null;
    }
    
    /**
     * Parse outline and its children recursively
     * @param outline node to parse
     */
    private final java.util.Map<com.readrops.db.entities.Folder, java.util.List<com.readrops.db.entities.Feed>> parseOutline(com.readrops.api.opml.model.Outline outline) {
        return null;
    }
    
    private final com.readrops.api.opml.model.OPML foldersAndFeedsToOPML(java.util.Map<com.readrops.db.entities.Folder, ? extends java.util.List<? extends com.readrops.db.entities.Feed>> foldersAndFeeds) {
        return null;
    }
    
    /**
     * Associate parsed feeds without folder to the previous level folder.
     * @param foldersAndFeeds final result
     * @param parsingResult current level parsing
     * @param folder the folder feeds will be associated to
     */
    private final void associateOrphanFeedsToFolder(java.util.Map<com.readrops.db.entities.Folder, java.util.List<com.readrops.db.entities.Feed>> foldersAndFeeds, java.util.Map<com.readrops.db.entities.Folder, java.util.List<com.readrops.db.entities.Feed>> parsingResult, com.readrops.db.entities.Folder folder) {
    }
    
    private OPMLParser() {
        super();
    }
}