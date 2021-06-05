package com.readrops.api.opml.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\u0015\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u00c6\u0003J\u001b\u0010\u000b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lcom/readrops/api/opml/model/Body;", "", "()V", "outlines", "", "Lcom/readrops/api/opml/model/Outline;", "(Ljava/util/List;)V", "getOutlines", "()Ljava/util/List;", "setOutlines", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "api_debug"})
@org.simpleframework.xml.Root(name = "body", strict = false)
public final class Body {
    @org.jetbrains.annotations.Nullable()
    @org.simpleframework.xml.ElementList(inline = true, required = true)
    private java.util.List<com.readrops.api.opml.model.Outline> outlines;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.readrops.api.opml.model.Outline> getOutlines() {
        return null;
    }
    
    public final void setOutlines(@org.jetbrains.annotations.Nullable()
    java.util.List<com.readrops.api.opml.model.Outline> p0) {
    }
    
    public Body(@org.jetbrains.annotations.Nullable()
    java.util.List<com.readrops.api.opml.model.Outline> outlines) {
        super();
    }
    
    /**
     * empty constructor required by SimpleXMl
     */
    public Body() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.readrops.api.opml.model.Outline> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.readrops.api.opml.model.Body copy(@org.jetbrains.annotations.Nullable()
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