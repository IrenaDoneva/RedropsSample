package com.readrops.db.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.readrops.db.entities.Folder;
import com.readrops.db.entities.account.Account;
import com.readrops.db.pojo.FolderWithFeedCount;
import io.reactivex.Completable;
import io.reactivex.Single;
import java.lang.Exception;
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
public final class FolderDao_Impl extends FolderDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Folder> __insertionAdapterOfFolder;

  private final EntityDeletionOrUpdateAdapter<Folder> __deletionAdapterOfFolder;

  private final EntityDeletionOrUpdateAdapter<Folder> __updateAdapterOfFolder;

  private final SharedSQLiteStatement __preparedStmtOfUpdateName;

  public FolderDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFolder = new EntityInsertionAdapter<Folder>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Folder` (`id`,`name`,`remoteId`,`account_id`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Folder value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getRemoteId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getRemoteId());
        }
        stmt.bindLong(4, value.getAccountId());
      }
    };
    this.__deletionAdapterOfFolder = new EntityDeletionOrUpdateAdapter<Folder>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Folder` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Folder value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfFolder = new EntityDeletionOrUpdateAdapter<Folder>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Folder` SET `id` = ?,`name` = ?,`remoteId` = ?,`account_id` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Folder value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getRemoteId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getRemoteId());
        }
        stmt.bindLong(4, value.getAccountId());
        stmt.bindLong(5, value.getId());
      }
    };
    this.__preparedStmtOfUpdateName = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "Update Folder set name = ? Where remoteId = ? And account_id = ?";
        return _query;
      }
    };
  }

  @Override
  public Single<Long> insert(final Folder entity) {
    return Single.fromCallable(new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfFolder.insertAndReturnId(entity);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public long compatInsert(final Folder entity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfFolder.insertAndReturnId(entity);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Long> insert(final List<Folder> entities) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      List<Long> _result = __insertionAdapterOfFolder.insertAndReturnIdsList(entities);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Completable delete(final Folder entity) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfFolder.handle(entity);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable delete(final List<Folder> entities) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfFolder.handleMultiple(entities);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable update(final Folder entity) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfFolder.handle(entity);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable update(final List<Folder> entities) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfFolder.handleMultiple(entities);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public List<Long> foldersUpsert(final List<Folder> folders, final Account account) {
    __db.beginTransaction();
    try {
      List<Long> _result = FolderDao_Impl.super.foldersUpsert(folders, account);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateName(final String remoteFolderId, final int accountId, final String name) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateName.acquire();
    int _argIndex = 1;
    if (name == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, name);
    }
    _argIndex = 2;
    if (remoteFolderId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, remoteFolderId);
    }
    _argIndex = 3;
    _stmt.bindLong(_argIndex, accountId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateName.release(_stmt);
    }
  }

  @Override
  public LiveData<List<Folder>> getAllFolders(final int accountId) {
    final String _sql = "Select * from Folder Where account_id = ? Order By name ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, accountId);
    return __db.getInvalidationTracker().createLiveData(new String[]{"Folder"}, false, new Callable<List<Folder>>() {
      @Override
      public List<Folder> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfRemoteId = CursorUtil.getColumnIndexOrThrow(_cursor, "remoteId");
          final int _cursorIndexOfAccountId = CursorUtil.getColumnIndexOrThrow(_cursor, "account_id");
          final List<Folder> _result = new ArrayList<Folder>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Folder _item;
            _item = new Folder();
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            _item.setName(_tmpName);
            final String _tmpRemoteId;
            _tmpRemoteId = _cursor.getString(_cursorIndexOfRemoteId);
            _item.setRemoteId(_tmpRemoteId);
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
  public LiveData<List<FolderWithFeedCount>> getFoldersWithFeedCount(final int accountId) {
    final String _sql = "Select Folder.*, count(Feed.id) as feed_count from Folder Left Join Feed on Folder.id = Feed.folder_id Where Folder.account_id = ? Group by Folder.id Order By name ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, accountId);
    return __db.getInvalidationTracker().createLiveData(new String[]{"Folder","Feed"}, false, new Callable<List<FolderWithFeedCount>>() {
      @Override
      public List<FolderWithFeedCount> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfRemoteId = CursorUtil.getColumnIndexOrThrow(_cursor, "remoteId");
          final int _cursorIndexOfAccountId = CursorUtil.getColumnIndexOrThrow(_cursor, "account_id");
          final int _cursorIndexOfFeedCount = CursorUtil.getColumnIndexOrThrow(_cursor, "feed_count");
          final List<FolderWithFeedCount> _result = new ArrayList<FolderWithFeedCount>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final FolderWithFeedCount _item;
            final Folder _tmpFolder;
            if (! (_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfName) && _cursor.isNull(_cursorIndexOfRemoteId) && _cursor.isNull(_cursorIndexOfAccountId))) {
              _tmpFolder = new Folder();
              final int _tmpId;
              _tmpId = _cursor.getInt(_cursorIndexOfId);
              _tmpFolder.setId(_tmpId);
              final String _tmpName;
              _tmpName = _cursor.getString(_cursorIndexOfName);
              _tmpFolder.setName(_tmpName);
              final String _tmpRemoteId;
              _tmpRemoteId = _cursor.getString(_cursorIndexOfRemoteId);
              _tmpFolder.setRemoteId(_tmpRemoteId);
              final int _tmpAccountId;
              _tmpAccountId = _cursor.getInt(_cursorIndexOfAccountId);
              _tmpFolder.setAccountId(_tmpAccountId);
            }  else  {
              _tmpFolder = null;
            }
            _item = new FolderWithFeedCount();
            final int _tmpFeedCount;
            _tmpFeedCount = _cursor.getInt(_cursorIndexOfFeedCount);
            _item.setFeedCount(_tmpFeedCount);
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
  public List<Folder> getFolders(final int accountId) {
    final String _sql = "Select * from Folder Where account_id = ? Order By name ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, accountId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfRemoteId = CursorUtil.getColumnIndexOrThrow(_cursor, "remoteId");
      final int _cursorIndexOfAccountId = CursorUtil.getColumnIndexOrThrow(_cursor, "account_id");
      final List<Folder> _result = new ArrayList<Folder>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Folder _item;
        _item = new Folder();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        _item.setName(_tmpName);
        final String _tmpRemoteId;
        _tmpRemoteId = _cursor.getString(_cursorIndexOfRemoteId);
        _item.setRemoteId(_tmpRemoteId);
        final int _tmpAccountId;
        _tmpAccountId = _cursor.getInt(_cursorIndexOfAccountId);
        _item.setAccountId(_tmpAccountId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  boolean remoteFolderExists(final String remoteId, final int accountId) {
    final String _sql = "Select case When ? In (Select remoteId From Folder Where account_id = ?) Then 1 else 0 end";
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
  public Folder select(final int folderId) {
    final String _sql = "Select * from Folder Where id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, folderId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfRemoteId = CursorUtil.getColumnIndexOrThrow(_cursor, "remoteId");
      final int _cursorIndexOfAccountId = CursorUtil.getColumnIndexOrThrow(_cursor, "account_id");
      final Folder _result;
      if(_cursor.moveToFirst()) {
        _result = new Folder();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _result.setId(_tmpId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        _result.setName(_tmpName);
        final String _tmpRemoteId;
        _tmpRemoteId = _cursor.getString(_cursorIndexOfRemoteId);
        _result.setRemoteId(_tmpRemoteId);
        final int _tmpAccountId;
        _tmpAccountId = _cursor.getInt(_cursorIndexOfAccountId);
        _result.setAccountId(_tmpAccountId);
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
  public List<String> getFolderRemoteIdsOfAccount(final int accountId) {
    final String _sql = "Select remoteId From Folder Where account_id = ?";
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
  public Folder getFolderByName(final String name, final int accountId) {
    final String _sql = "Select * From Folder Where name = ? And account_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (name == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, name);
    }
    _argIndex = 2;
    _statement.bindLong(_argIndex, accountId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfRemoteId = CursorUtil.getColumnIndexOrThrow(_cursor, "remoteId");
      final int _cursorIndexOfAccountId = CursorUtil.getColumnIndexOrThrow(_cursor, "account_id");
      final Folder _result;
      if(_cursor.moveToFirst()) {
        _result = new Folder();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _result.setId(_tmpId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        _result.setName(_tmpName);
        final String _tmpRemoteId;
        _tmpRemoteId = _cursor.getString(_cursorIndexOfRemoteId);
        _result.setRemoteId(_tmpRemoteId);
        final int _tmpAccountId;
        _tmpAccountId = _cursor.getInt(_cursorIndexOfAccountId);
        _result.setAccountId(_tmpAccountId);
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
  void deleteByIds(final List<String> ids) {
    __db.assertNotSuspendingTransaction();
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("Delete From Folder Where remoteId in (");
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
