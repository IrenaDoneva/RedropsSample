package com.readrops.db

import androidx.room.migration.Migration
import dev.matrix.roomigrant.model.IndexInfo
import dev.matrix.roomigrant.model.SchemeInfo
import dev.matrix.roomigrant.model.TableInfo
import java.util.ArrayList
import java.util.HashMap
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.collections.Map

object Database_Migrations {
  fun build(): Array<Migration> {
    val list = ArrayList<Migration>()
    list.add(Database_Migration_1_2)
    list.add(Database_Migration_2_3)
    return list.toTypedArray()
  }

  fun buildScheme(): Map<Int, SchemeInfo> {
    val schemesMap = HashMap<Int, SchemeInfo>()
    schemesMap.put(1, buildSchemeInfo_1())
    schemesMap.put(2, buildSchemeInfo_2())
    schemesMap.put(3, buildSchemeInfo_3())
    return schemesMap
  }

  private fun buildSchemeInfo_1(): SchemeInfo {
    val tables = HashMap<String, TableInfo>()
    val schemeInfo = SchemeInfo(1, tables)

    val indices_Feed = HashMap<String, IndexInfo>()

    val tableInfo_Feed = TableInfo(schemeInfo, "Feed",
        "CREATE TABLE IF NOT EXISTS `Feed` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT, `description` TEXT, `url` TEXT, `siteUrl` TEXT, `lastUpdated` TEXT, `text_color` INTEGER NOT NULL, `background_color` INTEGER NOT NULL, `icon_url` TEXT, `etag` TEXT, `last_modified` TEXT, `folder_id` INTEGER, `remoteId` TEXT, `account_id` INTEGER NOT NULL, FOREIGN KEY(`folder_id`) REFERENCES `Folder`(`id`) ON UPDATE NO ACTION ON DELETE SET NULL , FOREIGN KEY(`account_id`) REFERENCES `Account`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )",
        indices_Feed)
    tables.put("Feed", tableInfo_Feed)

    indices_Feed.put("index_Feed_folder_id", IndexInfo(tableInfo_Feed, "index_Feed_folder_id",
        "CREATE INDEX IF NOT EXISTS `index_Feed_folder_id` ON `Feed` (`folder_id`)"))
    indices_Feed.put("index_Feed_account_id", IndexInfo(tableInfo_Feed, "index_Feed_account_id",
        "CREATE INDEX IF NOT EXISTS `index_Feed_account_id` ON `Feed` (`account_id`)"))
    val indices_Item = HashMap<String, IndexInfo>()

    val tableInfo_Item = TableInfo(schemeInfo, "Item",
        "CREATE TABLE IF NOT EXISTS `Item` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT, `description` TEXT, `clean_description` TEXT, `link` TEXT, `image_link` TEXT, `author` TEXT, `pub_date` INTEGER, `content` TEXT, `feed_id` INTEGER NOT NULL, `guid` TEXT, `read_time` REAL NOT NULL, `read` INTEGER NOT NULL, `read_changed` INTEGER NOT NULL, `read_it_later` INTEGER NOT NULL, `remoteId` TEXT, FOREIGN KEY(`feed_id`) REFERENCES `Feed`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )",
        indices_Item)
    tables.put("Item", tableInfo_Item)

    indices_Item.put("index_Item_feed_id", IndexInfo(tableInfo_Item, "index_Item_feed_id",
        "CREATE INDEX IF NOT EXISTS `index_Item_feed_id` ON `Item` (`feed_id`)"))
    indices_Item.put("index_Item_guid", IndexInfo(tableInfo_Item, "index_Item_guid",
        "CREATE INDEX IF NOT EXISTS `index_Item_guid` ON `Item` (`guid`)"))
    val indices_Folder = HashMap<String, IndexInfo>()

    val tableInfo_Folder = TableInfo(schemeInfo, "Folder",
        "CREATE TABLE IF NOT EXISTS `Folder` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT, `remoteId` TEXT, `account_id` INTEGER NOT NULL, FOREIGN KEY(`account_id`) REFERENCES `Account`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )",
        indices_Folder)
    tables.put("Folder", tableInfo_Folder)

    indices_Folder.put("index_Folder_account_id", IndexInfo(tableInfo_Folder,
        "index_Folder_account_id",
        "CREATE INDEX IF NOT EXISTS `index_Folder_account_id` ON `Folder` (`account_id`)"))
    val indices_Account = HashMap<String, IndexInfo>()

    val tableInfo_Account = TableInfo(schemeInfo, "Account",
        "CREATE TABLE IF NOT EXISTS `Account` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `url` TEXT, `account_name` TEXT, `displayed_name` TEXT, `account_type` INTEGER, `last_modified` INTEGER NOT NULL, `current_account` INTEGER NOT NULL, `token` TEXT, `writeToken` TEXT)",
        indices_Account)
    tables.put("Account", tableInfo_Account)

    return schemeInfo
  }

