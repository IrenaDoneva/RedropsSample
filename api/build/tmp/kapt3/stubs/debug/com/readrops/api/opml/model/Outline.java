package com.readrops.api.opml.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005B#\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\bBG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\f\u00a2\u0006\u0002\u0010\rJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u00c2\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u00c2\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\fH\u00c6\u0003JW\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\fH\u00c6\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020&H\u00d6\u0001J\t\u0010\'\u001a\u00020\u0004H\u00d6\u0001R \u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0005R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u000fR&\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R \u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0005R \u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0005\u00a8\u0006("}, d2 = {"Lcom/readrops/api/opml/model/Outline;", "", "()V", "title", "", "(Ljava/lang/String;)V", "xmlUrl", "htmlUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "text", "type", "outlines", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getHtmlUrl", "()Ljava/lang/String;", "setHtmlUrl", "name", "getName", "getOutlines", "()Ljava/util/List;", "setOutlines", "(Ljava/util/List;)V", "getType", "setType", "getXmlUrl", "setXmlUrl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "api_debug"})
@org.simpleframework.xml.Root(name = "outline", strict = false)
public final class Outline {
    @org.simpleframework.xml.Attribute(required = false)
    private java.lang.String title;
    @org.simpleframework.xml.Attribute(required = false)
    private java.lang.String text;
    @org.jetbrains.annotations.Nullable()
    @org.simpleframework.xml.Attribute(required = false)
    private java.lang.String type;
    @org.jetbrains.annotations.Nullable()
    @org.simpleframework.xml.Attribute(required = false)
    private java.lang.String xmlUrl;
    @org.jetbrains.annotations.Nullable()
    @org.simpleframework.xml.Attribute(required = false)
    private java.lang.String htmlUrl;
    @org.jetbrains.annotations.Nullable()
    @org.simpleframework.xml.ElementList(inline = true, required = false)
    private java.util.List<com.readrops.api.opml.model.Outline> outlines;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getXmlUrl() {
        return null;
    }
    
    public final void setXmlUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHtmlUrl() {
        return null;
    }
    
    public final void setHtmlUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.readrops.api.opml.model.Outline> getOutlines() {
        return null;
    }
    
    public final void setOutlines(@org.jetbrains.annotations.Nullable()
    java.util.List<com.readrops.api.opml.model.Outline> p0) {
    }
    
    public Outline(@org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String text, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    java.lang.String xmlUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String htmlUrl, @org.jetbrains.annotations.Nullable()
    java.util.List<com.readrops.api.opml.model.Outline> outlines) {
        super();
    }
    
    /**
     * empty constructor required by SimpleXML
     */
    public Outline() {
        super();
    }
    
    public Outline(@org.jetbrains.annotations.Nullable()
    java.lang.String title) {
        super();
    }
    
    public Outline(@org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String xmlUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String htmlUrl) {
        super();
    }
    
    private final java.lang.String component1() {
        return null;
    }
    
    private final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.readrops.api.opml.model.Outline> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.readrops.api.opml.model.Outline copy(@org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String text, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    java.lang.String xmlUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String htmlUrl, @org.jetbrains.annotations.Nullable()
    java.util.List<com.readrops.api.opml.model.Outline> outlines) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}