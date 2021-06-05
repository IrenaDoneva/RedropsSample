package com.readrops.api.opml.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bH\u00c6\u0003J-\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0004H\u00d6\u0001R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006 "}, d2 = {"Lcom/readrops/api/opml/model/OPML;", "", "()V", "version", "", "head", "Lcom/readrops/api/opml/model/Head;", "body", "Lcom/readrops/api/opml/model/Body;", "(Ljava/lang/String;Lcom/readrops/api/opml/model/Head;Lcom/readrops/api/opml/model/Body;)V", "getBody", "()Lcom/readrops/api/opml/model/Body;", "setBody", "(Lcom/readrops/api/opml/model/Body;)V", "getHead", "()Lcom/readrops/api/opml/model/Head;", "setHead", "(Lcom/readrops/api/opml/model/Head;)V", "getVersion", "()Ljava/lang/String;", "setVersion", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "api_debug"})
@org.simpleframework.xml.Root(name = "opml", strict = false)
@org.simpleframework.xml.Order(elements = {"head", "body"})
public final class OPML {
    @org.jetbrains.annotations.Nullable()
    @org.simpleframework.xml.Attribute(required = true)
    private java.lang.String version;
    @org.jetbrains.annotations.Nullable()
    @org.simpleframework.xml.Element(required = false)
    private com.readrops.api.opml.model.Head head;
    @org.jetbrains.annotations.Nullable()
    @org.simpleframework.xml.Element(required = true)
    private com.readrops.api.opml.model.Body body;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getVersion() {
        return null;
    }
    
    public final void setVersion(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.readrops.api.opml.model.Head getHead() {
        return null;
    }
    
    public final void setHead(@org.jetbrains.annotations.Nullable()
    com.readrops.api.opml.model.Head p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.readrops.api.opml.model.Body getBody() {
        return null;
    }
    
    public final void setBody(@org.jetbrains.annotations.Nullable()
    com.readrops.api.opml.model.Body p0) {
    }
    
    public OPML(@org.jetbrains.annotations.Nullable()
    java.lang.String version, @org.jetbrains.annotations.Nullable()
    com.readrops.api.opml.model.Head head, @org.jetbrains.annotations.Nullable()
    com.readrops.api.opml.model.Body body) {
        super();
    }
    
    /**
     * empty constructor required by SimpleXML
     */
    public OPML() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.readrops.api.opml.model.Head component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.readrops.api.opml.model.Body component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.readrops.api.opml.model.OPML copy(@org.jetbrains.annotations.Nullable()
    java.lang.String version, @org.jetbrains.annotations.Nullable()
    com.readrops.api.opml.model.Head head, @org.jetbrains.annotations.Nullable()
    com.readrops.api.opml.model.Body body) {
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