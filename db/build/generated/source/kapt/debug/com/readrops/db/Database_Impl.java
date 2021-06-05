package com.readrops.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.readrops.db.dao.AccountDao;
import com.readrops.db.dao.AccountDao_Impl;
import com.readrops.db.dao.FeedDao;
import com.readrops.db.dao.FeedDao_Impl;
import com.readrops.db.dao.FolderDao;
import com.readrops.db.dao.FolderDao_Impl;
import com.readrops.db.dao.ItemDao;
import com.readrops.db.dao.ItemDao_Impl;
import com.readrops.db.dao.ItemsIdsDao;
import com.readrops.db.dao.ItemsIdsDao_Impl;
import com.readrops.db.dao.StarredItemDao;
import com.readrops.db.dao.StarredItemDao_Impl;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class Database_Impl extends Database {
  private volatile FeedDao _feedDao;

  private volatile ItemDao _itemDao;

  private volatile FolderDao _folderDao;

  private volatile AccountDao _accountDao;

  private volatile ItemsIdsDao _itemsIdsDao;

  private volatile StarredItemDao _starredItemDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(3) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Feed` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT, `description` TEXT, `url` TEXT, `siteUrl` TEXT, `lastUpdated` TEXT, `text_color` INTEGER NOT NULL, `background_color` INTEGER NOT NULL, `icon_url` TEXT, `etag` TEXT, `last_modified` TEXT, `folder_id` INTEGER, `remoteId` TEXT, `account_id` INTEGER NOT NULL, `notification_enabled` INTEGER NOT NULL DEFAULT 1, FOREIGN KEY(`folder_id`) REFERENCES `Folder`(`id`) ON UPDATE NO ACTION ON DELETE SET NULL , FOREIGN KEY(`account_id`) REFERENCES `Account`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_Feed_folder_id` ON `Feed` (`folder_id`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_Feed_account_id` ON `Feed` (`account_id`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Item` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT, `description` TEXT, `clean_description` TEXT, `link` TEXT, `image_link` TEXT, `author` TEXT, `pub_date` INTEGER, `content` TEXT, `feed_id` INTEGER NOT NULL, `guid` TEXT, `read_time` REAL NOT NULL, `read` INTEGER NOT NULL, `starred` INTEGER NOT NULL, `read_it_later` INTEGER NOT NULL, `remoteId` TEXT, FOREIGN KEY(`feed_id`) REFERENCES `Feed`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_Item_feed_id` ON `Item` (`feed_id`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_Item_guid` ON `Item` (`guid`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Folder` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT, `remoteId` TEXT, `account_id` INTEGER NOT NULL, FOREIGN KEY(`account_id`) REFERENCES `Account`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_Folder_account_id` ON `Folder` (`account_id`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Account` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `url` TEXT, `account_name` TEXT, `displayed_name` TEXT, `account_type` INTEGER, `last_modified` INTEGER NOT NULL, `current_account` INTEGER NOT NULL, `token` TEXT, `writeToken` TEXT, `notifications_enabled` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `UnreadItemsIds` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `remote_id` TEXT NOT NULL, `account_id` INTEGER NOT NULL, FOREIGN KEY(`account_id`) REFERENCES `Account`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_UnreadItemsIds_remote_id` ON `UnreadItemsIds` (`remote_id`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_UnreadItemsIds_account_id` ON `UnreadItemsIds` (`account_id`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ReadStarStateChange` (`id` INTEGER NOT NULL, `read_change` INTEGER NOT NULL, `star_change` INTEGER NOT NULL, `account_id` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `StarredItem` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT, `description` TEXT, `clean_description` TEXT, `link` TEXT, `image_link` TEXT, `author` TEXT, `pub_date` INTEGER, `content` TEXT, `feed_id` INTEGER NOT NULL, `guid` TEXT, `read_time` REAL NOT NULL, `read` INTEGER NOT NULL, `starred` INTEGER NOT NULL, `read_it_later` INTEGER NOT NULL, `remoteId` TEXT, FOREIGN KEY(`feed_id`) REFERENCES `Feed`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_StarredItem_feed_id` ON `StarredItem` (`feed_id`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_StarredItem_guid` ON `StarredItem` (`guid`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'be089eb90d96a8582a76c667963886cc')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Feed`");
        _db.execSQL("DROP TABLE IF EXISTS `Item`");
        _db.execSQL("DROP TABLE IF EXISTS `Folder`");
        _db.execSQL("DROP TABLE IF EXISTS `Account`");
        _db.execSQL("DROP TABLE IF EXISTS `UnreadItemsIds`");
        _db.execSQL("DROP TABLE IF EXISTS `ReadStarStateChange`");
        _db.execSQL("DROP TABLE IF EXISTS `StarredItem`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        _db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsFeed = new HashMap<String, TableInfo.Column>(15);
        _columnsFeed.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFeed.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFeed.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFeed.put("url", new TableInfo.Column("url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFeed.put("siteUrl", new TableInfo.Column("siteUrl", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFeed.put("lastUpdated", new TableInfo.Column("lastUpdated", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFeed.put("text_color", new TableInfo.Column("text_color", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFeed.put("background_color", new TableInfo.Column("background_color", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFeed.put("icon_url", new TableInfo.Column("icon_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFeed.put("etag", new TableInfo.Column("etag", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFeed.put("last_modified", new TableInfo.Column("last_modified", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFeed.put("folder_id", new TableInfo.Column("folder_id", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFeed.put("remoteId", new TableInfo.Column("remoteId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFeed.put("account_id", new TableInfo.Column("account_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFeed.put("notification_enabled", new TableInfo.Column("notification_enabled", "INTEGER", true, 0, "1", TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFeed = new HashSet<TableInfo.ForeignKey>(2);
        _foreignKeysFeed.add(new TableInfo.ForeignKey("Folder", "SET NULL", "NO ACTION",Arrays.asList("folder_id"), Arrays.asList("id")));
        _foreignKeysFeed.add(new TableInfo.ForeignKey("Account", "CASCADE", "NO ACTION",Arrays.asList("account_id"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesFeed = new HashSet<TableInfo.Index>(2);
        _indicesFeed.add(new TableInfo.Index("index_Feed_folder_id", false, Arrays.asList("folder_id")));
        _indicesFeed.add(new TableInfo.Index("index_Feed_account_id", false, Arrays.asList("account_id")));
        final TableInfo _infoFeed = new TableInfo("Feed", _columnsFeed, _foreignKeysFeed, _indicesFeed);
        final TableInfo _existingFeed = TableInfo.read(_db, "Feed");
        if (! _infoFeed.equals(_existingFeed)) {
          return new RoomOpenHelper.ValidationResult(false, "Feed(com.readrops.db.entities.Feed).\n"
                  + " Expected:\n" + _infoFeed + "\n"
                  + " Found:\n" + _existingFeed);
        }
        final HashMap<String, TableInfo.Column> _columnsItem = new HashMap<String, TableInfo.Column>(16);
        _columnsItem.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItem.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItem.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItem.put("clean_description", new TableInfo.Column("clean_description", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItem.put("link", new TableInfo.Column("link", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItem.put("image_link", new TableInfo.Column("image_link", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItem.put("author", new TableInfo.Column("author", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItem.put("pub_date", new TableInfo.Column("pub_date", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItem.put("content", new TableInfo.Column("content", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItem.put("feed_id", new TableInfo.Column("feed_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItem.put("guid", new TableInfo.Column("guid", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItem.put("read_time", new TableInfo.Column("read_time", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItem.put("read", new TableInfo.Column("read", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItem.put("starred", new TableInfo.Column("starred", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItem.put("read_it_later", new TableInfo.Column("read_it_later", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItem.put("remoteId", new TableInfo.Column("remoteId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysItem = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysItem.add(new TableInfo.ForeignKey("Feed", "CASCADE", "NO ACTION",Arrays.asList("feed_id"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesItem = new HashSet<TableInfo.Index>(2);
        _indicesItem.add(new TableInfo.Index("index_Item_feed_id", false, Arrays.asList("feed_id")));
        _indicesItem.add(new TableInfo.Index("index_Item_guid", false, Arrays.asList("guid")));
        final TableInfo _infoItem = new TableInfo("Item", _columnsItem, _foreignKeysItem, _indicesItem);
        final TableInfo _existingItem = TableInfo.read(_db, "Item");
        if (! _infoItem.equals(_existingItem)) {
          return new RoomOpenHelper.ValidationResult(false, "Item(com.readrops.db.entities.Item).\n"
                  + " Expected:\n" + _infoItem + "\n"
                  + " Found:\n" + _existingItem);
        }
        final HashMap<String, TableInfo.Column> _columnsFolder = new HashMap<String, TableInfo.Column>(4);
        _columnsFolder.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFolder.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFolder.put("remoteId", new TableInfo.Column("remoteId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFolder.put("account_id", new TableInfo.Column("account_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFolder = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysFolder.add(new TableInfo.ForeignKey("Account", "CASCADE", "NO ACTION",Arrays.asList("account_id"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesFolder = new HashSet<TableInfo.Index>(1);
        _indicesFolder.add(new TableInfo.Index("index_Folder_account_id", false, Arrays.asList("account_id")));
        final TableInfo _infoFolder = new TableInfo("Folder", _columnsFolder, _foreignKeysFolder, _indicesFolder);
        final TableInfo _existingFolder = TableInfo.read(_db, "Folder");
        if (! _infoFolder.equals(_existingFolder)) {
          return new RoomOpenHelper.ValidationResult(false, "Folder(com.readrops.db.entities.Folder).\n"
                  + " Expected:\n" + _infoFolder + "\n"
                  + " Found:\n" + _existingFolder);
        }
        final HashMap<String, TableInfo.Column> _columnsAccount = new HashMap<String, TableInfo.Column>(10);
        _columnsAccount.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("url", new TableInfo.Column("url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("account_name", new TableInfo.Column("account_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("displayed_name", new TableInfo.Column("displayed_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("account_type", new TableInfo.Column("account_type", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("last_modified", new TableInfo.Column("last_modified", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("current_account", new TableInfo.Column("current_account", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("token", new TableInfo.Column("token", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("writeToken", new TableInfo.Column("writeToken", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccount.put("notifications_enabled", new TableInfo.Column("notifications_enabled", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAccount = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesAccount = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoAccount = new TableInfo("Account", _columnsAccount, _foreignKeysAccount, _indicesAccount);
        final TableInfo _existingAccount = TableInfo.read(_db, "Account");
        if (! _infoAccount.equals(_existingAccount)) {
          return new RoomOpenHelper.ValidationResult(false, "Account(com.readrops.db.entities.account.Account).\n"
                  + " Expected:\n" + _infoAccount + "\n"
                  + " Found:\n" + _existingAccount);
        }
        final HashMap<String, TableInfo.Column> _columnsUnreadItemsIds = new HashMap<String, TableInfo.Column>(3);
        _columnsUnreadItemsIds.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUnreadItemsIds.put("remote_id", new TableInfo.Column("remote_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUnreadItemsIds.put("account_id", new TableInfo.Column("account_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUnreadItemsIds = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysUnreadItemsIds.add(new TableInfo.ForeignKey("Account", "CASCADE", "NO ACTION",Arrays.asList("account_id"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesUnreadItemsIds = new HashSet<TableInfo.Index>(2);
        _indicesUnreadItemsIds.add(new TableInfo.Index("index_UnreadItemsIds_remote_id", false, Arrays.asList("remote_id")));
        _indicesUnreadItemsIds.add(new TableInfo.Index("index_UnreadItemsIds_account_id", false, Arrays.asList("account_id")));
        final TableInfo _infoUnreadItemsIds = new TableInfo("UnreadItemsIds", _columnsUnreadItemsIds, _foreignKeysUnreadItemsIds, _indicesUnreadItemsIds);
        final TableInfo _existingUnreadItemsIds = TableInfo.read(_db, "UnreadItemsIds");
        if (! _infoUnreadItemsIds.equals(_existingUnreadItemsIds)) {
          return new RoomOpenHelper.ValidationResult(false, "UnreadItemsIds(com.readrops.db.entities.UnreadItemsIds).\n"
                  + " Expected:\n" + _infoUnreadItemsIds + "\n"
                  + " Found:\n" + _existingUnreadItemsIds);
        }
        final HashMap<String, TableInfo.Column> _columnsReadStarStateChange = new HashMap<String, TableInfo.Column>(4);
        _columnsReadStarStateChange.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReadStarStateChange.put("read_change", new TableInfo.Column("read_change", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReadStarStateChange.put("star_change", new TableInfo.Column("star_change", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReadStarStateChange.put("account_id", new TableInfo.Column("account_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysReadStarStateChange = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesReadStarStateChange = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoReadStarStateChange = new TableInfo("ReadStarStateChange", _columnsReadStarStateChange, _foreignKeysReadStarStateChange, _indicesReadStarStateChange);
        final TableInfo _existingReadStarStateChange = TableInfo.read(_db, "ReadStarStateChange");
        if (! _infoReadStarStateChange.equals(_existingReadStarStateChange)) {
          return new RoomOpenHelper.ValidationResult(false, "ReadStarStateChange(com.readrops.db.entities.ReadStarStateChange).\n"
                  + " Expected:\n" + _infoReadStarStateChange + "\n"
                  + " Found:\n" + _existingReadStarStateChange);
        }
        final HashMap<String, TableInfo.Column> _columnsStarredItem = new HashMap<String, TableInfo.Column>(16);
        _columnsStarredItem.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStarredItem.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStarredItem.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStarredItem.put("clean_description", new TableInfo.Column("clean_description", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStarredItem.put("link", new TableInfo.Column("link", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStarredItem.put("image_link", new TableInfo.Column("image_link", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStarredItem.put("author", new TableInfo.Column("author", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStarredItem.put("pub_date", new TableInfo.Column("pub_date", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStarredItem.put("content", new TableInfo.Column("content", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStarredItem.put("feed_id", new TableInfo.Column("feed_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStarredItem.put("guid", new TableInfo.Column("guid", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStarredItem.put("read_time", new TableInfo.Column("read_time", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStarredItem.put("read", new TableInfo.Column("read", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStarredItem.put("starred", new TableInfo.Column("starred", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStarredItem.put("read_it_later", new TableInfo.Column("read_it_later", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStarredItem.put("remoteId", new TableInfo.Column("remoteId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysStarredItem = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysStarredItem.add(new TableInfo.ForeignKey("Feed", "CASCADE", "NO ACTION",Arrays.asList("feed_id"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesStarredItem = new HashSet<TableInfo.Index>(2);
        _indicesStarredItem.add(new TableInfo.Index("index_StarredItem_feed_id", false, Arrays.asList("feed_id")));
        _indicesStarredItem.add(new TableInfo.Index("index_StarredItem_guid", false, Arrays.asList("guid")));
        final TableInfo _infoStarredItem = new TableInfo("StarredItem", _columnsStarredItem, _foreignKeysStarredItem, _indicesStarredItem);
        final TableInfo _existingStarredItem = TableInfo.read(_db, "StarredItem");
        if (! _infoStarredItem.equals(_existingStarredItem)) {
          return new RoomOpenHelper.ValidationResult(false, "StarredItem(com.readrops.db.entities.StarredItem).\n"
                  + " Expected:\n" + _infoStarredItem + "\n"
                  + " Found:\n" + _existingStarredItem);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "be089eb90d96a8582a76c667963886cc", "5d6f4534fee539ea89c1eb557ea28c8b");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "Feed","Item","Folder","Account","UnreadItemsIds","ReadStarStateChange","StarredItem");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `Feed`");
      _db.execSQL("DELETE FROM `Item`");
      _db.execSQL("DELETE FROM `Folder`");
      _db.execSQL("DELETE FROM `Account`");
      _db.execSQL("DELETE FROM `UnreadItemsIds`");
      _db.execSQL("DELETE FROM `ReadStarStateChange`");
      _db.execSQL("DELETE FROM `StarredItem`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public FeedDao feedDao() {
    if (_feedDao != null) {
      return _feedDao;
    } else {
      synchronized(this) {
        if(_feedDao == null) {
          _feedDao = new FeedDao_Impl(this);
        }
        return _feedDao;
      }
    }
  }

  @Override
  public ItemDao itemDao() {
    if (_itemDao != null) {
      return _itemDao;
    } else {
      synchronized(this) {
        if(_itemDao == null) {
          _itemDao = new ItemDao_Impl(this);
        }
        return _itemDao;
      }
    }
  }

  @Override
  public FolderDao folderDao() {
    if (_folderDao != null) {
      return _folderDao;
    } else {
      synchronized(this) {
        if(_folderDao == null) {
          _folderDao = new FolderDao_Impl(this);
        }
        return _folderDao;
      }
    }
  }

  @Override
  public AccountDao accountDao() {
    if (_accountDao != null) {
      return _accountDao;
    } else {
      synchronized(this) {
        if(_accountDao == null) {
          _accountDao = new AccountDao_Impl(this);
        }
        return _accountDao;
      }
    }
  }

  @Override
  public ItemsIdsDao itemsIdsDao() {
    if (_itemsIdsDao != null) {
      return _itemsIdsDao;
    } else {
      synchronized(this) {
        if(_itemsIdsDao == null) {
          _itemsIdsDao = new ItemsIdsDao_Impl(this);
        }
        return _itemsIdsDao;
      }
    }
  }

  @Override
  public StarredItemDao starredItemDao() {
    if (_starredItemDao != null) {
      return _starredItemDao;
    } else {
      synchronized(this) {
        if(_starredItemDao == null) {
          _starredItemDao = new StarredItemDao_Impl(this);
        }
        return _starredItemDao;
      }
    }
  }
}
