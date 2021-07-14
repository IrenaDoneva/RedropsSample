package com.readrops.app.utils.customviews;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0004\u001d\u001e\u001f B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J@\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\nH\u0016J \u0010\u0019\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0013H\u0016J\u0018\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/readrops/app/utils/customviews/ReadropsItemTouchCallback;", "Landroidx/recyclerview/widget/ItemTouchHelper$SimpleCallback;", "context", "Landroid/content/Context;", "config", "Lcom/readrops/app/utils/customviews/ReadropsItemTouchCallback$Config;", "(Landroid/content/Context;Lcom/readrops/app/utils/customviews/ReadropsItemTouchCallback$Config;)V", "iconHorizontalMargin", "", "isItemViewSwipeEnabled", "", "isLongPressDragEnabled", "onChildDraw", "", "c", "Landroid/graphics/Canvas;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "dX", "", "dY", "actionState", "isCurrentlyActive", "onMove", "target", "onSwiped", "direction", "Config", "MoveCallback", "SwipeCallback", "SwipeDraw", "app_debug"})
public final class ReadropsItemTouchCallback extends androidx.recyclerview.widget.ItemTouchHelper.SimpleCallback {
    private final int iconHorizontalMargin = 40;
    private final android.content.Context context = null;
    private final com.readrops.app.utils.customviews.ReadropsItemTouchCallback.Config config = null;
    
    @java.lang.Override()
    public boolean onMove(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder target) {
        return false;
    }
    
    @java.lang.Override()
    public void onSwiped(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int direction) {
    }
    
    @java.lang.Override()
    public void onChildDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas c, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {
    }
    
    @java.lang.Override()
    public boolean isItemViewSwipeEnabled() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isLongPressDragEnabled() {
        return false;
    }
    