  private fun buildSchemeInfo_2(): SchemeInfo {
    val tables = HashMap<String, TableInfo>()
    val schemeInfo = SchemeInfo(2, tables)

    val indices_Feed = HashMap<String, IndexInfo>()

    val tableInfo_Feed = TableInfo(schemeInfo, "Feed",
        "CREATE TABLE IF NOT EXISTS `Feed` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT, `description` TEXT, `url` TEXT, `siteUrl` TEXT, `lastUpdated` TEXT, `text_color` INTEGER NOT NULL, `background_color` INTEGER NOT NULL, `icon_url` TEXT, `etag` TEXT, `last_modified` TEXT, `folder_id` INTEGER, `remoteId` TEXT, `account_id` INTEGER NOT NULL, `notification_enabled` INTEGER NOT NULL DEFAULT 1, FOREIGN KEY(`folder_id`) REFERENCES `Folder`(`id`) ON UPDATE NO ACTION ON DELETE SET NULL , FOREIGN KEY(`account_id`) REFERENCES `Account`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )",
        indices_Feed)
    tables.put("Feed", tableInfo_Feed)

    indices_Feed.put("index_Feed_folder_id", IndexInfo(tableInfo_Feed, "index_Feed_folder_id",
        "CREATE INDEX IF NOT EXISTS `index_Feed_folder_id` ON `Feed` (`folder_id`)"))
    indices_Feed.put("index_Feed_account_id", IndexInfo(tableInfo_Feed, "index_Feed_account_id",
        "CREATE INDEX IF NOT EXISTS `index_Feed_account_id` ON `Feed` (`account_id`)"))
    val indices_Item = HashMap<String, IndexInfo>()

    val tableInfo_Item = TableInfo(schemeInfo, "Item",
        "CREATE TABLE IF NOT EXISTS `Item` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT, `description` TEXT, `clean_description` TEXT, `link` TEXT, `image_link` TEXT, `author` TEXT, `pub_date` INTEGER, `content` TEXT, `feed_id` INTEGER NOT NULL, `guid` TEXT, `read_time` REAL NOT NULL, `read` INTEGER NOT NULL, `read_changed` INTEGER NOT NULL, `read_it_later` INTEGER NOT NULL, `remoteId` TEXT, FOREIGN KEY(`feed_id`) REFERENCES `Feed`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )",
        indices_Item)
    tables.put("Item", tableInfo_Item)

    indices_Item.put("index_Item_feed_id", IndexInfo(tableInfo_Item, "index_Item_feed_id",
        "CREATE INDEX IF NOT EXISTS `index_Item_feed_id` ON `Item` (`feed_id`)"))
    indices_Item.put("index_Item_guid", IndexInfo(tableInfo_Item, "index_Item_guid",
        "CREATE INDEX IF NOT EXISTS `index_Item_guid` ON `Item` (`guid`)"))
    val indices_Folder = HashMap<String, IndexInfo>()

    val tableInfo_Folder = TableInfo(schemeInfo, "Folder",
        "CREATE TABLE IF NOT EXISTS `Folder` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT, `remoteId` TEXT, `account_id` INTEGER NOT NULL, FOREIGN KEY(`account_id`) REFERENCES `Account`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )",
        indices_Folder)
    tables.put("Folder", tableInfo_Folder)

    indices_Folder.put("index_Folder_account_id", IndexInfo(tableInfo_Folder,
        "index_Folder_account_id",
        "CREATE INDEX IF NOT EXISTS `index_Folder_account_id` ON `Folder` (`account_id`)"))
    val indices_Account = HashMap<String, IndexInfo>()

    val tableInfo_Account = TableInfo(schemeInfo, "Account",
        "CREATE TABLE IF NOT EXISTS `Account` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `url` TEXT, `account_name` TEXT, `displayed_name` TEXT, `account_type` INTEGER, `last_modified` INTEGER NOT NULL, `current_account` INTEGER NOT NULL, `token` TEXT, `writeToken` TEXT, `notifications_enabled` INTEGER NOT NULL)",
        indices_Account)
    tables.put("Account", tableInfo_Account)

    return schemeInfo
  }

