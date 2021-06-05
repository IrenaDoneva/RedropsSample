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
import androidx.sqlite.db.SupportSQLiteStatement;
import com.readrops.db.Converters;
import com.readrops.db.entities.account.Account;
import com.readrops.db.entities.account.AccountType;
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

@SuppressWarnings({"unchecked", "deprecation"})
public final class AccountDao_Impl implements AccountDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Account> __insertionAdapterOfAccount;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter<Account> __deletionAdapterOfAccount;

  private final EntityDeletionOrUpdateAdapter<Account> __updateAdapterOfAccount;

  private final SharedSQLiteStatement __preparedStmtOfUpdateLastModified;

  private final SharedSQLiteStatement __preparedStmtOfDeselectOldCurrentAccount;

  private final SharedSQLiteStatement __preparedStmtOfSetCurrentAccount;

  private final SharedSQLiteStatement __preparedStmtOfUpdateWriteToken;

  private final SharedSQLiteStatement __preparedStmtOfUpdateNotificationState;

  public AccountDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAccount = new EntityInsertionAdapter<Account>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Account` (`id`,`url`,`account_name`,`displayed_name`,`account_type`,`last_modified`,`current_account`,`token`,`writeToken`,`notifications_enabled`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Account value) {
        stmt.bindLong(1, value.getId());
        if (value.getUrl() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUrl());
        }
        if (value.getAccountName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAccountName());
        }
        if (value.getDisplayedName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDisplayedName());
        }
        final int _tmp;
        _tmp = __converters.getAccountTypeCode(value.getAccountType());
        stmt.bindLong(5, _tmp);
        stmt.bindLong(6, value.getLastModified());
        final int _tmp_1;
        _tmp_1 = value.isCurrentAccount() ? 1 : 0;
        stmt.bindLong(7, _tmp_1);
        if (value.getToken() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getToken());
        }
        if (value.getWriteToken() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getWriteToken());
        }
        final int _tmp_2;
        _tmp_2 = value.isNotificationsEnabled() ? 1 : 0;
        stmt.bindLong(10, _tmp_2);
      }
    };
    this.__deletionAdapterOfAccount = new EntityDeletionOrUpdateAdapter<Account>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Account` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Account value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfAccount = new EntityDeletionOrUpdateAdapter<Account>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Account` SET `id` = ?,`url` = ?,`account_name` = ?,`displayed_name` = ?,`account_type` = ?,`last_modified` = ?,`current_account` = ?,`token` = ?,`writeToken` = ?,`notifications_enabled` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Account value) {
        stmt.bindLong(1, value.getId());
        if (value.getUrl() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUrl());
        }
        if (value.getAccountName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAccountName());
        }
        if (value.getDisplayedName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDisplayedName());
        }
        final int _tmp;
        _tmp = __converters.getAccountTypeCode(value.getAccountType());
        stmt.bindLong(5, _tmp);
        stmt.bindLong(6, value.getLastModified());
        final int _tmp_1;
        _tmp_1 = value.isCurrentAccount() ? 1 : 0;
        stmt.bindLong(7, _tmp_1);
        if (value.getToken() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getToken());
        }
        if (value.getWriteToken() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getWriteToken());
        }
        final int _tmp_2;
        _tmp_2 = value.isNotificationsEnabled() ? 1 : 0;
        stmt.bindLong(10, _tmp_2);
        stmt.bindLong(11, value.getId());
      }
    };
    this.__preparedStmtOfUpdateLastModified = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "Update Account set last_modified = ? Where id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeselectOldCurrentAccount = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "Update Account set current_account = 0 Where id Not In (?)";
        return _query;
      }
    };
    this.__preparedStmtOfSetCurrentAccount = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "Update Account set current_account = 1 Where id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateWriteToken = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "Update Account set writeToken = ? Where id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateNotificationState = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "Update Account set notifications_enabled = ? Where id = ?";
        return _query;
      }
    };
  }

  @Override
  public Single<Long> insert(final Account entity) {
    return Single.fromCallable(new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfAccount.insertAndReturnId(entity);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public long compatInsert(final Account entity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfAccount.insertAndReturnId(entity);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Long> insert(final List<Account> entities) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      List<Long> _result = __insertionAdapterOfAccount.insertAndReturnIdsList(entities);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Completable delete(final Account entity) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfAccount.handle(entity);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable delete(final List<Account> entities) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfAccount.handleMultiple(entities);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable update(final Account entity) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfAccount.handle(entity);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable update(final List<Account> entities) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfAccount.handleMultiple(entities);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public void updateLastModified(final int accountId, final long lastModified) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateLastModified.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, lastModified);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, accountId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateLastModified.release(_stmt);
    }
  }

  @Override
  public void deselectOldCurrentAccount(final int accountId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeselectOldCurrentAccount.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, accountId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeselectOldCurrentAccount.release(_stmt);
    }
  }

  @Override
  public void setCurrentAccount(final int accountId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfSetCurrentAccount.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, accountId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfSetCurrentAccount.release(_stmt);
    }
  }

  @Override
  public void updateWriteToken(final int accountId, final String writeToken) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateWriteToken.acquire();
    int _argIndex = 1;
    if (writeToken == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, writeToken);
    }
    _argIndex = 2;
    _stmt.bindLong(_argIndex, accountId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateWriteToken.release(_stmt);
    }
  }

  @Override
  public Completable updateNotificationState(final int accountId, final boolean enabled) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateNotificationState.acquire();
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
          __preparedStmtOfUpdateNotificationState.release(_stmt);
        }
      }
    });
  }

  @Override
  public LiveData<List<Account>> selectAllAsync() {
    final String _sql = "Select * from Account";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"Account"}, false, new Callable<List<Account>>() {
      @Override
      public List<Account> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfAccountName = CursorUtil.getColumnIndexOrThrow(_cursor, "account_name");
          final int _cursorIndexOfDisplayedName = CursorUtil.getColumnIndexOrThrow(_cursor, "displayed_name");
          final int _cursorIndexOfAccountType = CursorUtil.getColumnIndexOrThrow(_cursor, "account_type");
          final int _cursorIndexOfLastModified = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified");
          final int _cursorIndexOfCurrentAccount = CursorUtil.getColumnIndexOrThrow(_cursor, "current_account");
          final int _cursorIndexOfToken = CursorUtil.getColumnIndexOrThrow(_cursor, "token");
          final int _cursorIndexOfWriteToken = CursorUtil.getColumnIndexOrThrow(_cursor, "writeToken");
          final int _cursorIndexOfNotificationsEnabled = CursorUtil.getColumnIndexOrThrow(_cursor, "notifications_enabled");
          final List<Account> _result = new ArrayList<Account>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Account _item;
            _item = new Account();
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            final String _tmpUrl;
            _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            _item.setUrl(_tmpUrl);
            final String _tmpAccountName;
            _tmpAccountName = _cursor.getString(_cursorIndexOfAccountName);
            _item.setAccountName(_tmpAccountName);
            final String _tmpDisplayedName;
            _tmpDisplayedName = _cursor.getString(_cursorIndexOfDisplayedName);
            _item.setDisplayedName(_tmpDisplayedName);
            final AccountType _tmpAccountType;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfAccountType);
            _tmpAccountType = __converters.fromAccountTypeCode(_tmp);
            _item.setAccountType(_tmpAccountType);
            final long _tmpLastModified;
            _tmpLastModified = _cursor.getLong(_cursorIndexOfLastModified);
            _item.setLastModified(_tmpLastModified);
            final boolean _tmpCurrentAccount;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfCurrentAccount);
            _tmpCurrentAccount = _tmp_1 != 0;
            _item.setCurrentAccount(_tmpCurrentAccount);
            final String _tmpToken;
            _tmpToken = _cursor.getString(_cursorIndexOfToken);
            _item.setToken(_tmpToken);
            final String _tmpWriteToken;
            _tmpWriteToken = _cursor.getString(_cursorIndexOfWriteToken);
            _item.setWriteToken(_tmpWriteToken);
            final boolean _tmpNotificationsEnabled;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfNotificationsEnabled);
            _tmpNotificationsEnabled = _tmp_2 != 0;
            _item.setNotificationsEnabled(_tmpNotificationsEnabled);
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
  public LiveData<Account> selectAsync(final int accountId) {
    final String _sql = "Select * From Account Where id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, accountId);
    return __db.getInvalidationTracker().createLiveData(new String[]{"Account"}, false, new Callable<Account>() {
      @Override
      public Account call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfAccountName = CursorUtil.getColumnIndexOrThrow(_cursor, "account_name");
          final int _cursorIndexOfDisplayedName = CursorUtil.getColumnIndexOrThrow(_cursor, "displayed_name");
          final int _cursorIndexOfAccountType = CursorUtil.getColumnIndexOrThrow(_cursor, "account_type");
          final int _cursorIndexOfLastModified = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified");
          final int _cursorIndexOfCurrentAccount = CursorUtil.getColumnIndexOrThrow(_cursor, "current_account");
          final int _cursorIndexOfToken = CursorUtil.getColumnIndexOrThrow(_cursor, "token");
          final int _cursorIndexOfWriteToken = CursorUtil.getColumnIndexOrThrow(_cursor, "writeToken");
          final int _cursorIndexOfNotificationsEnabled = CursorUtil.getColumnIndexOrThrow(_cursor, "notifications_enabled");
          final Account _result;
          if(_cursor.moveToFirst()) {
            _result = new Account();
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _result.setId(_tmpId);
            final String _tmpUrl;
            _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            _result.setUrl(_tmpUrl);
            final String _tmpAccountName;
            _tmpAccountName = _cursor.getString(_cursorIndexOfAccountName);
            _result.setAccountName(_tmpAccountName);
            final String _tmpDisplayedName;
            _tmpDisplayedName = _cursor.getString(_cursorIndexOfDisplayedName);
            _result.setDisplayedName(_tmpDisplayedName);
            final AccountType _tmpAccountType;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfAccountType);
            _tmpAccountType = __converters.fromAccountTypeCode(_tmp);
            _result.setAccountType(_tmpAccountType);
            final long _tmpLastModified;
            _tmpLastModified = _cursor.getLong(_cursorIndexOfLastModified);
            _result.setLastModified(_tmpLastModified);
            final boolean _tmpCurrentAccount;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfCurrentAccount);
            _tmpCurrentAccount = _tmp_1 != 0;
            _result.setCurrentAccount(_tmpCurrentAccount);
            final String _tmpToken;
            _tmpToken = _cursor.getString(_cursorIndexOfToken);
            _result.setToken(_tmpToken);
            final String _tmpWriteToken;
            _tmpWriteToken = _cursor.getString(_cursorIndexOfWriteToken);
            _result.setWriteToken(_tmpWriteToken);
            final boolean _tmpNotificationsEnabled;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfNotificationsEnabled);
            _tmpNotificationsEnabled = _tmp_2 != 0;
            _result.setNotificationsEnabled(_tmpNotificationsEnabled);
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
  public List<Account> selectAll() {
    final String _sql = "Select * from Account";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
      final int _cursorIndexOfAccountName = CursorUtil.getColumnIndexOrThrow(_cursor, "account_name");
      final int _cursorIndexOfDisplayedName = CursorUtil.getColumnIndexOrThrow(_cursor, "displayed_name");
      final int _cursorIndexOfAccountType = CursorUtil.getColumnIndexOrThrow(_cursor, "account_type");
      final int _cursorIndexOfLastModified = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified");
      final int _cursorIndexOfCurrentAccount = CursorUtil.getColumnIndexOrThrow(_cursor, "current_account");
      final int _cursorIndexOfToken = CursorUtil.getColumnIndexOrThrow(_cursor, "token");
      final int _cursorIndexOfWriteToken = CursorUtil.getColumnIndexOrThrow(_cursor, "writeToken");
      final int _cursorIndexOfNotificationsEnabled = CursorUtil.getColumnIndexOrThrow(_cursor, "notifications_enabled");
      final List<Account> _result = new ArrayList<Account>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Account _item;
        _item = new Account();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpUrl;
        _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
        _item.setUrl(_tmpUrl);
        final String _tmpAccountName;
        _tmpAccountName = _cursor.getString(_cursorIndexOfAccountName);
        _item.setAccountName(_tmpAccountName);
        final String _tmpDisplayedName;
        _tmpDisplayedName = _cursor.getString(_cursorIndexOfDisplayedName);
        _item.setDisplayedName(_tmpDisplayedName);
        final AccountType _tmpAccountType;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfAccountType);
        _tmpAccountType = __converters.fromAccountTypeCode(_tmp);
        _item.setAccountType(_tmpAccountType);
        final long _tmpLastModified;
        _tmpLastModified = _cursor.getLong(_cursorIndexOfLastModified);
        _item.setLastModified(_tmpLastModified);
        final boolean _tmpCurrentAccount;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfCurrentAccount);
        _tmpCurrentAccount = _tmp_1 != 0;
        _item.setCurrentAccount(_tmpCurrentAccount);
        final String _tmpToken;
        _tmpToken = _cursor.getString(_cursorIndexOfToken);
        _item.setToken(_tmpToken);
        final String _tmpWriteToken;
        _tmpWriteToken = _cursor.getString(_cursorIndexOfWriteToken);
        _item.setWriteToken(_tmpWriteToken);
        final boolean _tmpNotificationsEnabled;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfNotificationsEnabled);
        _tmpNotificationsEnabled = _tmp_2 != 0;
        _item.setNotificationsEnabled(_tmpNotificationsEnabled);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Account select(final int accountId) {
    final String _sql = "Select * From Account Where id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, accountId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
      final int _cursorIndexOfAccountName = CursorUtil.getColumnIndexOrThrow(_cursor, "account_name");
      final int _cursorIndexOfDisplayedName = CursorUtil.getColumnIndexOrThrow(_cursor, "displayed_name");
      final int _cursorIndexOfAccountType = CursorUtil.getColumnIndexOrThrow(_cursor, "account_type");
      final int _cursorIndexOfLastModified = CursorUtil.getColumnIndexOrThrow(_cursor, "last_modified");
      final int _cursorIndexOfCurrentAccount = CursorUtil.getColumnIndexOrThrow(_cursor, "current_account");
      final int _cursorIndexOfToken = CursorUtil.getColumnIndexOrThrow(_cursor, "token");
      final int _cursorIndexOfWriteToken = CursorUtil.getColumnIndexOrThrow(_cursor, "writeToken");
      final int _cursorIndexOfNotificationsEnabled = CursorUtil.getColumnIndexOrThrow(_cursor, "notifications_enabled");
      final Account _result;
      if(_cursor.moveToFirst()) {
        _result = new Account();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _result.setId(_tmpId);
        final String _tmpUrl;
        _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
        _result.setUrl(_tmpUrl);
        final String _tmpAccountName;
        _tmpAccountName = _cursor.getString(_cursorIndexOfAccountName);
        _result.setAccountName(_tmpAccountName);
        final String _tmpDisplayedName;
        _tmpDisplayedName = _cursor.getString(_cursorIndexOfDisplayedName);
        _result.setDisplayedName(_tmpDisplayedName);
        final AccountType _tmpAccountType;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfAccountType);
        _tmpAccountType = __converters.fromAccountTypeCode(_tmp);
        _result.setAccountType(_tmpAccountType);
        final long _tmpLastModified;
        _tmpLastModified = _cursor.getLong(_cursorIndexOfLastModified);
        _result.setLastModified(_tmpLastModified);
        final boolean _tmpCurrentAccount;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfCurrentAccount);
        _tmpCurrentAccount = _tmp_1 != 0;
        _result.setCurrentAccount(_tmpCurrentAccount);
        final String _tmpToken;
        _tmpToken = _cursor.getString(_cursorIndexOfToken);
        _result.setToken(_tmpToken);
        final String _tmpWriteToken;
        _tmpWriteToken = _cursor.getString(_cursorIndexOfWriteToken);
        _result.setWriteToken(_tmpWriteToken);
        final boolean _tmpNotificationsEnabled;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfNotificationsEnabled);
        _tmpNotificationsEnabled = _tmp_2 != 0;
        _result.setNotificationsEnabled(_tmpNotificationsEnabled);
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
  public Single<Integer> getAccountCount() {
    final String _sql = "Select count(*) From Account";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
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
}
