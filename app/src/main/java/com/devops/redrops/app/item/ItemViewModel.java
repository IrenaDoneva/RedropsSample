package com.devops.redrops.app.item;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;

import androidx.annotation.NonNull;
import androidx.core.content.FileProvider;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.devops.redrops.app.repositories.ARepository;
import com.readrops.db.Database;
import com.readrops.db.entities.Item;
import com.readrops.db.pojo.ItemWithFeed;

import org.koin.java.KoinJavaComponent;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import io.reactivex.Completable;

public class ItemViewModel extends ViewModel {

    private final Database database;

    public ItemViewModel(@NonNull Database database) {
        this.database = database;
    }

    public LiveData<ItemWithFeed> getItemById(int id, boolean starredItem) {
        if (starredItem) {
            return database.starredItemDao().getStarredItemById(id);
        } else {
            return database.itemDao().getItemById(id);
        }
    }

    public Completable setStarState(Item item) {
        return KoinJavaComponent.get(ARepository.class).setItemStarState(item);
    }

    public Uri saveImageInCache(Bitmap bitmap, Context context) throws IOException {
        File imagesFolder = new File(context.getCacheDir().getAbsolutePath(), "images");

        if (!imagesFolder.exists())
            imagesFolder.mkdirs();

        File image = new File(imagesFolder, "shared_image.png");
        OutputStream stream = new FileOutputStream(image);
        bitmap.compress(Bitmap.CompressFormat.PNG, 90, stream);

        stream.flush();
        stream.close();

        return FileProvider.getUriForFile(context, context.getPackageName(), image);
    }
}