  private fun buildSchemeInfo_3(): SchemeInfo {
    val tables = HashMap<String, TableInfo>()
    val schemeInfo = SchemeInfo(3, tables)

    val indices_Feed = HashMap<String, IndexInfo>()

    val tableInfo_Feed = TableInfo(schemeInfo, "Feed",
        "CREATE TABLE IF NOT EXISTS `Feed` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT, `description` TEXT, `url` TEXT, `siteUrl` TEXT, `lastUpdated` TEXT, `text_color` INTEGER NOT NULL, `background_color` INTEGER NOT NULL, `icon_url` TEXT, `etag` TEXT, `last_modified` TEXT, `folder_id` INTEGER, `remoteId` TEXT, `account_id` INTEGER NOT NULL, `notification_enabled` INTEGER NOT NULL DEFAULT 1, FOREIGN KEY(`folder_id`) REFERENCES `Folder`(`id`) ON UPDATE NO ACTION ON DELETE SET NULL , FOREIGN KEY(`account_id`) REFERENCES `Account`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )",
        indices_Feed)
    tables.put("Feed", tableInfo_Feed)

    indices_Feed.put("index_Feed_folder_id", IndexInfo(tableInfo_Feed, "index_Feed_folder_id",
        "CREATE INDEX IF NOT EXISTS `index_Feed_folder_id` ON `Feed` (`folder_id`)"))
    indices_Feed.put("index_Feed_account_id", IndexInfo(tableInfo_Feed, "index_Feed_account_id",
        "CREATE INDEX IF NOT EXISTS `index_Feed_account_id` ON `Feed` (`account_id`)"))
    val indices_Item = HashMap<String, IndexInfo>()

    val tableInfo_Item = TableInfo(schemeInfo, "Item",
        "CREATE TABLE IF NOT EXISTS `Item` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT, `description` TEXT, `clean_description` TEXT, `link` TEXT, `image_link` TEXT, `author` TEXT, `pub_date` INTEGER, `content` TEXT, `feed_id` INTEGER NOT NULL, `guid` TEXT, `read_time` REAL NOT NULL, `read` INTEGER NOT NULL, `starred` INTEGER NOT NULL, `read_it_later` INTEGER NOT NULL, `remoteId` TEXT, FOREIGN KEY(`feed_id`) REFERENCES `Feed`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )",
        indices_Item)
    tables.put("Item", tableInfo_Item)

    indices_Item.put("index_Item_feed_id", IndexInfo(tableInfo_Item, "index_Item_feed_id",
        "CREATE INDEX IF NOT EXISTS `index_Item_feed_id` ON `Item` (`feed_id`)"))
    indices_Item.put("index_Item_guid", IndexInfo(tableInfo_Item, "index_Item_guid",
        "CREATE INDEX IF NOT EXISTS `index_Item_guid` ON `Item` (`guid`)"))
    val indices_Folder = HashMap<String, IndexInfo>()

    val tableInfo_Folder = TableInfo(schemeInfo, "Folder",
        "CREATE TABLE IF NOT EXISTS `Folder` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT, `remoteId` TEXT, `account_id` INTEGER NOT NULL, FOREIGN KEY(`account_id`) REFERENCES `Account`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )",
        indices_Folder)
    tables.put("Folder", tableInfo_Folder)

    indices_Folder.put("index_Folder_account_id", IndexInfo(tableInfo_Folder,
        "index_Folder_account_id",
        "CREATE INDEX IF NOT EXISTS `index_Folder_account_id` ON `Folder` (`account_id`)"))
    val indices_Account = HashMap<String, IndexInfo>()

    val tableInfo_Account = TableInfo(schemeInfo, "Account",
        "CREATE TABLE IF NOT EXISTS `Account` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `url` TEXT, `account_name` TEXT, `displayed_name` TEXT, `account_type` INTEGER, `last_modified` INTEGER NOT NULL, `current_account` INTEGER NOT NULL, `token` TEXT, `writeToken` TEXT, `notifications_enabled` INTEGER NOT NULL)",
        indices_Account)
    tables.put("Account", tableInfo_Account)

    val indices_UnreadItemsIds = HashMap<String, IndexInfo>()

    val tableInfo_UnreadItemsIds = TableInfo(schemeInfo, "UnreadItemsIds",
        "CREATE TABLE IF NOT EXISTS `UnreadItemsIds` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `remote_id` TEXT NOT NULL, `account_id` INTEGER NOT NULL, FOREIGN KEY(`account_id`) REFERENCES `Account`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )",
        indices_UnreadItemsIds)
    tables.put("UnreadItemsIds", tableInfo_UnreadItemsIds)

    indices_UnreadItemsIds.put("index_UnreadItemsIds_remote_id", IndexInfo(tableInfo_UnreadItemsIds,
        "index_UnreadItemsIds_remote_id",
        "CREATE INDEX IF NOT EXISTS `index_UnreadItemsIds_remote_id` ON `UnreadItemsIds` (`remote_id`)"))
    indices_UnreadItemsIds.put("index_UnreadItemsIds_account_id",
        IndexInfo(tableInfo_UnreadItemsIds, "index_UnreadItemsIds_account_id",
        "CREATE INDEX IF NOT EXISTS `index_UnreadItemsIds_account_id` ON `UnreadItemsIds` (`account_id`)"))
    val indices_ReadStarStateChange = HashMap<String, IndexInfo>()

    val tableInfo_ReadStarStateChange = TableInfo(schemeInfo, "ReadStarStateChange",
        "CREATE TABLE IF NOT EXISTS `ReadStarStateChange` (`id` INTEGER NOT NULL, `read_change` INTEGER NOT NULL, `star_change` INTEGER NOT NULL, `account_id` INTEGER NOT NULL, PRIMARY KEY(`id`))",
        indices_ReadStarStateChange)
    tables.put("ReadStarStateChange", tableInfo_ReadStarStateChange)

    val indices_StarredItem = HashMap<String, IndexInfo>()

    val tableInfo_StarredItem = TableInfo(schemeInfo, "StarredItem",
        "CREATE TABLE IF NOT EXISTS `StarredItem` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT, `description` TEXT, `clean_description` TEXT, `link` TEXT, `image_link` TEXT, `author` TEXT, `pub_date` INTEGER, `content` TEXT, `feed_id` INTEGER NOT NULL, `guid` TEXT, `read_time` REAL NOT NULL, `read` INTEGER NOT NULL, `starred` INTEGER NOT NULL, `read_it_later` INTEGER NOT NULL, `remoteId` TEXT, FOREIGN KEY(`feed_id`) REFERENCES `Feed`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )",
        indices_StarredItem)
    tables.put("StarredItem", tableInfo_StarredItem)

    indices_StarredItem.put("index_StarredItem_feed_id", IndexInfo(tableInfo_StarredItem,
        "index_StarredItem_feed_id",
        "CREATE INDEX IF NOT EXISTS `index_StarredItem_feed_id` ON `StarredItem` (`feed_id`)"))
    indices_StarredItem.put("index_StarredItem_guid", IndexInfo(tableInfo_StarredItem,
        "index_StarredItem_guid",
        "CREATE INDEX IF NOT EXISTS `index_StarredItem_guid` ON `StarredItem` (`guid`)"))
    return schemeInfo
  }
}