    public ReadropsItemTouchCallback(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.readrops.app.utils.customviews.ReadropsItemTouchCallback.Config config) {
        super(0, 0);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/readrops/app/utils/customviews/ReadropsItemTouchCallback$MoveCallback;", "", "onMove", "", "app_debug"})
    public static abstract interface MoveCallback {
        
        public abstract void onMove();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/readrops/app/utils/customviews/ReadropsItemTouchCallback$SwipeCallback;", "", "onSwipe", "", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "direction", "", "app_debug"})
    public static abstract interface SwipeCallback {
        
        public abstract void onSwipe(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int direction);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\r"}, d2 = {"Lcom/readrops/app/utils/customviews/ReadropsItemTouchCallback$SwipeDraw;", "", "bgColor", "", "iconRes", "drawable", "Landroid/graphics/drawable/Drawable;", "(IILandroid/graphics/drawable/Drawable;)V", "getBgColor", "()I", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "getIconRes", "app_debug"})
    public static final class SwipeDraw {
        private final int bgColor = 0;
        private final int iconRes = 0;
        @org.jetbrains.annotations.Nullable()
        private final android.graphics.drawable.Drawable drawable = null;
        
        public final int getBgColor() {
            return 0;
        }
        
        public final int getIconRes() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.graphics.drawable.Drawable getDrawable() {
            return null;
        }
        
        public SwipeDraw(@androidx.annotation.ColorInt()
        int bgColor, @androidx.annotation.DrawableRes()
        int iconRes, @org.jetbrains.annotations.Nullable()
        android.graphics.drawable.Drawable drawable) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u001aB\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004BI\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011\u00a8\u0006\u001b"}, d2 = {"Lcom/readrops/app/utils/customviews/ReadropsItemTouchCallback$Config;", "", "builder", "Lcom/readrops/app/utils/customviews/ReadropsItemTouchCallback$Config$Builder;", "(Lcom/readrops/app/utils/customviews/ReadropsItemTouchCallback$Config$Builder;)V", "dragDirs", "", "swipeDirs", "moveCallback", "Lcom/readrops/app/utils/customviews/ReadropsItemTouchCallback$MoveCallback;", "swipeCallback", "Lcom/readrops/app/utils/customviews/ReadropsItemTouchCallback$SwipeCallback;", "leftDraw", "Lcom/readrops/app/utils/customviews/ReadropsItemTouchCallback$SwipeDraw;", "rightDraw", "(IILcom/readrops/app/utils/customviews/ReadropsItemTouchCallback$MoveCallback;Lcom/readrops/app/utils/customviews/ReadropsItemTouchCallback$SwipeCallback;Lcom/readrops/app/utils/customviews/ReadropsItemTouchCallback$SwipeDraw;Lcom/readrops/app/utils/customviews/ReadropsItemTouchCallback$SwipeDraw;)V", "getDragDirs", "()I", "getLeftDraw", "()Lcom/readrops/app/utils/customviews/ReadropsItemTouchCallback$SwipeDraw;", "getMoveCallback", "()Lcom/readrops/app/utils/customviews/ReadropsItemTouchCallback$MoveCallback;", "getRightDraw", "getSwipeCallback", "()Lcom/readrops/app/utils/customviews/ReadropsItemTouchCallback$SwipeCallback;", "getSwipeDirs", "Builder", "app_debug"})
    public static final class Config {
        private final int dragDirs = 0;
        private final int swipeDirs = 0;
        @org.jetbrains.annotations.Nullable()
        private final com.readrops.app.utils.customviews.ReadropsItemTouchCallback.MoveCallback moveCallback = null;
        @org.jetbrains.annotations.Nullable()
        private final com.readrops.app.utils.customviews.ReadropsItemTouchCallback.SwipeCallback swipeCallback = null;
        @org.jetbrains.annotations.Nullable()
        private final com.readrops.app.utils.customviews.ReadropsItemTouchCallback.SwipeDraw leftDraw = null;
        @org.jetbrains.annotations.Nullable()
        private final com.readrops.app.utils.customviews.ReadropsItemTouchCallback.SwipeDraw rightDraw = null;
        
        public final int getDragDirs() {
            return 0;
        }
        
        public final int getSwipeDirs() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.readrops.app.utils.customviews.ReadropsItemTouchCallback.MoveCallback getMoveCallback() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.readrops.app.utils.customviews.ReadropsItemTouchCallback.SwipeCallback getSwipeCallback() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.readrops.app.utils.customviews.ReadropsItemTouchCallback.SwipeDraw getLeftDraw() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.readrops.app.utils.customviews.ReadropsItemTouchCallback.SwipeDraw getRightDraw() {
            return null;
        }
        
        public Config(int dragDirs, int swipeDirs, @org.jetbrains.annotations.Nullable()
        com.readrops.app.utils.customviews.ReadropsItemTouchCallback.MoveCallback moveCallback, @org.jetbrains.annotations.Nullable()
        com.readrops.app.utils.customviews.ReadropsItemTouchCallback.SwipeCallback swipeCallback, @org.jetbrains.annotations.Nullable()
        com.readrops.app.utils.customviews.ReadropsItemTouchCallback.SwipeDraw leftDraw, @org.jetbrains.annotations.Nullable()
        com.readrops.app.utils.customviews.ReadropsItemTouchCallback.SwipeDraw rightDraw) {
            super();
        }
        
        public Config() {
            super();
        }
        
        private Config(com.readrops.app.utils.customviews.ReadropsItemTouchCallback.Config.Builder builder) {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J&\u0010\t\u001a\u00020\u00002\b\b\u0001\u0010\u001a\u001a\u00020\u00042\b\b\u0001\u0010\u001b\u001a\u00020\u00042\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fJ&\u0010\u0010\u001a\u00020\u00002\b\b\u0001\u0010\u001a\u001a\u00020\u00042\b\b\u0001\u0010\u001b\u001a\u00020\u00042\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0004R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\"\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\b@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\"\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\f@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\b@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007\u00a8\u0006\u001e"}, d2 = {"Lcom/readrops/app/utils/customviews/ReadropsItemTouchCallback$Config$Builder;", "", "()V", "<set-?>", "", "dragDirs", "getDragDirs", "()I", "Lcom/readrops/app/utils/customviews/ReadropsItemTouchCallback$SwipeDraw;", "leftDraw", "getLeftDraw", "()Lcom/readrops/app/utils/customviews/ReadropsItemTouchCallback$SwipeDraw;", "Lcom/readrops/app/utils/customviews/ReadropsItemTouchCallback$MoveCallback;", "moveCallback", "getMoveCallback", "()Lcom/readrops/app/utils/customviews/ReadropsItemTouchCallback$MoveCallback;", "rightDraw", "getRightDraw", "Lcom/readrops/app/utils/customviews/ReadropsItemTouchCallback$SwipeCallback;", "swipeCallback", "getSwipeCallback", "()Lcom/readrops/app/utils/customviews/ReadropsItemTouchCallback$SwipeCallback;", "swipeDirs", "getSwipeDirs", "build", "Lcom/readrops/app/utils/customviews/ReadropsItemTouchCallback$Config;", "bgColor", "iconRes", "icon", "Landroid/graphics/drawable/Drawable;", "app_debug"})
        public static final class Builder {
            private int dragDirs = 0;
            private int swipeDirs = 0;
            @org.jetbrains.annotations.Nullable()
            private com.readrops.app.utils.customviews.ReadropsItemTouchCallback.MoveCallback moveCallback;
            @org.jetbrains.annotations.Nullable()
            private com.readrops.app.utils.customviews.ReadropsItemTouchCallback.SwipeCallback swipeCallback;
            @org.jetbrains.annotations.Nullable()
            private com.readrops.app.utils.customviews.ReadropsItemTouchCallback.SwipeDraw leftDraw;
            @org.jetbrains.annotations.Nullable()
            private com.readrops.app.utils.customviews.ReadropsItemTouchCallback.SwipeDraw rightDraw;
            
            public final int getDragDirs() {
                return 0;
            }
            
            public final int getSwipeDirs() {
                return 0;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.readrops.app.utils.customviews.ReadropsItemTouchCallback.MoveCallback getMoveCallback() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.readrops.app.utils.customviews.ReadropsItemTouchCallback.SwipeCallback getSwipeCallback() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.readrops.app.utils.customviews.ReadropsItemTouchCallback.SwipeDraw getLeftDraw() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.readrops.app.utils.customviews.ReadropsItemTouchCallback.SwipeDraw getRightDraw() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.readrops.app.utils.customviews.ReadropsItemTouchCallback.Config.Builder dragDirs(int dragDirs) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.readrops.app.utils.customviews.ReadropsItemTouchCallback.Config.Builder swipeDirs(int swipeDirs) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.readrops.app.utils.customviews.ReadropsItemTouchCallback.Config.Builder moveCallback(@org.jetbrains.annotations.NotNull()
            com.readrops.app.utils.customviews.ReadropsItemTouchCallback.MoveCallback moveCallback) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.readrops.app.utils.customviews.ReadropsItemTouchCallback.Config.Builder swipeCallback(@org.jetbrains.annotations.NotNull()
            com.readrops.app.utils.customviews.ReadropsItemTouchCallback.SwipeCallback swipeCallback) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.readrops.app.utils.customviews.ReadropsItemTouchCallback.Config.Builder leftDraw(@androidx.annotation.ColorInt()
            int bgColor, @androidx.annotation.DrawableRes()
            int iconRes, @org.jetbrains.annotations.Nullable()
            @androidx.annotation.Nullable()
            android.graphics.drawable.Drawable icon) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.readrops.app.utils.customviews.ReadropsItemTouchCallback.Config.Builder rightDraw(@androidx.annotation.ColorInt()
            int bgColor, @androidx.annotation.DrawableRes()
            int iconRes, @org.jetbrains.annotations.Nullable()
            @androidx.annotation.Nullable()
            android.graphics.drawable.Drawable icon) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.readrops.app.utils.customviews.ReadropsItemTouchCallback.Config build() {
                return null;
            }
            
            public Builder() {
                super();
            }
        }
    }
}