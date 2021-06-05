package com.readrops.db.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.readrops.db.entities.ReadStarStateChange;
import com.readrops.db.entities.UnreadItemsIds;
import com.readrops.db.pojo.ItemReadStarState;
import io.reactivex.Completable;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ItemsIdsDao_Impl implements ItemsIdsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<UnreadItemsIds> __insertionAdapterOfUnreadItemsIds;

  private final EntityInsertionAdapter<ReadStarStateChange> __insertionAdapterOfReadStarStateChange;

  private final EntityDeletionOrUpdateAdapter<ReadStarStateChange> __deletionAdapterOfReadStarStateChange;

  private final SharedSQLiteStatement __preparedStmtOfDeleteUnreadItemId;

  private final SharedSQLiteStatement __preparedStmtOfDeleteUnreadItemsIds;

  private final SharedSQLiteStatement __preparedStmtOfDeleteReadStarStateChanges;

  public ItemsIdsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUnreadItemsIds = new EntityInsertionAdapter<UnreadItemsIds>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `UnreadItemsIds` (`id`,`remote_id`,`account_id`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UnreadItemsIds value) {
        stmt.bindLong(1, value.getId());
        if (value.getRemoteId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getRemoteId());
        }
        stmt.bindLong(3, value.getAccountId());
      }
    };
    this.__insertionAdapterOfReadStarStateChange = new EntityInsertionAdapter<ReadStarStateChange>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `ReadStarStateChange` (`id`,`read_change`,`star_change`,`account_id`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ReadStarStateChange value) {
        stmt.bindLong(1, value.getId());
        final int _tmp;
        _tmp = value.getReadChange() ? 1 : 0;
        stmt.bindLong(2, _tmp);
        final int _tmp_1;
        _tmp_1 = value.getStarChange() ? 1 : 0;
        stmt.bindLong(3, _tmp_1);
        stmt.bindLong(4, value.getAccountId());
      }
    };
    this.__deletionAdapterOfReadStarStateChange = new EntityDeletionOrUpdateAdapter<ReadStarStateChange>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `ReadStarStateChange` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ReadStarStateChange value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__preparedStmtOfDeleteUnreadItemId = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "Delete From UnreadItemsIds Where remote_id = ? And account_id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteUnreadItemsIds = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "Delete From UnreadItemsIds Where account_id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteReadStarStateChanges = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "Delete From ReadStarStateChange Where account_id = ?";
        return _query;
      }
    };
  }

  @Override
  public void insertUnreadItemsIds(final List<UnreadItemsIds> unreadItemsIds) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfUnreadItemsIds.insert(unreadItemsIds);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertUnreadItemId(final UnreadItemsIds unreadItemId) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfUnreadItemsIds.insert(unreadItemId);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertReadStarStateChange(final ReadStarStateChange readStarStateChange) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfReadStarStateChange.insert(readStarStateChange);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteReadStarStateChange(final ReadStarStateChange readStarStateChange) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfReadStarStateChange.handle(readStarStateChange);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteUnreadItemId(final String remoteId, final int accountId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteUnreadItemId.acquire();
    int _argIndex = 1;
    if (remoteId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, remoteId);
    }
    _argIndex = 2;
    _stmt.bindLong(_argIndex, accountId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteUnreadItemId.release(_stmt);
    }
  }

  @Override
  public void deleteUnreadItemsIds(final int accountId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteUnreadItemsIds.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, accountId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteUnreadItemsIds.release(_stmt);
    }
  }

  @Override
  public void deleteReadStarStateChanges(final int accountId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteReadStarStateChanges.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, accountId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteReadStarStateChanges.release(_stmt);
    }
  }

  @Override
  public void deleteStateChanges(final int accountId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteReadStarStateChanges.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, accountId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteReadStarStateChanges.release(_stmt);
    }
  }

  @Override
  public boolean unreadItemIdExists(final String remoteId, final int accountId) {
    final String _sql = "Select case When Exists (Select remote_id, account_id From UnreadItemsIds Where remote_id = ? And account_id = ?) Then 1 else 0 End";
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
  public List<ItemReadStarState> getItemStateChanges(final int accountId) {
    final String _sql = "Select case When UnreadItemsIds.remote_id is NULL Then 1 else 0 End read, Item.remoteId, ReadStarStateChange.read_change, Item.starred, ReadStarStateChange.star_change From ReadStarStateChange Inner Join Item On ReadStarStateChange.id = Item.id Left Join UnreadItemsIds On UnreadItemsIds.remote_id = Item.remoteId Where ReadStarStateChange.account_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, accountId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfRead = CursorUtil.getColumnIndexOrThrow(_cursor, "read");
      final int _cursorIndexOfRemoteId = CursorUtil.getColumnIndexOrThrow(_cursor, "remoteId");
      final int _cursorIndexOfReadChange = CursorUtil.getColumnIndexOrThrow(_cursor, "read_change");
      final int _cursorIndexOfStarred = CursorUtil.getColumnIndexOrThrow(_cursor, "starred");
      final int _cursorIndexOfStarChange = CursorUtil.getColumnIndexOrThrow(_cursor, "star_change");
      final List<ItemReadStarState> _result = new ArrayList<ItemReadStarState>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ItemReadStarState _item;
        final boolean _tmpRead;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfRead);
        _tmpRead = _tmp != 0;
        final String _tmpRemoteId;
        _tmpRemoteId = _cursor.getString(_cursorIndexOfRemoteId);
        final boolean _tmpReadChange;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfReadChange);
        _tmpReadChange = _tmp_1 != 0;
        final boolean _tmpStarred;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfStarred);
        _tmpStarred = _tmp_2 != 0;
        final boolean _tmpStarChange;
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfStarChange);
        _tmpStarChange = _tmp_3 != 0;
        _item = new ItemReadStarState(_tmpRemoteId,_tmpRead,_tmpStarred,_tmpReadChange,_tmpStarChange);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<ItemReadStarState> getStarredItemStateChanges(final int accountId) {
    final String _sql = "Select StarredItem.remoteId, Case When StarredItem.read = 1 then 0 else 1 end read, StarredItem.starred, ReadStarStateChange.read_change, ReadStarStateChange.star_change From StarredItem Inner Join ReadStarStateChange On StarredItem.id = ReadStarStateChange.id Where account_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, accountId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfRemoteId = CursorUtil.getColumnIndexOrThrow(_cursor, "remoteId");
      final int _cursorIndexOfRead = CursorUtil.getColumnIndexOrThrow(_cursor, "read");
      final int _cursorIndexOfStarred = CursorUtil.getColumnIndexOrThrow(_cursor, "starred");
      final int _cursorIndexOfReadChange = CursorUtil.getColumnIndexOrThrow(_cursor, "read_change");
      final int _cursorIndexOfStarChange = CursorUtil.getColumnIndexOrThrow(_cursor, "star_change");
      final List<ItemReadStarState> _result = new ArrayList<ItemReadStarState>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ItemReadStarState _item;
        final String _tmpRemoteId;
        _tmpRemoteId = _cursor.getString(_cursorIndexOfRemoteId);
        final boolean _tmpRead;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfRead);
        _tmpRead = _tmp != 0;
        final boolean _tmpStarred;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfStarred);
        _tmpStarred = _tmp_1 != 0;
        final boolean _tmpReadChange;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfReadChange);
        _tmpReadChange = _tmp_2 != 0;
        final boolean _tmpStarChange;
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfStarChange);
        _tmpStarChange = _tmp_3 != 0;
        _item = new ItemReadStarState(_tmpRemoteId,_tmpRead,_tmpStarred,_tmpReadChange,_tmpStarChange);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public boolean readStateChangeExists(final int itemId) {
    final String _sql = "Select Case When ? In (Select id From ReadStarStateChange Where read_change = 1) Then 1 Else 0 End";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, itemId);
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
  public boolean starStateChangeExists(final int itemId) {
    final String _sql = "Select Case When ? In (Select id From ReadStarStateChange Where star_change = 1) Then 1 Else 0 End";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, itemId);
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
  public Completable upsertUnreadItemId(final UnreadItemsIds unreadItemId) {
    return ItemsIdsDao.DefaultImpls.upsertUnreadItemId(ItemsIdsDao_Impl.this, unreadItemId);
  }

  @Override
  public Completable upsertReadStarStateChange(final ReadStarStateChange readStarStateChange) {
    return ItemsIdsDao.DefaultImpls.upsertReadStarStateChange(ItemsIdsDao_Impl.this, readStarStateChange);
  }
}
