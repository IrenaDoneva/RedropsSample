package com.readrops.app.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J1\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0010\"\u00020\bH\u0007\u00a2\u0006\u0002\u0010\u0011J1\u0010\t\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0010\"\u00020\bH\u0007\u00a2\u0006\u0002\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/readrops/app/utils/PermissionManager;", "", "()V", "isPermissionGranted", "", "context", "Landroid/content/Context;", "permission", "", "requestPermissions", "", "activity", "Landroid/app/Activity;", "requestCode", "", "permissions", "", "(Landroid/app/Activity;I[Ljava/lang/String;)V", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;I[Ljava/lang/String;)V", "app_debug"})
public final class PermissionManager {
    @org.jetbrains.annotations.NotNull()
    public static final com.readrops.app.utils.PermissionManager INSTANCE = null;
    
    public static final boolean isPermissionGranted(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String permission) {
        return false;
    }
    
    public static final void requestPermissions(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String... permissions) {
    }
    
    public static final void requestPermissions(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String... permissions) {
    }
    
    private PermissionManager() {
        super();
    }
}