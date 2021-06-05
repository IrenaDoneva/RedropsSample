package com.readrops.db.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EmptyResultSetException;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.readrops.db.entities.Feed;
import com.readrops.db.entities.Folder;
import com.readrops.db.entities.account.Account;
import com.readrops.db.pojo.FeedWithFolder;
import io.reactivex.Completable;
import io.reactivex.Single;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.lang.Void;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class FeedDao_Impl extends FeedDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Feed> __insertionAdapterOfFeed;

  private final EntityDeletionOrUpdateAdapter<Feed> __deletionAdapterOfFeed;

  private final EntityDeletionOrUpdateAdapter<Feed> __updateAdapterOfFeed;

  private final SharedSQLiteStatement __preparedStmtOfUpdateHeaders;

  private final SharedSQLiteStatement __preparedStmtOfUpdateFeedFields;

  private final SharedSQLiteStatement __preparedStmtOfUpdateNameAndFolder;

  private final SharedSQLiteStatement __preparedStmtOfUpdateColors;

  private final SharedSQLiteStatement __preparedStmtOfUpdateFeedNotificationState;

  private final SharedSQLiteStatement __preparedStmtOfUpdateAllFeedsNotificationState;

  public FeedDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFeed = new EntityInsertionAdapter<Feed>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Feed` (`id`,`name`,`description`,`url`,`siteUrl`,`lastUpdated`,`text_color`,`background_color`,`icon_url`,`etag`,`last_modified`,`folder_id`,`remoteId`,`account_id`,`notification_enabled`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Feed value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getUrl());
        }
        if (value.getSiteUrl() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getSiteUrl());
        }
        if (value.getLastUpdated() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getLastUpdated());
        }
        stmt.bindLong(7, value.getTextColor());
        stmt.bindLong(8, value.getBackgroundColor());
        if (value.getIconUrl() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getIconUrl());
        }
        if (value.getEtag() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getEtag());
        }
        if (value.getLastModified() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getLastModified());
        }
        if (value.getFolderId() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindLong(12, value.getFolderId());
        }
        if (value.getRemoteId() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getRemoteId());
        }
        stmt.bindLong(14, value.getAccountId());
        final int _tmp;
        _tmp = value.isNotificationEnabled() ? 1 : 0;
        stmt.bindLong(15, _tmp);
      }
    };
    this.__deletionAdapterOfFeed = new EntityDeletionOrUpdateAdapter<Feed>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Feed` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Feed value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfFeed = new EntityDeletionOrUpdateAdapter<Feed>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Feed` SET `id` = ?,`name` = ?,`description` = ?,`url` = ?,`siteUrl` = ?,`lastUpdated` = ?,`text_color` = ?,`background_color` = ?,`icon_url` = ?,`etag` = ?,`last_modified` = ?,`folder_id` = ?,`remoteId` = ?,`account_id` = ?,`notification_enabled` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Feed value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getUrl());
        }
        if (value.getSiteUrl() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getSiteUrl());
        }
        if (value.getLastUpdated() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getLastUpdated());
        }
        stmt.bindLong(7, value.getTextColor());
        stmt.bindLong(8, value.getBackgroundColor());
        if (value.getIconUrl() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getIconUrl());
        }
        if (value.getEtag() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getEtag());
        }
        if (value.getLastModified() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getLastModified());
        }
        if (value.getFolderId() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindLong(12, value.getFolderId());
        }
        if (value.getRemoteId() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getRemoteId());
        }
        stmt.bindLong(14, value.getAccountId());
        final int _tmp;
        _tmp = value.isNotificationEnabled() ? 1 : 0;
        stmt.bindLong(15, _tmp);
        stmt.bindLong(16, value.getId());
      }
    };
    this.__preparedStmtOfUpdateHeaders = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "Update Feed set etag = ?, last_modified = ? Where id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateFeedFields = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "Update Feed set name = ?, url = ?, folder_id = ? Where id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateNameAndFolder = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "Update Feed set name = ?, folder_id = ? Where remoteId = ? And account_id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateColors = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "Update Feed set text_color = ?, background_color = ? Where id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateFeedNotificationState = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "Update Feed set notification_enabled = ? Where id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateAllFeedsNotificationState = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "Update Feed set notification_enabled = ? Where account_id = ?";
        return _query;
      }
    };
  }

  @Override
  public Single<Long> insert(final Feed entity) {
    return Single.fromCallable(new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfFeed.insertAndReturnId(entity);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public long compatInsert(final Feed entity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfFeed.insertAndReturnId(entity);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Long> insert(final List<Feed> entities) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      List<Long> _result = __insertionAdapterOfFeed.insertAndReturnIdsList(entities);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Completable delete(final Feed entity) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfFeed.handle(entity);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable delete(final List<Feed> entities) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfFeed.handleMultiple(entities);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable update(final Feed entity) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfFeed.handle(entity);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable update(final List<Feed> entities) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfFeed.handleMultiple(entities);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public List<Long> feedsUpsert(final List<Feed> feeds, final Account account) {
    __db.beginTransaction();
    try {
      List<Long> _result = FeedDao_Impl.super.feedsUpsert(feeds, account);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateHeaders(final String etag, final String lastModified, final int feedId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateHeaders.acquire();
    int _argIndex = 1;
    if (etag == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, etag);
    }
    _argIndex = 2;
    if (lastModified == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, lastModified);
    }
    _argIndex = 3;
    _stmt.bindLong(_argIndex, feedId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateHeaders.release(_stmt);
    }
  }

  @Override
  public void updateFeedFields(final int feedId, final String feedName, final String feedUrl,
      final Integer folderId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateFeedFields.acquire();
    int _argIndex = 1;
    if (feedName == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, feedName);
    }
    _argIndex = 2;
    if (feedUrl == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, feedUrl);
    }
    _argIndex = 3;
    if (folderId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindLong(_argIndex, folderId);
    }
    _argIndex = 4;
    _stmt.bindLong(_argIndex, feedId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateFeedFields.release(_stmt);
    }
  }

  @Override
  public void updateNameAndFolder(final String remoteFeedId, final int accountId, final String name,
      final Integer folderId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateNameAndFolder.acquire();
    int _argIndex = 1;
    if (name == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, name);
    }
    _argIndex = 2;
    if (folderId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindLong(_argIndex, folderId);
    }
    _argIndex = 3;
    if (remoteFeedId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, remoteFeedId);
    }
    _argIndex = 4;
    _stmt.bindLong(_argIndex, accountId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateNameAndFolder.release(_stmt);
    }
  }

  @Override
  public void updateColors(final int feedId, final int textColor, final int bgColor) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateColors.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, textColor);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, bgColor);
    _argIndex = 3;
    _stmt.bindLong(_argIndex, feedId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateColors.release(_stmt);
    }
  }

  @Override
  public Completable updateFeedNotificationState(final int feedId, final boolean enabled) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateFeedNotificationState.acquire();
        int _argIndex = 1;
        final int _tmp;
        _tmp = enabled ? 1 : 0;
        _stmt.bindLong(_argIndex, _tmp);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, feedId);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
          __preparedStmtOfUpdateFeedNotificationState.release(_stmt);
        }
      }
    });
  }

  @Override
  public Completable updateAllFeedsNotificationState(final int accountId, final boolean enabled) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateAllFeedsNotificationState.acquire();
        int _argIndex = 1;
        final int _tmp;
        _tmp = enabled ? 1 : 0;
        _stmt.bindLong(_argIndex, _tmp);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, accountId);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
          __preparedStmtOfUpdateAllFeedsNotificationState.release(_stmt);
        }
      }
    });
  }

  @Override
  public List<Feed> getFeeds(final int accountId) {
    final String _sql = "Select * from Feed Where account_id = ? order by name ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, accountId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
      final int _cursorIndexOfSiteUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "siteUrl");
      final int _cursorIndexOfLastUpdated = CursorUtil.getColumnIndexOrThrow(_cursor, "lastUpdated");
      final int _cursorIndexOfTextColor = CursorUtil.getColumnIndexOrThrow(_cursor, "text_color");
      final int _cursorIndexOfBackgroundColor = CursorUtil.getColumnIndexOrThrow(_cursor, "background_color");
      final int _cursorIndexOfIconUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "icon_url");
      final int _cursorIndexOfEtag = CursorUtil.getColumnIndexOrThrow(_cursor, "etag");
      final int _cursorIndexOfLastModified = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified");
      final int _cursorIndexOfFolderId = CursorUtil.getColumnIndexOrThrow(_cursor, "folder_id");
      final int _cursorIndexOfRemoteId = CursorUtil.getColumnIndexOrThrow(_cursor, "remoteId");
      final int _cursorIndexOfAccountId = CursorUtil.getColumnIndexOrThrow(_cursor, "account_id");
      final int _cursorIndexOfNotificationEnabled = CursorUtil.getColumnIndexOrThrow(_cursor, "notification_enabled");
      final List<Feed> _result = new ArrayList<Feed>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Feed _item;
        _item = new Feed();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        _item.setName(_tmpName);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        _item.setDescription(_tmpDescription);
        final String _tmpUrl;
        _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
        _item.setUrl(_tmpUrl);
        final String _tmpSiteUrl;
        _tmpSiteUrl = _cursor.getString(_cursorIndexOfSiteUrl);
        _item.setSiteUrl(_tmpSiteUrl);
        final String _tmpLastUpdated;
        _tmpLastUpdated = _cursor.getString(_cursorIndexOfLastUpdated);
        _item.setLastUpdated(_tmpLastUpdated);
        final int _tmpTextColor;
        _tmpTextColor = _cursor.getInt(_cursorIndexOfTextColor);
        _item.setTextColor(_tmpTextColor);
        final int _tmpBackgroundColor;
        _tmpBackgroundColor = _cursor.getInt(_cursorIndexOfBackgroundColor);
        _item.setBackgroundColor(_tmpBackgroundColor);
        final String _tmpIconUrl;
        _tmpIconUrl = _cursor.getString(_cursorIndexOfIconUrl);
        _item.setIconUrl(_tmpIconUrl);
        final String _tmpEtag;
        _tmpEtag = _cursor.getString(_cursorIndexOfEtag);
        _item.setEtag(_tmpEtag);
        final String _tmpLastModified;
        _tmpLastModified = _cursor.getString(_cursorIndexOfLastModified);
        _item.setLastModified(_tmpLastModified);
        final Integer _tmpFolderId;
        if (_cursor.isNull(_cursorIndexOfFolderId)) {
          _tmpFolderId = null;
        } else {
          _tmpFolderId = _cursor.getInt(_cursorIndexOfFolderId);
        }
        _item.setFolderId(_tmpFolderId);
        final String _tmpRemoteId;
        _tmpRemoteId = _cursor.getString(_cursorIndexOfRemoteId);
        _item.setRemoteId(_tmpRemoteId);
        final int _tmpAccountId;
        _tmpAccountId = _cursor.getInt(_cursorIndexOfAccountId);
        _item.setAccountId(_tmpAccountId);
        final boolean _tmpNotificationEnabled;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfNotificationEnabled);
        _tmpNotificationEnabled = _tmp != 0;
        _item.setNotificationEnabled(_tmpNotificationEnabled);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<List<Feed>> getAllFeeds() {
    final String _sql = "Select * from Feed Order By name ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"Feed"}, false, new Callable<List<Feed>>() {
      @Override
      public List<Feed> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfSiteUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "siteUrl");
          final int _cursorIndexOfLastUpdated = CursorUtil.getColumnIndexOrThrow(_cursor, "lastUpdated");
          final int _cursorIndexOfTextColor = CursorUtil.getColumnIndexOrThrow(_cursor, "text_color");
          final int _cursorIndexOfBackgroundColor = CursorUtil.getColumnIndexOrThrow(_cursor, "background_color");
          final int _cursorIndexOfIconUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "icon_url");
          final int _cursorIndexOfEtag = CursorUtil.getColumnIndexOrThrow(_cursor, "etag");
          final int _cursorIndexOfLastModified = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified");
          final int _cursorIndexOfFolderId = CursorUtil.getColumnIndexOrThrow(_cursor, "folder_id");
          final int _cursorIndexOfRemoteId = CursorUtil.getColumnIndexOrThrow(_cursor, "remoteId");
          final int _cursorIndexOfAccountId = CursorUtil.getColumnIndexOrThrow(_cursor, "account_id");
          final int _cursorIndexOfNotificationEnabled = CursorUtil.getColumnIndexOrThrow(_cursor, "notification_enabled");
          final List<Feed> _result = new ArrayList<Feed>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Feed _item;
            _item = new Feed();
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            _item.setName(_tmpName);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            _item.setDescription(_tmpDescription);
            final String _tmpUrl;
            _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            _item.setUrl(_tmpUrl);
            final String _tmpSiteUrl;
            _tmpSiteUrl = _cursor.getString(_cursorIndexOfSiteUrl);
            _item.setSiteUrl(_tmpSiteUrl);
            final String _tmpLastUpdated;
            _tmpLastUpdated = _cursor.getString(_cursorIndexOfLastUpdated);
            _item.setLastUpdated(_tmpLastUpdated);
            final int _tmpTextColor;
            _tmpTextColor = _cursor.getInt(_cursorIndexOfTextColor);
            _item.setTextColor(_tmpTextColor);
            final int _tmpBackgroundColor;
            _tmpBackgroundColor = _cursor.getInt(_cursorIndexOfBackgroundColor);
            _item.setBackgroundColor(_tmpBackgroundColor);
            final String _tmpIconUrl;
            _tmpIconUrl = _cursor.getString(_cursorIndexOfIconUrl);
            _item.setIconUrl(_tmpIconUrl);
            final String _tmpEtag;
            _tmpEtag = _cursor.getString(_cursorIndexOfEtag);
            _item.setEtag(_tmpEtag);
            final String _tmpLastModified;
            _tmpLastModified = _cursor.getString(_cursorIndexOfLastModified);
            _item.setLastModified(_tmpLastModified);
            final Integer _tmpFolderId;
            if (_cursor.isNull(_cursorIndexOfFolderId)) {
              _tmpFolderId = null;
            } else {
              _tmpFolderId = _cursor.getInt(_cursorIndexOfFolderId);
            }
            _item.setFolderId(_tmpFolderId);
            final String _tmpRemoteId;
            _tmpRemoteId = _cursor.getString(_cursorIndexOfRemoteId);
            _item.setRemoteId(_tmpRemoteId);
            final int _tmpAccountId;
            _tmpAccountId = _cursor.getInt(_cursorIndexOfAccountId);
            _item.setAccountId(_tmpAccountId);
            final boolean _tmpNotificationEnabled;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfNotificationEnabled);
            _tmpNotificationEnabled = _tmp != 0;
            _item.setNotificationEnabled(_tmpNotificationEnabled);
            _result.add(_item);
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
  public Feed getFeedById(final int feedId) {
    final String _sql = "Select * from Feed Where id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, feedId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
      final int _cursorIndexOfSiteUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "siteUrl");
      final int _cursorIndexOfLastUpdated = CursorUtil.getColumnIndexOrThrow(_cursor, "lastUpdated");
      final int _cursorIndexOfTextColor = CursorUtil.getColumnIndexOrThrow(_cursor, "text_color");
      final int _cursorIndexOfBackgroundColor = CursorUtil.getColumnIndexOrThrow(_cursor, "background_color");
      final int _cursorIndexOfIconUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "icon_url");
      final int _cursorIndexOfEtag = CursorUtil.getColumnIndexOrThrow(_cursor, "etag");
      final int _cursorIndexOfLastModified = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified");
      final int _cursorIndexOfFolderId = CursorUtil.getColumnIndexOrThrow(_cursor, "folder_id");
      final int _cursorIndexOfRemoteId = CursorUtil.getColumnIndexOrThrow(_cursor, "remoteId");
      final int _cursorIndexOfAccountId = CursorUtil.getColumnIndexOrThrow(_cursor, "account_id");
      final int _cursorIndexOfNotificationEnabled = CursorUtil.getColumnIndexOrThrow(_cursor, "notification_enabled");
      final Feed _result;
      if(_cursor.moveToFirst()) {
        _result = new Feed();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _result.setId(_tmpId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        _result.setName(_tmpName);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        _result.setDescription(_tmpDescription);
        final String _tmpUrl;
        _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
        _result.setUrl(_tmpUrl);
        final String _tmpSiteUrl;
        _tmpSiteUrl = _cursor.getString(_cursorIndexOfSiteUrl);
        _result.setSiteUrl(_tmpSiteUrl);
        final String _tmpLastUpdated;
        _tmpLastUpdated = _cursor.getString(_cursorIndexOfLastUpdated);
        _result.setLastUpdated(_tmpLastUpdated);
        final int _tmpTextColor;
        _tmpTextColor = _cursor.getInt(_cursorIndexOfTextColor);
        _result.setTextColor(_tmpTextColor);
        final int _tmpBackgroundColor;
        _tmpBackgroundColor = _cursor.getInt(_cursorIndexOfBackgroundColor);
        _result.setBackgroundColor(_tmpBackgroundColor);
        final String _tmpIconUrl;
        _tmpIconUrl = _cursor.getString(_cursorIndexOfIconUrl);
        _result.setIconUrl(_tmpIconUrl);
        final String _tmpEtag;
        _tmpEtag = _cursor.getString(_cursorIndexOfEtag);
        _result.setEtag(_tmpEtag);
        final String _tmpLastModified;
        _tmpLastModified = _cursor.getString(_cursorIndexOfLastModified);
        _result.setLastModified(_tmpLastModified);
        final Integer _tmpFolderId;
        if (_cursor.isNull(_cursorIndexOfFolderId)) {
          _tmpFolderId = null;
        } else {
          _tmpFolderId = _cursor.getInt(_cursorIndexOfFolderId);
        }
        _result.setFolderId(_tmpFolderId);
        final String _tmpRemoteId;
        _tmpRemoteId = _cursor.getString(_cursorIndexOfRemoteId);
        _result.setRemoteId(_tmpRemoteId);
        final int _tmpAccountId;
        _tmpAccountId = _cursor.getInt(_cursorIndexOfAccountId);
        _result.setAccountId(_tmpAccountId);
        final boolean _tmpNotificationEnabled;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfNotificationEnabled);
        _tmpNotificationEnabled = _tmp != 0;
        _result.setNotificationEnabled(_tmpNotificationEnabled);
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
  public int getFeedIdByUrl(final String url, final int accountId) {
    final String _sql = "Select id From Feed Where url = ? and account_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (url == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, url);
    }
    _argIndex = 2;
    _statement.bindLong(_argIndex, accountId);
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
  public boolean feedExists(final String feedUrl, final int accountId) {
    final String _sql = "Select case When ? In (Select url from Feed Where account_id = ?) Then 1 else 0 end";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (feedUrl == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, feedUrl);
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
  public boolean remoteFeedExists(final String remoteId, final int accountId) {
    final String _sql = "Select case When ? In (Select remoteId from Feed Where account_id = ?) Then 1 else 0 end";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (remoteId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, remoteId);
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
  public Single<Integer> getFeedCount(final int accountId) {
    final String _sql = "Select count(*) from Feed Where account_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, accountId);
    return RxRoom.createSingle(new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          if(_result == null) {
            throw new EmptyResultSetException("Query returned empty result set: " + _statement.getSql());
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
  public Feed getFeedByUrl(final String feedUrl, final int accountId) {
    final String _sql = "Select * from Feed Where url = ? And account_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (feedUrl == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, feedUrl);
    }
    _argIndex = 2;
    _statement.bindLong(_argIndex, accountId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
      final int _cursorIndexOfSiteUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "siteUrl");
      final int _cursorIndexOfLastUpdated = CursorUtil.getColumnIndexOrThrow(_cursor, "lastUpdated");
      final int _cursorIndexOfTextColor = CursorUtil.getColumnIndexOrThrow(_cursor, "text_color");
      final int _cursorIndexOfBackgroundColor = CursorUtil.getColumnIndexOrThrow(_cursor, "background_color");
      final int _cursorIndexOfIconUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "icon_url");
      final int _cursorIndexOfEtag = CursorUtil.getColumnIndexOrThrow(_cursor, "etag");
      final int _cursorIndexOfLastModified = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified");
      final int _cursorIndexOfFolderId = CursorUtil.getColumnIndexOrThrow(_cursor, "folder_id");
      final int _cursorIndexOfRemoteId = CursorUtil.getColumnIndexOrThrow(_cursor, "remoteId");
      final int _cursorIndexOfAccountId = CursorUtil.getColumnIndexOrThrow(_cursor, "account_id");
      final int _cursorIndexOfNotificationEnabled = CursorUtil.getColumnIndexOrThrow(_cursor, "notification_enabled");
      final Feed _result;
      if(_cursor.moveToFirst()) {
        _result = new Feed();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _result.setId(_tmpId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        _result.setName(_tmpName);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        _result.setDescription(_tmpDescription);
        final String _tmpUrl;
        _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
        _result.setUrl(_tmpUrl);
        final String _tmpSiteUrl;
        _tmpSiteUrl = _cursor.getString(_cursorIndexOfSiteUrl);
        _result.setSiteUrl(_tmpSiteUrl);
        final String _tmpLastUpdated;
        _tmpLastUpdated = _cursor.getString(_cursorIndexOfLastUpdated);
        _result.setLastUpdated(_tmpLastUpdated);
        final int _tmpTextColor;
        _tmpTextColor = _cursor.getInt(_cursorIndexOfTextColor);
        _result.setTextColor(_tmpTextColor);
        final int _tmpBackgroundColor;
        _tmpBackgroundColor = _cursor.getInt(_cursorIndexOfBackgroundColor);
        _result.setBackgroundColor(_tmpBackgroundColor);
        final String _tmpIconUrl;
        _tmpIconUrl = _cursor.getString(_cursorIndexOfIconUrl);
        _result.setIconUrl(_tmpIconUrl);
        final String _tmpEtag;
        _tmpEtag = _cursor.getString(_cursorIndexOfEtag);
        _result.setEtag(_tmpEtag);
        final String _tmpLastModified;
        _tmpLastModified = _cursor.getString(_cursorIndexOfLastModified);
        _result.setLastModified(_tmpLastModified);
        final Integer _tmpFolderId;
        if (_cursor.isNull(_cursorIndexOfFolderId)) {
          _tmpFolderId = null;
        } else {
          _tmpFolderId = _cursor.getInt(_cursorIndexOfFolderId);
        }
        _result.setFolderId(_tmpFolderId);
        final String _tmpRemoteId;
        _tmpRemoteId = _cursor.getString(_cursorIndexOfRemoteId);
        _result.setRemoteId(_tmpRemoteId);
        final int _tmpAccountId;
        _tmpAccountId = _cursor.getInt(_cursorIndexOfAccountId);
        _result.setAccountId(_tmpAccountId);
        final boolean _tmpNotificationEnabled;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfNotificationEnabled);
        _tmpNotificationEnabled = _tmp != 0;
        _result.setNotificationEnabled(_tmpNotificationEnabled);
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
  public int getFeedIdByRemoteId(final String remoteId, final int accountId) {
    final String _sql = "Select id from Feed Where remoteId = ? And account_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (remoteId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, remoteId);
    }
    _argIndex = 2;
    _statement.bindLong(_argIndex, accountId);
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
  public List<Feed> getFeedsByFolder(final int folderId) {
    final String _sql = "Select * from Feed Where folder_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, folderId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
      final int _cursorIndexOfSiteUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "siteUrl");
      final int _cursorIndexOfLastUpdated = CursorUtil.getColumnIndexOrThrow(_cursor, "lastUpdated");
      final int _cursorIndexOfTextColor = CursorUtil.getColumnIndexOrThrow(_cursor, "text_color");
      final int _cursorIndexOfBackgroundColor = CursorUtil.getColumnIndexOrThrow(_cursor, "background_color");
      final int _cursorIndexOfIconUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "icon_url");
      final int _cursorIndexOfEtag = CursorUtil.getColumnIndexOrThrow(_cursor, "etag");
      final int _cursorIndexOfLastModified = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified");
      final int _cursorIndexOfFolderId = CursorUtil.getColumnIndexOrThrow(_cursor, "folder_id");
      final int _cursorIndexOfRemoteId = CursorUtil.getColumnIndexOrThrow(_cursor, "remoteId");
      final int _cursorIndexOfAccountId = CursorUtil.getColumnIndexOrThrow(_cursor, "account_id");
      final int _cursorIndexOfNotificationEnabled = CursorUtil.getColumnIndexOrThrow(_cursor, "notification_enabled");
      final List<Feed> _result = new ArrayList<Feed>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Feed _item;
        _item = new Feed();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        _item.setName(_tmpName);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        _item.setDescription(_tmpDescription);
        final String _tmpUrl;
        _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
        _item.setUrl(_tmpUrl);
        final String _tmpSiteUrl;
        _tmpSiteUrl = _cursor.getString(_cursorIndexOfSiteUrl);
        _item.setSiteUrl(_tmpSiteUrl);
        final String _tmpLastUpdated;
        _tmpLastUpdated = _cursor.getString(_cursorIndexOfLastUpdated);
        _item.setLastUpdated(_tmpLastUpdated);
        final int _tmpTextColor;
        _tmpTextColor = _cursor.getInt(_cursorIndexOfTextColor);
        _item.setTextColor(_tmpTextColor);
        final int _tmpBackgroundColor;
        _tmpBackgroundColor = _cursor.getInt(_cursorIndexOfBackgroundColor);
        _item.setBackgroundColor(_tmpBackgroundColor);
        final String _tmpIconUrl;
        _tmpIconUrl = _cursor.getString(_cursorIndexOfIconUrl);
        _item.setIconUrl(_tmpIconUrl);
        final String _tmpEtag;
        _tmpEtag = _cursor.getString(_cursorIndexOfEtag);
        _item.setEtag(_tmpEtag);
        final String _tmpLastModified;
        _tmpLastModified = _cursor.getString(_cursorIndexOfLastModified);
        _item.setLastModified(_tmpLastModified);
        final Integer _tmpFolderId;
        if (_cursor.isNull(_cursorIndexOfFolderId)) {
          _tmpFolderId = null;
        } else {
          _tmpFolderId = _cursor.getInt(_cursorIndexOfFolderId);
        }
        _item.setFolderId(_tmpFolderId);
        final String _tmpRemoteId;
        _tmpRemoteId = _cursor.getString(_cursorIndexOfRemoteId);
        _item.setRemoteId(_tmpRemoteId);
        final int _tmpAccountId;
        _tmpAccountId = _cursor.getInt(_cursorIndexOfAccountId);
        _item.setAccountId(_tmpAccountId);
        final boolean _tmpNotificationEnabled;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfNotificationEnabled);
        _tmpNotificationEnabled = _tmp != 0;
        _item.setNotificationEnabled(_tmpNotificationEnabled);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Feed> getFeedsWithoutFolder(final int accountId) {
    final String _sql = "Select * from Feed Where account_id = ? And folder_id is null";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, accountId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
      final int _cursorIndexOfSiteUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "siteUrl");
      final int _cursorIndexOfLastUpdated = CursorUtil.getColumnIndexOrThrow(_cursor, "lastUpdated");
      final int _cursorIndexOfTextColor = CursorUtil.getColumnIndexOrThrow(_cursor, "text_color");
      final int _cursorIndexOfBackgroundColor = CursorUtil.getColumnIndexOrThrow(_cursor, "background_color");
      final int _cursorIndexOfIconUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "icon_url");
      final int _cursorIndexOfEtag = CursorUtil.getColumnIndexOrThrow(_cursor, "etag");
      final int _cursorIndexOfLastModified = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified");
      final int _cursorIndexOfFolderId = CursorUtil.getColumnIndexOrThrow(_cursor, "folder_id");
      final int _cursorIndexOfRemoteId = CursorUtil.getColumnIndexOrThrow(_cursor, "remoteId");
      final int _cursorIndexOfAccountId = CursorUtil.getColumnIndexOrThrow(_cursor, "account_id");
      final int _cursorIndexOfNotificationEnabled = CursorUtil.getColumnIndexOrThrow(_cursor, "notification_enabled");
      final List<Feed> _result = new ArrayList<Feed>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Feed _item;
        _item = new Feed();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        _item.setName(_tmpName);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        _item.setDescription(_tmpDescription);
        final String _tmpUrl;
        _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
        _item.setUrl(_tmpUrl);
        final String _tmpSiteUrl;
        _tmpSiteUrl = _cursor.getString(_cursorIndexOfSiteUrl);
        _item.setSiteUrl(_tmpSiteUrl);
        final String _tmpLastUpdated;
        _tmpLastUpdated = _cursor.getString(_cursorIndexOfLastUpdated);
        _item.setLastUpdated(_tmpLastUpdated);
        final int _tmpTextColor;
        _tmpTextColor = _cursor.getInt(_cursorIndexOfTextColor);
        _item.setTextColor(_tmpTextColor);
        final int _tmpBackgroundColor;
        _tmpBackgroundColor = _cursor.getInt(_cursorIndexOfBackgroundColor);
        _item.setBackgroundColor(_tmpBackgroundColor);
        final String _tmpIconUrl;
        _tmpIconUrl = _cursor.getString(_cursorIndexOfIconUrl);
        _item.setIconUrl(_tmpIconUrl);
        final String _tmpEtag;
        _tmpEtag = _cursor.getString(_cursorIndexOfEtag);
        _item.setEtag(_tmpEtag);
        final String _tmpLastModified;
        _tmpLastModified = _cursor.getString(_cursorIndexOfLastModified);
        _item.setLastModified(_tmpLastModified);
        final Integer _tmpFolderId;
        if (_cursor.isNull(_cursorIndexOfFolderId)) {
          _tmpFolderId = null;
        } else {
          _tmpFolderId = _cursor.getInt(_cursorIndexOfFolderId);
        }
        _item.setFolderId(_tmpFolderId);
        final String _tmpRemoteId;
        _tmpRemoteId = _cursor.getString(_cursorIndexOfRemoteId);
        _item.setRemoteId(_tmpRemoteId);
        final int _tmpAccountId;
        _tmpAccountId = _cursor.getInt(_cursorIndexOfAccountId);
        _item.setAccountId(_tmpAccountId);
        final boolean _tmpNotificationEnabled;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfNotificationEnabled);
        _tmpNotificationEnabled = _tmp != 0;
        _item.setNotificationEnabled(_tmpNotificationEnabled);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<List<FeedWithFolder>> getAllFeedsWithFolder(final int accountId) {
    final String _sql = "Select Feed.name as feed_name, Feed.id as feed_id, Folder.name as folder_name, Folder.id as folder_id, Folder.remoteId as folder_remoteId,Feed.description as feed_description, Feed.icon_url as feed_icon_url, Feed.url as feed_url, Feed.folder_id as feed_folder_id, Feed.siteUrl as feed_siteUrl, Feed.remoteId as feed_remoteId from Feed Left Join Folder on Feed.folder_id = Folder.id Where Feed.account_id = ? Order by Feed.name";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, accountId);
    return __db.getInvalidationTracker().createLiveData(new String[]{"Feed","Folder"}, false, new Callable<List<FeedWithFolder>>() {
      @Override
      public List<FeedWithFolder> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "feed_name");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "feed_id");
          final int _cursorIndexOfName_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "folder_name");
          final int _cursorIndexOfId_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "folder_id");
          final int _cursorIndexOfRemoteId = CursorUtil.getColumnIndexOrThrow(_cursor, "folder_remoteId");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "feed_description");
          final int _cursorIndexOfIconUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "feed_icon_url");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "feed_url");
          final int _cursorIndexOfFolderId = CursorUtil.getColumnIndexOrThrow(_cursor, "feed_folder_id");
          final int _cursorIndexOfSiteUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "feed_siteUrl");
          final int _cursorIndexOfRemoteId_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "feed_remoteId");
          final List<FeedWithFolder> _result = new ArrayList<FeedWithFolder>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final FeedWithFolder _item;
            final Feed _tmpFeed;
            if (! (_cursor.isNull(_cursorIndexOfName) && _cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfDescription) && _cursor.isNull(_cursorIndexOfIconUrl) && _cursor.isNull(_cursorIndexOfUrl) && _cursor.isNull(_cursorIndexOfFolderId) && _cursor.isNull(_cursorIndexOfSiteUrl) && _cursor.isNull(_cursorIndexOfRemoteId_1))) {
              _tmpFeed = new Feed();
              final String _tmpName;
              _tmpName = _cursor.getString(_cursorIndexOfName);
              _tmpFeed.setName(_tmpName);
              final int _tmpId;
              _tmpId = _cursor.getInt(_cursorIndexOfId);
              _tmpFeed.setId(_tmpId);
              final String _tmpDescription;
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
              _tmpFeed.setDescription(_tmpDescription);
              final String _tmpIconUrl;
              _tmpIconUrl = _cursor.getString(_cursorIndexOfIconUrl);
              _tmpFeed.setIconUrl(_tmpIconUrl);
              final String _tmpUrl;
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
              _tmpFeed.setUrl(_tmpUrl);
              final Integer _tmpFolderId;
              if (_cursor.isNull(_cursorIndexOfFolderId)) {
                _tmpFolderId = null;
              } else {
                _tmpFolderId = _cursor.getInt(_cursorIndexOfFolderId);
              }
              _tmpFeed.setFolderId(_tmpFolderId);
              final String _tmpSiteUrl;
              _tmpSiteUrl = _cursor.getString(_cursorIndexOfSiteUrl);
              _tmpFeed.setSiteUrl(_tmpSiteUrl);
              final String _tmpRemoteId;
              _tmpRemoteId = _cursor.getString(_cursorIndexOfRemoteId_1);
              _tmpFeed.setRemoteId(_tmpRemoteId);
            }  else  {
              _tmpFeed = null;
            }
            final Folder _tmpFolder;
            if (! (_cursor.isNull(_cursorIndexOfName_1) && _cursor.isNull(_cursorIndexOfId_1) && _cursor.isNull(_cursorIndexOfRemoteId))) {
              _tmpFolder = new Folder();
              final String _tmpName_1;
              _tmpName_1 = _cursor.getString(_cursorIndexOfName_1);
              _tmpFolder.setName(_tmpName_1);
              final int _tmpId_1;
              _tmpId_1 = _cursor.getInt(_cursorIndexOfId_1);
              _tmpFolder.setId(_tmpId_1);
              final String _tmpRemoteId_1;
              _tmpRemoteId_1 = _cursor.getString(_cursorIndexOfRemoteId);
              _tmpFolder.setRemoteId(_tmpRemoteId_1);
            }  else  {
              _tmpFolder = null;
            }
            _item = new FeedWithFolder();
            _item.setFeed(_tmpFeed);
            _item.setFolder(_tmpFolder);
            _result.add(_item);
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
  public LiveData<List<Feed>> getFeedsForNotifPermission(final int accountId) {
    final String _sql = "Select id, name, icon_url, notification_enabled, text_color, background_color, account_id From Feed Where account_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, accountId);
    return __db.getInvalidationTracker().createLiveData(new String[]{"Feed"}, false, new Callable<List<Feed>>() {
      @Override
      public List<Feed> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfIconUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "icon_url");
          final int _cursorIndexOfNotificationEnabled = CursorUtil.getColumnIndexOrThrow(_cursor, "notification_enabled");
          final int _cursorIndexOfTextColor = CursorUtil.getColumnIndexOrThrow(_cursor, "text_color");
          final int _cursorIndexOfBackgroundColor = CursorUtil.getColumnIndexOrThrow(_cursor, "background_color");
          final int _cursorIndexOfAccountId = CursorUtil.getColumnIndexOrThrow(_cursor, "account_id");
          final List<Feed> _result = new ArrayList<Feed>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Feed _item;
            _item = new Feed();
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            _item.setName(_tmpName);
            final String _tmpIconUrl;
            _tmpIconUrl = _cursor.getString(_cursorIndexOfIconUrl);
            _item.setIconUrl(_tmpIconUrl);
            final boolean _tmpNotificationEnabled;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfNotificationEnabled);
            _tmpNotificationEnabled = _tmp != 0;
            _item.setNotificationEnabled(_tmpNotificationEnabled);
            final int _tmpTextColor;
            _tmpTextColor = _cursor.getInt(_cursorIndexOfTextColor);
            _item.setTextColor(_tmpTextColor);
            final int _tmpBackgroundColor;
            _tmpBackgroundColor = _cursor.getInt(_cursorIndexOfBackgroundColor);
            _item.setBackgroundColor(_tmpBackgroundColor);
            final int _tmpAccountId;
            _tmpAccountId = _cursor.getInt(_cursorIndexOfAccountId);
            _item.setAccountId(_tmpAccountId);
            _result.add(_item);
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
  public List<Feed> selectFromIdList(final List<Long> ids) {
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("Select ");
    _stringBuilder.append("*");
    _stringBuilder.append(" From Feed Where id in (");
    final int _inputSize = ids.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (Long _item : ids) {
      if (_item == null) {
        _statement.bindNull(_argIndex);
      } else {
        _statement.bindLong(_argIndex, _item);
      }
      _argIndex ++;
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
      final int _cursorIndexOfSiteUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "siteUrl");
      final int _cursorIndexOfLastUpdated = CursorUtil.getColumnIndexOrThrow(_cursor, "lastUpdated");
      final int _cursorIndexOfTextColor = CursorUtil.getColumnIndexOrThrow(_cursor, "text_color");
      final int _cursorIndexOfBackgroundColor = CursorUtil.getColumnIndexOrThrow(_cursor, "background_color");
      final int _cursorIndexOfIconUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "icon_url");
      final int _cursorIndexOfEtag = CursorUtil.getColumnIndexOrThrow(_cursor, "etag");
      final int _cursorIndexOfLastModified = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified");
      final int _cursorIndexOfFolderId = CursorUtil.getColumnIndexOrThrow(_cursor, "folder_id");
      final int _cursorIndexOfRemoteId = CursorUtil.getColumnIndexOrThrow(_cursor, "remoteId");
      final int _cursorIndexOfAccountId = CursorUtil.getColumnIndexOrThrow(_cursor, "account_id");
      final int _cursorIndexOfNotificationEnabled = CursorUtil.getColumnIndexOrThrow(_cursor, "notification_enabled");
      final List<Feed> _result = new ArrayList<Feed>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Feed _item_1;
        _item_1 = new Feed();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item_1.setId(_tmpId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        _item_1.setName(_tmpName);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        _item_1.setDescription(_tmpDescription);
        final String _tmpUrl;
        _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
        _item_1.setUrl(_tmpUrl);
        final String _tmpSiteUrl;
        _tmpSiteUrl = _cursor.getString(_cursorIndexOfSiteUrl);
        _item_1.setSiteUrl(_tmpSiteUrl);
        final String _tmpLastUpdated;
        _tmpLastUpdated = _cursor.getString(_cursorIndexOfLastUpdated);
        _item_1.setLastUpdated(_tmpLastUpdated);
        final int _tmpTextColor;
        _tmpTextColor = _cursor.getInt(_cursorIndexOfTextColor);
        _item_1.setTextColor(_tmpTextColor);
        final int _tmpBackgroundColor;
        _tmpBackgroundColor = _cursor.getInt(_cursorIndexOfBackgroundColor);
        _item_1.setBackgroundColor(_tmpBackgroundColor);
        final String _tmpIconUrl;
        _tmpIconUrl = _cursor.getString(_cursorIndexOfIconUrl);
        _item_1.setIconUrl(_tmpIconUrl);
        final String _tmpEtag;
        _tmpEtag = _cursor.getString(_cursorIndexOfEtag);
        _item_1.setEtag(_tmpEtag);
        final String _tmpLastModified;
        _tmpLastModified = _cursor.getString(_cursorIndexOfLastModified);
        _item_1.setLastModified(_tmpLastModified);
        final Integer _tmpFolderId;
        if (_cursor.isNull(_cursorIndexOfFolderId)) {
          _tmpFolderId = null;
        } else {
          _tmpFolderId = _cursor.getInt(_cursorIndexOfFolderId);
        }
        _item_1.setFolderId(_tmpFolderId);
        final String _tmpRemoteId;
        _tmpRemoteId = _cursor.getString(_cursorIndexOfRemoteId);
        _item_1.setRemoteId(_tmpRemoteId);
        final int _tmpAccountId;
        _tmpAccountId = _cursor.getInt(_cursorIndexOfAccountId);
        _item_1.setAccountId(_tmpAccountId);
        final boolean _tmpNotificationEnabled;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfNotificationEnabled);
        _tmpNotificationEnabled = _tmp != 0;
        _item_1.setNotificationEnabled(_tmpNotificationEnabled);
        _result.add(_item_1);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<String> getFeedRemoteIdsOfAccount(final int accountId) {
    final String _sql = "Select remoteId From Feed Where account_id = ?";
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
  int getRemoteFolderLocalId(final String remoteId, final int accountId) {
    final String _sql = "Select id From Folder Where remoteId = ? And account_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (remoteId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, remoteId);
    }
    _argIndex = 2;
    _statement.bindLong(_argIndex, accountId);
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
  void deleteByIds(final List<String> ids) {
    __db.assertNotSuspendingTransaction();
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("Delete from Feed Where remoteId in (");
    final int _inputSize = ids.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final SupportSQLiteStatement _stmt = __db.compileStatement(_sql);
    int _argIndex = 1;
    for (String _item : ids) {
      if (_item == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, _item);
      }
      _argIndex ++;
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }
}
