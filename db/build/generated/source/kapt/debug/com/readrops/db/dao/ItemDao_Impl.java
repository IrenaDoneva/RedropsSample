package com.readrops.db.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.paging.DataSource;
import androidx.paging.DataSource.Factory;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.paging.LimitOffsetDataSource;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.readrops.db.Converters;
import com.readrops.db.entities.Folder;
import com.readrops.db.entities.Item;
import com.readrops.db.pojo.ItemWithFeed;
import com.readrops.db.pojo.StarItem;
import io.reactivex.Completable;
import io.reactivex.Single;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.Void;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.joda.time.LocalDateTime;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ItemDao_Impl implements ItemDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Item> __insertionAdapterOfItem;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter<Item> __deletionAdapterOfItem;

  private final EntityDeletionOrUpdateAdapter<Item> __updateAdapterOfItem;

  private final SharedSQLiteStatement __preparedStmtOfSetReadState;

  private final SharedSQLiteStatement __preparedStmtOfSetAllItemsReadState;

  private final SharedSQLiteStatement __preparedStmtOfSetAllFeedItemsReadState;

  private final SharedSQLiteStatement __preparedStmtOfSetReadItLater;

  private final SharedSQLiteStatement __preparedStmtOfSetReadAndStarState;

  private final SharedSQLiteStatement __preparedStmtOfSetStarState;

  public ItemDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfItem = new EntityInsertionAdapter<Item>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Item` (`id`,`title`,`description`,`clean_description`,`link`,`image_link`,`author`,`pub_date`,`content`,`feed_id`,`guid`,`read_time`,`read`,`starred`,`read_it_later`,`remoteId`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Item value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        if (value.getCleanDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCleanDescription());
        }
        if (value.getLink() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getLink());
        }
        if (value.getImageLink() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getImageLink());
        }
        if (value.getAuthor() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getAuthor());
        }
        final long _tmp;
        _tmp = __converters.fromLocalDateTime(value.getPubDate());
        stmt.bindLong(8, _tmp);
        if (value.getContent() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getContent());
        }
        stmt.bindLong(10, value.getFeedId());
        if (value.getGuid() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getGuid());
        }
        stmt.bindDouble(12, value.getReadTime());
        final int _tmp_1;
        _tmp_1 = value.isRead() ? 1 : 0;
        stmt.bindLong(13, _tmp_1);
        final int _tmp_2;
        _tmp_2 = value.isStarred() ? 1 : 0;
        stmt.bindLong(14, _tmp_2);
        final int _tmp_3;
        _tmp_3 = value.isReadItLater() ? 1 : 0;
        stmt.bindLong(15, _tmp_3);
        if (value.getRemoteId() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getRemoteId());
        }
      }
    };
    this.__deletionAdapterOfItem = new EntityDeletionOrUpdateAdapter<Item>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Item` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Item value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfItem = new EntityDeletionOrUpdateAdapter<Item>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Item` SET `id` = ?,`title` = ?,`description` = ?,`clean_description` = ?,`link` = ?,`image_link` = ?,`author` = ?,`pub_date` = ?,`content` = ?,`feed_id` = ?,`guid` = ?,`read_time` = ?,`read` = ?,`starred` = ?,`read_it_later` = ?,`remoteId` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Item value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        if (value.getCleanDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCleanDescription());
        }
        if (value.getLink() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getLink());
        }
        if (value.getImageLink() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getImageLink());
        }
        if (value.getAuthor() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getAuthor());
        }
        final long _tmp;
        _tmp = __converters.fromLocalDateTime(value.getPubDate());
        stmt.bindLong(8, _tmp);
        if (value.getContent() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getContent());
        }
        stmt.bindLong(10, value.getFeedId());
        if (value.getGuid() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getGuid());
        }
        stmt.bindDouble(12, value.getReadTime());
        final int _tmp_1;
        _tmp_1 = value.isRead() ? 1 : 0;
        stmt.bindLong(13, _tmp_1);
        final int _tmp_2;
        _tmp_2 = value.isStarred() ? 1 : 0;
        stmt.bindLong(14, _tmp_2);
        final int _tmp_3;
        _tmp_3 = value.isReadItLater() ? 1 : 0;
        stmt.bindLong(15, _tmp_3);
        if (value.getRemoteId() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getRemoteId());
        }
        stmt.bindLong(17, value.getId());
      }
    };
    this.__preparedStmtOfSetReadState = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "Update Item Set read = ? Where id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfSetAllItemsReadState = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "Update Item set read = ? Where feed_id In (Select id From Feed Where account_id = ?)";
        return _query;
      }
    };
    this.__preparedStmtOfSetAllFeedItemsReadState = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "Update Item set read = ? Where feed_id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfSetReadItLater = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "Update Item set read_it_later = 1 Where id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfSetReadAndStarState = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "Update Item set read = ?, starred = ? Where remoteId = ?";
        return _query;
      }
    };
    this.__preparedStmtOfSetStarState = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "Update Item set starred = ? Where id = ?";
        return _query;
      }
    };
  }

  @Override
  public Single<Long> insert(final Item entity) {
    return Single.fromCallable(new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfItem.insertAndReturnId(entity);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public long compatInsert(final Item entity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfItem.insertAndReturnId(entity);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Long> insert(final List<Item> entities) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      List<Long> _result = __insertionAdapterOfItem.insertAndReturnIdsList(entities);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Completable delete(final Item entity) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfItem.handle(entity);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable delete(final List<Item> entities) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfItem.handleMultiple(entities);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable update(final Item entity) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfItem.handle(entity);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable update(final List<Item> entities) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfItem.handleMultiple(entities);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable setReadState(final int itemId, final boolean read) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfSetReadState.acquire();
        int _argIndex = 1;
        final int _tmp;
        _tmp = read ? 1 : 0;
        _stmt.bindLong(_argIndex, _tmp);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, itemId);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
          __preparedStmtOfSetReadState.release(_stmt);
        }
      }
    });
  }

  @Override
  public Completable setAllItemsReadState(final int readState, final int accountId) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfSetAllItemsReadState.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, readState);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, accountId);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
          __preparedStmtOfSetAllItemsReadState.release(_stmt);
        }
      }
    });
  }

  @Override
  public Completable setAllFeedItemsReadState(final int feedId, final int readState) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfSetAllFeedItemsReadState.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, readState);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, feedId);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
          __preparedStmtOfSetAllFeedItemsReadState.release(_stmt);
        }
      }
    });
  }

  @Override
  public Completable setReadItLater(final int itemId) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfSetReadItLater.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, itemId);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
          __preparedStmtOfSetReadItLater.release(_stmt);
        }
      }
    });
  }

  @Override
  public void setReadAndStarState(final String remoteId, final boolean read,
      final boolean starred) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfSetReadAndStarState.acquire();
    int _argIndex = 1;
    final int _tmp;
    _tmp = read ? 1 : 0;
    _stmt.bindLong(_argIndex, _tmp);
    _argIndex = 2;
    final int _tmp_1;
    _tmp_1 = starred ? 1 : 0;
    _stmt.bindLong(_argIndex, _tmp_1);
    _argIndex = 3;
    if (remoteId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, remoteId);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfSetReadAndStarState.release(_stmt);
    }
  }

  @Override
  public Completable setStarState(final int itemId, final boolean starred) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfSetStarState.acquire();
        int _argIndex = 1;
        final int _tmp;
        _tmp = starred ? 1 : 0;
        _stmt.bindLong(_argIndex, _tmp);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, itemId);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
          __preparedStmtOfSetStarState.release(_stmt);
        }
      }
    });
  }

  @Override
  public Item select(final int itemId) {
    final String _sql = "Select * From Item Where id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, itemId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfCleanDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "clean_description");
      final int _cursorIndexOfLink = CursorUtil.getColumnIndexOrThrow(_cursor, "link");
      final int _cursorIndexOfImageLink = CursorUtil.getColumnIndexOrThrow(_cursor, "image_link");
      final int _cursorIndexOfAuthor = CursorUtil.getColumnIndexOrThrow(_cursor, "author");
      final int _cursorIndexOfPubDate = CursorUtil.getColumnIndexOrThrow(_cursor, "pub_date");
      final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
      final int _cursorIndexOfFeedId = CursorUtil.getColumnIndexOrThrow(_cursor, "feed_id");
      final int _cursorIndexOfGuid = CursorUtil.getColumnIndexOrThrow(_cursor, "guid");
      final int _cursorIndexOfReadTime = CursorUtil.getColumnIndexOrThrow(_cursor, "read_time");
      final int _cursorIndexOfRead = CursorUtil.getColumnIndexOrThrow(_cursor, "read");
      final int _cursorIndexOfStarred = CursorUtil.getColumnIndexOrThrow(_cursor, "starred");
      final int _cursorIndexOfReadItLater = CursorUtil.getColumnIndexOrThrow(_cursor, "read_it_later");
      final int _cursorIndexOfRemoteId = CursorUtil.getColumnIndexOrThrow(_cursor, "remoteId");
      final Item _result;
      if(_cursor.moveToFirst()) {
        _result = new Item();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _result.setId(_tmpId);
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        _result.setTitle(_tmpTitle);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        _result.setDescription(_tmpDescription);
        final String _tmpCleanDescription;
        _tmpCleanDescription = _cursor.getString(_cursorIndexOfCleanDescription);
        _result.setCleanDescription(_tmpCleanDescription);
        final String _tmpLink;
        _tmpLink = _cursor.getString(_cursorIndexOfLink);
        _result.setLink(_tmpLink);
        final String _tmpImageLink;
        _tmpImageLink = _cursor.getString(_cursorIndexOfImageLink);
        _result.setImageLink(_tmpImageLink);
        final String _tmpAuthor;
        _tmpAuthor = _cursor.getString(_cursorIndexOfAuthor);
        _result.setAuthor(_tmpAuthor);
        final LocalDateTime _tmpPubDate;
        final long _tmp;
        _tmp = _cursor.getLong(_cursorIndexOfPubDate);
        _tmpPubDate = __converters.fromTimeStamp(_tmp);
        _result.setPubDate(_tmpPubDate);
        final String _tmpContent;
        _tmpContent = _cursor.getString(_cursorIndexOfContent);
        _result.setContent(_tmpContent);
        final int _tmpFeedId;
        _tmpFeedId = _cursor.getInt(_cursorIndexOfFeedId);
        _result.setFeedId(_tmpFeedId);
        final String _tmpGuid;
        _tmpGuid = _cursor.getString(_cursorIndexOfGuid);
        _result.setGuid(_tmpGuid);
        final double _tmpReadTime;
        _tmpReadTime = _cursor.getDouble(_cursorIndexOfReadTime);
        _result.setReadTime(_tmpReadTime);
        final boolean _tmpRead;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfRead);
        _tmpRead = _tmp_1 != 0;
        _result.setRead(_tmpRead);
        final boolean _tmpStarred;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfStarred);
        _tmpStarred = _tmp_2 != 0;
        _result.setStarred(_tmpStarred);
        final boolean _tmpReadItLater;
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfReadItLater);
        _tmpReadItLater = _tmp_3 != 0;
        _result.setReadItLater(_tmpReadItLater);
        final String _tmpRemoteId;
        _tmpRemoteId = _cursor.getString(_cursorIndexOfRemoteId);
        _result.setRemoteId(_tmpRemoteId);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public boolean itemExists(final String guid, final int accountId) {
    final String _sql = "Select case When ? In (Select guid From Item Inner Join Feed on Item.feed_id = Feed.id and account_id = ?) Then 1 else 0 end";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (guid == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, guid);
    }
    _argIndex = 2;
    _statement.bindLong(_argIndex, accountId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final boolean _result;
      if(_cursor.moveToFirst()) {
        final int _tmp;
        _tmp = _cursor.getInt(0);
        _result = _tmp != 0;
      } else {
        _result = false;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public boolean remoteItemExists(final String remoteId, final int feedId) {
    final String _sql = "Select case When ? In (Select remoteId from Item) And ? In (Select feed_id From Item) Then 1 else 0 end";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (remoteId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, remoteId);
    }
    _argIndex = 2;
    _statement.bindLong(_argIndex, feedId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final boolean _result;
      if(_cursor.moveToFirst()) {
        final int _tmp;
        _tmp = _cursor.getInt(0);
        _result = _tmp != 0;
      } else {
        _result = false;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Item selectByRemoteId(final String remoteId, final int feedId) {
    final String _sql = "Select * From Item Where remoteId = ? And feed_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (remoteId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, remoteId);
    }
    _argIndex = 2;
    _statement.bindLong(_argIndex, feedId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfCleanDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "clean_description");
      final int _cursorIndexOfLink = CursorUtil.getColumnIndexOrThrow(_cursor, "link");
      final int _cursorIndexOfImageLink = CursorUtil.getColumnIndexOrThrow(_cursor, "image_link");
      final int _cursorIndexOfAuthor = CursorUtil.getColumnIndexOrThrow(_cursor, "author");
      final int _cursorIndexOfPubDate = CursorUtil.getColumnIndexOrThrow(_cursor, "pub_date");
      final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
      final int _cursorIndexOfFeedId = CursorUtil.getColumnIndexOrThrow(_cursor, "feed_id");
      final int _cursorIndexOfGuid = CursorUtil.getColumnIndexOrThrow(_cursor, "guid");
      final int _cursorIndexOfReadTime = CursorUtil.getColumnIndexOrThrow(_cursor, "read_time");
      final int _cursorIndexOfRead = CursorUtil.getColumnIndexOrThrow(_cursor, "read");
      final int _cursorIndexOfStarred = CursorUtil.getColumnIndexOrThrow(_cursor, "starred");
      final int _cursorIndexOfReadItLater = CursorUtil.getColumnIndexOrThrow(_cursor, "read_it_later");
      final int _cursorIndexOfRemoteId = CursorUtil.getColumnIndexOrThrow(_cursor, "remoteId");
      final Item _result;
      if(_cursor.moveToFirst()) {
        _result = new Item();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _result.setId(_tmpId);
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        _result.setTitle(_tmpTitle);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        _result.setDescription(_tmpDescription);
        final String _tmpCleanDescription;
        _tmpCleanDescription = _cursor.getString(_cursorIndexOfCleanDescription);
        _result.setCleanDescription(_tmpCleanDescription);
        final String _tmpLink;
        _tmpLink = _cursor.getString(_cursorIndexOfLink);
        _result.setLink(_tmpLink);
        final String _tmpImageLink;
        _tmpImageLink = _cursor.getString(_cursorIndexOfImageLink);
        _result.setImageLink(_tmpImageLink);
        final String _tmpAuthor;
        _tmpAuthor = _cursor.getString(_cursorIndexOfAuthor);
        _result.setAuthor(_tmpAuthor);
        final LocalDateTime _tmpPubDate;
        final long _tmp;
        _tmp = _cursor.getLong(_cursorIndexOfPubDate);
        _tmpPubDate = __converters.fromTimeStamp(_tmp);
        _result.setPubDate(_tmpPubDate);
        final String _tmpContent;
        _tmpContent = _cursor.getString(_cursorIndexOfContent);
        _result.setContent(_tmpContent);
        final int _tmpFeedId;
        _tmpFeedId = _cursor.getInt(_cursorIndexOfFeedId);
        _result.setFeedId(_tmpFeedId);
        final String _tmpGuid;
        _tmpGuid = _cursor.getString(_cursorIndexOfGuid);
        _result.setGuid(_tmpGuid);
        final double _tmpReadTime;
        _tmpReadTime = _cursor.getDouble(_cursorIndexOfReadTime);
        _result.setReadTime(_tmpReadTime);
        final boolean _tmpRead;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfRead);
        _tmpRead = _tmp_1 != 0;
        _result.setRead(_tmpRead);
        final boolean _tmpStarred;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfStarred);
        _tmpStarred = _tmp_2 != 0;
        _result.setStarred(_tmpStarred);
        final boolean _tmpReadItLater;
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfReadItLater);
        _tmpReadItLater = _tmp_3 != 0;
        _result.setReadItLater(_tmpReadItLater);
        final String _tmpRemoteId;
        _tmpRemoteId = _cursor.getString(_cursorIndexOfRemoteId);
        _result.setRemoteId(_tmpRemoteId);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int getUnreadCount(final int feedId) {
    final String _sql = "Select count(*) From Item Where feed_id = ? And read = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, feedId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<ItemWithFeed> getItemById(final int id) {
    final String _sql = "Select Item.id, title, Item.description, content, link, pub_date, image_link, author, read, text_color, background_color, read_time, starred, Feed.name, Feed.id as feedId, siteUrl, Folder.id as folder_id, Folder.name as folder_name from Item Inner Join Feed On Item.feed_id = Feed.id Left Join Folder on Folder.id = Feed.folder_id Where Item.id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return __db.getInvalidationTracker().createLiveData(new String[]{"Item","Feed","Folder"}, false, new Callable<ItemWithFeed>() {
      @Override
      public ItemWithFeed call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
          final int _cursorIndexOfLink = CursorUtil.getColumnIndexOrThrow(_cursor, "link");
          final int _cursorIndexOfPubDate = CursorUtil.getColumnIndexOrThrow(_cursor, "pub_date");
          final int _cursorIndexOfImageLink = CursorUtil.getColumnIndexOrThrow(_cursor, "image_link");
          final int _cursorIndexOfAuthor = CursorUtil.getColumnIndexOrThrow(_cursor, "author");
          final int _cursorIndexOfRead = CursorUtil.getColumnIndexOrThrow(_cursor, "read");
          final int _cursorIndexOfColor = CursorUtil.getColumnIndexOrThrow(_cursor, "text_color");
          final int _cursorIndexOfBgColor = CursorUtil.getColumnIndexOrThrow(_cursor, "background_color");
          final int _cursorIndexOfReadTime = CursorUtil.getColumnIndexOrThrow(_cursor, "read_time");
          final int _cursorIndexOfStarred = CursorUtil.getColumnIndexOrThrow(_cursor, "starred");
          final int _cursorIndexOfFeedName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfFeedId = CursorUtil.getColumnIndexOrThrow(_cursor, "feedId");
          final int _cursorIndexOfWebsiteUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "siteUrl");
          final int _cursorIndexOfId_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "folder_id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "folder_name");
          final ItemWithFeed _result;
          if(_cursor.moveToFirst()) {
            final Item _tmpItem;
            if (! (_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfTitle) && _cursor.isNull(_cursorIndexOfDescription) && _cursor.isNull(_cursorIndexOfContent) && _cursor.isNull(_cursorIndexOfLink) && _cursor.isNull(_cursorIndexOfPubDate) && _cursor.isNull(_cursorIndexOfImageLink) && _cursor.isNull(_cursorIndexOfAuthor) && _cursor.isNull(_cursorIndexOfRead) && _cursor.isNull(_cursorIndexOfReadTime) && _cursor.isNull(_cursorIndexOfStarred))) {
              _tmpItem = new Item();
              final int _tmpId;
              _tmpId = _cursor.getInt(_cursorIndexOfId);
              _tmpItem.setId(_tmpId);
              final String _tmpTitle;
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
              _tmpItem.setTitle(_tmpTitle);
              final String _tmpDescription;
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
              _tmpItem.setDescription(_tmpDescription);
              final String _tmpContent;
              _tmpContent = _cursor.getString(_cursorIndexOfContent);
              _tmpItem.setContent(_tmpContent);
              final String _tmpLink;
              _tmpLink = _cursor.getString(_cursorIndexOfLink);
              _tmpItem.setLink(_tmpLink);
              final LocalDateTime _tmpPubDate;
              final long _tmp;
              _tmp = _cursor.getLong(_cursorIndexOfPubDate);
              _tmpPubDate = __converters.fromTimeStamp(_tmp);
              _tmpItem.setPubDate(_tmpPubDate);
              final String _tmpImageLink;
              _tmpImageLink = _cursor.getString(_cursorIndexOfImageLink);
              _tmpItem.setImageLink(_tmpImageLink);
              final String _tmpAuthor;
              _tmpAuthor = _cursor.getString(_cursorIndexOfAuthor);
              _tmpItem.setAuthor(_tmpAuthor);
              final boolean _tmpRead;
              final int _tmp_1;
              _tmp_1 = _cursor.getInt(_cursorIndexOfRead);
              _tmpRead = _tmp_1 != 0;
              _tmpItem.setRead(_tmpRead);
              final double _tmpReadTime;
              _tmpReadTime = _cursor.getDouble(_cursorIndexOfReadTime);
              _tmpItem.setReadTime(_tmpReadTime);
              final boolean _tmpStarred;
              final int _tmp_2;
              _tmp_2 = _cursor.getInt(_cursorIndexOfStarred);
              _tmpStarred = _tmp_2 != 0;
              _tmpItem.setStarred(_tmpStarred);
            }  else  {
              _tmpItem = null;
            }
            final Folder _tmpFolder;
            if (! (_cursor.isNull(_cursorIndexOfId_1) && _cursor.isNull(_cursorIndexOfName))) {
              _tmpFolder = new Folder();
              final int _tmpId_1;
              _tmpId_1 = _cursor.getInt(_cursorIndexOfId_1);
              _tmpFolder.setId(_tmpId_1);
              final String _tmpName;
              _tmpName = _cursor.getString(_cursorIndexOfName);
              _tmpFolder.setName(_tmpName);
            }  else  {
              _tmpFolder = null;
            }
            _result = new ItemWithFeed();
            final int _tmpColor;
            _tmpColor = _cursor.getInt(_cursorIndexOfColor);
            _result.setColor(_tmpColor);
            final int _tmpBgColor;
            _tmpBgColor = _cursor.getInt(_cursorIndexOfBgColor);
            _result.setBgColor(_tmpBgColor);
            final String _tmpFeedName;
            _tmpFeedName = _cursor.getString(_cursorIndexOfFeedName);
            _result.setFeedName(_tmpFeedName);
            final int _tmpFeedId;
            _tmpFeedId = _cursor.getInt(_cursorIndexOfFeedId);
            _result.setFeedId(_tmpFeedId);
            final String _tmpWebsiteUrl;
            _tmpWebsiteUrl = _cursor.getString(_cursorIndexOfWebsiteUrl);
            _result.setWebsiteUrl(_tmpWebsiteUrl);
            _result.setItem(_tmpItem);
            _result.setFolder(_tmpFolder);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public List<String> getReadChanges(final int accountId) {
    final String _sql = "Select Item.remoteId From Item Inner Join Feed On Item.feed_id = Feed.id Where read = 1 And account_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, accountId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final List<String> _result = new ArrayList<String>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final String _item;
        _item = _cursor.getString(0);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<String> getUnreadChanges(final int accountId) {
    final String _sql = "Select Item.remoteId From Item Inner Join Feed On Item.feed_id = Feed.id Where read = 0 And account_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, accountId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final List<String> _result = new ArrayList<String>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final String _item;
        _item = _cursor.getString(0);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<StarItem> getStarChanges(final int accountId) {
    final String _sql = "Select Item.guid, Feed.remoteId as feedRemoteId From Item Inner Join Feed On Item.feed_id = Feed.id Where starred = 1 And account_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, accountId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfGuidHash = CursorUtil.getColumnIndexOrThrow(_cursor, "guid");
      final int _cursorIndexOfFeedRemoteId = CursorUtil.getColumnIndexOrThrow(_cursor, "feedRemoteId");
      final List<StarItem> _result = new ArrayList<StarItem>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final StarItem _item;
        final String _tmpGuidHash;
        _tmpGuidHash = _cursor.getString(_cursorIndexOfGuidHash);
        final String _tmpFeedRemoteId;
        _tmpFeedRemoteId = _cursor.getString(_cursorIndexOfFeedRemoteId);
        _item = new StarItem(_tmpFeedRemoteId,_tmpGuidHash);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<StarItem> getUnstarChanges(final int accountId) {
    final String _sql = "Select Item.guid, Feed.remoteId as feedRemoteId From Item Inner Join Feed On Item.feed_id = Feed.id Where starred = 0 And account_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, accountId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfGuidHash = CursorUtil.getColumnIndexOrThrow(_cursor, "guid");
      final int _cursorIndexOfFeedRemoteId = CursorUtil.getColumnIndexOrThrow(_cursor, "feedRemoteId");
      final List<StarItem> _result = new ArrayList<StarItem>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final StarItem _item;
        final String _tmpGuidHash;
        _tmpGuidHash = _cursor.getString(_cursorIndexOfGuidHash);
        final String _tmpFeedRemoteId;
        _tmpFeedRemoteId = _cursor.getString(_cursorIndexOfFeedRemoteId);
        _item = new StarItem(_tmpFeedRemoteId,_tmpGuidHash);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public DataSource.Factory<Integer, ItemWithFeed> selectAll(final SupportSQLiteQuery query) {
    final SupportSQLiteQuery _internalQuery = query;
    return new DataSource.Factory<Integer, ItemWithFeed>() {
      @Override
      public LimitOffsetDataSource<ItemWithFeed> create() {
        return new LimitOffsetDataSource<ItemWithFeed>(__db, _internalQuery, false , "Item", "Folder", "Feed", "UnreadItemsIds") {
          @Override
          protected List<ItemWithFeed> convertRows(Cursor cursor) {
            final int _cursorIndexOfFeedName = CursorUtil.getColumnIndex(cursor, "name");
            final int _cursorIndexOfFeedId = CursorUtil.getColumnIndex(cursor, "feedId");
            final int _cursorIndexOfColor = CursorUtil.getColumnIndex(cursor, "text_color");
            final int _cursorIndexOfBgColor = CursorUtil.getColumnIndex(cursor, "background_color");
            final int _cursorIndexOfFeedIconUrl = CursorUtil.getColumnIndex(cursor, "icon_url");
            final int _cursorIndexOfWebsiteUrl = CursorUtil.getColumnIndex(cursor, "siteUrl");
            final int _cursorIndexOfId = CursorUtil.getColumnIndex(cursor, "id");
            final int _cursorIndexOfTitle = CursorUtil.getColumnIndex(cursor, "title");
            final int _cursorIndexOfDescription = CursorUtil.getColumnIndex(cursor, "description");
            final int _cursorIndexOfCleanDescription = CursorUtil.getColumnIndex(cursor, "clean_description");
            final int _cursorIndexOfLink = CursorUtil.getColumnIndex(cursor, "link");
            final int _cursorIndexOfImageLink = CursorUtil.getColumnIndex(cursor, "image_link");
            final int _cursorIndexOfAuthor = CursorUtil.getColumnIndex(cursor, "author");
            final int _cursorIndexOfPubDate = CursorUtil.getColumnIndex(cursor, "pub_date");
            final int _cursorIndexOfContent = CursorUtil.getColumnIndex(cursor, "content");
            final int _cursorIndexOfFeedId_1 = CursorUtil.getColumnIndex(cursor, "feed_id");
            final int _cursorIndexOfGuid = CursorUtil.getColumnIndex(cursor, "guid");
            final int _cursorIndexOfReadTime = CursorUtil.getColumnIndex(cursor, "read_time");
            final int _cursorIndexOfRead = CursorUtil.getColumnIndex(cursor, "read");
            final int _cursorIndexOfStarred = CursorUtil.getColumnIndex(cursor, "starred");
            final int _cursorIndexOfReadItLater = CursorUtil.getColumnIndex(cursor, "read_it_later");
            final int _cursorIndexOfRemoteId = CursorUtil.getColumnIndex(cursor, "remoteId");
            final int _cursorIndexOfId_1 = CursorUtil.getColumnIndex(cursor, "folder_id");
            final int _cursorIndexOfName = CursorUtil.getColumnIndex(cursor, "folder_name");
            final int _cursorIndexOfRemoteId_1 = CursorUtil.getColumnIndex(cursor, "folder_remoteId");
            final int _cursorIndexOfAccountId = CursorUtil.getColumnIndex(cursor, "folder_account_id");
            final List<ItemWithFeed> _res = new ArrayList<ItemWithFeed>(cursor.getCount());
            while(cursor.moveToNext()) {
              final ItemWithFeed _item;
              final Item _tmpItem;
              if (! (( _cursorIndexOfId == -1 || cursor.isNull(_cursorIndexOfId)) && ( _cursorIndexOfTitle == -1 || cursor.isNull(_cursorIndexOfTitle)) && ( _cursorIndexOfDescription == -1 || cursor.isNull(_cursorIndexOfDescription)) && ( _cursorIndexOfCleanDescription == -1 || cursor.isNull(_cursorIndexOfCleanDescription)) && ( _cursorIndexOfLink == -1 || cursor.isNull(_cursorIndexOfLink)) && ( _cursorIndexOfImageLink == -1 || cursor.isNull(_cursorIndexOfImageLink)) && ( _cursorIndexOfAuthor == -1 || cursor.isNull(_cursorIndexOfAuthor)) && ( _cursorIndexOfPubDate == -1 || cursor.isNull(_cursorIndexOfPubDate)) && ( _cursorIndexOfContent == -1 || cursor.isNull(_cursorIndexOfContent)) && ( _cursorIndexOfFeedId_1 == -1 || cursor.isNull(_cursorIndexOfFeedId_1)) && ( _cursorIndexOfGuid == -1 || cursor.isNull(_cursorIndexOfGuid)) && ( _cursorIndexOfReadTime == -1 || cursor.isNull(_cursorIndexOfReadTime)) && ( _cursorIndexOfRead == -1 || cursor.isNull(_cursorIndexOfRead)) && ( _cursorIndexOfStarred == -1 || cursor.isNull(_cursorIndexOfStarred)) && ( _cursorIndexOfReadItLater == -1 || cursor.isNull(_cursorIndexOfReadItLater)) && ( _cursorIndexOfRemoteId == -1 || cursor.isNull(_cursorIndexOfRemoteId)))) {
                _tmpItem = new Item();
                if (_cursorIndexOfId != -1) {
                  final int _tmpId;
                  _tmpId = cursor.getInt(_cursorIndexOfId);
                  _tmpItem.setId(_tmpId);
                }
                if (_cursorIndexOfTitle != -1) {
                  final String _tmpTitle;
                  _tmpTitle = cursor.getString(_cursorIndexOfTitle);
                  _tmpItem.setTitle(_tmpTitle);
                }
                if (_cursorIndexOfDescription != -1) {
                  final String _tmpDescription;
                  _tmpDescription = cursor.getString(_cursorIndexOfDescription);
                  _tmpItem.setDescription(_tmpDescription);
                }
                if (_cursorIndexOfCleanDescription != -1) {
                  final String _tmpCleanDescription;
                  _tmpCleanDescription = cursor.getString(_cursorIndexOfCleanDescription);
                  _tmpItem.setCleanDescription(_tmpCleanDescription);
                }
                if (_cursorIndexOfLink != -1) {
                  final String _tmpLink;
                  _tmpLink = cursor.getString(_cursorIndexOfLink);
                  _tmpItem.setLink(_tmpLink);
                }
                if (_cursorIndexOfImageLink != -1) {
                  final String _tmpImageLink;
                  _tmpImageLink = cursor.getString(_cursorIndexOfImageLink);
                  _tmpItem.setImageLink(_tmpImageLink);
                }
                if (_cursorIndexOfAuthor != -1) {
                  final String _tmpAuthor;
                  _tmpAuthor = cursor.getString(_cursorIndexOfAuthor);
                  _tmpItem.setAuthor(_tmpAuthor);
                }
                if (_cursorIndexOfPubDate != -1) {
                  final LocalDateTime _tmpPubDate;
                  final long _tmp;
                  _tmp = cursor.getLong(_cursorIndexOfPubDate);
                  _tmpPubDate = __converters.fromTimeStamp(_tmp);
                  _tmpItem.setPubDate(_tmpPubDate);
                }
                if (_cursorIndexOfContent != -1) {
                  final String _tmpContent;
                  _tmpContent = cursor.getString(_cursorIndexOfContent);
                  _tmpItem.setContent(_tmpContent);
                }
                if (_cursorIndexOfFeedId_1 != -1) {
                  final int _tmpFeedId;
                  _tmpFeedId = cursor.getInt(_cursorIndexOfFeedId_1);
                  _tmpItem.setFeedId(_tmpFeedId);
                }
                if (_cursorIndexOfGuid != -1) {
                  final String _tmpGuid;
                  _tmpGuid = cursor.getString(_cursorIndexOfGuid);
                  _tmpItem.setGuid(_tmpGuid);
                }
                if (_cursorIndexOfReadTime != -1) {
                  final double _tmpReadTime;
                  _tmpReadTime = cursor.getDouble(_cursorIndexOfReadTime);
                  _tmpItem.setReadTime(_tmpReadTime);
                }
                if (_cursorIndexOfRead != -1) {
                  final boolean _tmpRead;
                  final int _tmp_1;
                  _tmp_1 = cursor.getInt(_cursorIndexOfRead);
                  _tmpRead = _tmp_1 != 0;
                  _tmpItem.setRead(_tmpRead);
                }
                if (_cursorIndexOfStarred != -1) {
                  final boolean _tmpStarred;
                  final int _tmp_2;
                  _tmp_2 = cursor.getInt(_cursorIndexOfStarred);
                  _tmpStarred = _tmp_2 != 0;
                  _tmpItem.setStarred(_tmpStarred);
                }
                if (_cursorIndexOfReadItLater != -1) {
                  final boolean _tmpReadItLater;
                  final int _tmp_3;
                  _tmp_3 = cursor.getInt(_cursorIndexOfReadItLater);
                  _tmpReadItLater = _tmp_3 != 0;
                  _tmpItem.setReadItLater(_tmpReadItLater);
                }
                if (_cursorIndexOfRemoteId != -1) {
                  final String _tmpRemoteId;
                  _tmpRemoteId = cursor.getString(_cursorIndexOfRemoteId);
                  _tmpItem.setRemoteId(_tmpRemoteId);
                }
              }  else  {
                _tmpItem = null;
              }
              final Folder _tmpFolder;
              if (! (( _cursorIndexOfId_1 == -1 || cursor.isNull(_cursorIndexOfId_1)) && ( _cursorIndexOfName == -1 || cursor.isNull(_cursorIndexOfName)) && ( _cursorIndexOfRemoteId_1 == -1 || cursor.isNull(_cursorIndexOfRemoteId_1)) && ( _cursorIndexOfAccountId == -1 || cursor.isNull(_cursorIndexOfAccountId)))) {
                _tmpFolder = new Folder();
                if (_cursorIndexOfId_1 != -1) {
                  final int _tmpId_1;
                  _tmpId_1 = cursor.getInt(_cursorIndexOfId_1);
                  _tmpFolder.setId(_tmpId_1);
                }
                if (_cursorIndexOfName != -1) {
                  final String _tmpName;
                  _tmpName = cursor.getString(_cursorIndexOfName);
                  _tmpFolder.setName(_tmpName);
                }
                if (_cursorIndexOfRemoteId_1 != -1) {
                  final String _tmpRemoteId_1;
                  _tmpRemoteId_1 = cursor.getString(_cursorIndexOfRemoteId_1);
                  _tmpFolder.setRemoteId(_tmpRemoteId_1);
                }
                if (_cursorIndexOfAccountId != -1) {
                  final int _tmpAccountId;
                  _tmpAccountId = cursor.getInt(_cursorIndexOfAccountId);
                  _tmpFolder.setAccountId(_tmpAccountId);
                }
              }  else  {
                _tmpFolder = null;
              }
              _item = new ItemWithFeed();
              if (_cursorIndexOfFeedName != -1) {
                final String _tmpFeedName;
                _tmpFeedName = cursor.getString(_cursorIndexOfFeedName);
                _item.setFeedName(_tmpFeedName);
              }
              if (_cursorIndexOfFeedId != -1) {
                final int _tmpFeedId_1;
                _tmpFeedId_1 = cursor.getInt(_cursorIndexOfFeedId);
                _item.setFeedId(_tmpFeedId_1);
              }
              if (_cursorIndexOfColor != -1) {
                final int _tmpColor;
                _tmpColor = cursor.getInt(_cursorIndexOfColor);
                _item.setColor(_tmpColor);
              }
              if (_cursorIndexOfBgColor != -1) {
                final int _tmpBgColor;
                _tmpBgColor = cursor.getInt(_cursorIndexOfBgColor);
                _item.setBgColor(_tmpBgColor);
              }
              if (_cursorIndexOfFeedIconUrl != -1) {
                final String _tmpFeedIconUrl;
                _tmpFeedIconUrl = cursor.getString(_cursorIndexOfFeedIconUrl);
                _item.setFeedIconUrl(_tmpFeedIconUrl);
              }
              if (_cursorIndexOfWebsiteUrl != -1) {
                final String _tmpWebsiteUrl;
                _tmpWebsiteUrl = cursor.getString(_cursorIndexOfWebsiteUrl);
                _item.setWebsiteUrl(_tmpWebsiteUrl);
              }
              _item.setItem(_tmpItem);
              _item.setFolder(_tmpFolder);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    };
  }
}
