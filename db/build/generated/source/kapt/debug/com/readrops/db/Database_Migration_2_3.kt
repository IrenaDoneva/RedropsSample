package com.readrops.db

import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

object Database_Migration_2_3 : Migration(2, 3) {
  override fun migrate(database: SupportSQLiteDatabase) {
    database.execSQL("CREATE TABLE IF NOT EXISTS `UnreadItemsIds` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `remote_id` TEXT NOT NULL, `account_id` INTEGER NOT NULL, FOREIGN KEY(`account_id`) REFERENCES `Account`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )")
    database.execSQL("CREATE INDEX IF NOT EXISTS `index_UnreadItemsIds_remote_id` ON `UnreadItemsIds` (`remote_id`)")
    database.execSQL("CREATE INDEX IF NOT EXISTS `index_UnreadItemsIds_account_id` ON `UnreadItemsIds` (`account_id`)")
    database.execSQL("CREATE TABLE IF NOT EXISTS `ReadStarStateChange` (`id` INTEGER NOT NULL, `read_change` INTEGER NOT NULL, `star_change` INTEGER NOT NULL, `account_id` INTEGER NOT NULL, PRIMARY KEY(`id`))")
    database.execSQL("CREATE TABLE IF NOT EXISTS `StarredItem` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT, `description` TEXT, `clean_description` TEXT, `link` TEXT, `image_link` TEXT, `author` TEXT, `pub_date` INTEGER, `content` TEXT, `feed_id` INTEGER NOT NULL, `guid` TEXT, `read_time` REAL NOT NULL, `read` INTEGER NOT NULL, `starred` INTEGER NOT NULL, `read_it_later` INTEGER NOT NULL, `remoteId` TEXT, FOREIGN KEY(`feed_id`) REFERENCES `Feed`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )")
    database.execSQL("CREATE INDEX IF NOT EXISTS `index_StarredItem_feed_id` ON `StarredItem` (`feed_id`)")
    database.execSQL("CREATE INDEX IF NOT EXISTS `index_StarredItem_guid` ON `StarredItem` (`guid`)")
    database.execSQL("CREATE TABLE IF NOT EXISTS `Item_MERGE_TABLE` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT, `description` TEXT, `clean_description` TEXT, `link` TEXT, `image_link` TEXT, `author` TEXT, `pub_date` INTEGER, `content` TEXT, `feed_id` INTEGER NOT NULL, `guid` TEXT, `read_time` REAL NOT NULL, `read` INTEGER NOT NULL, `starred` INTEGER NOT NULL, `read_it_later` INTEGER NOT NULL, `remoteId` TEXT, FOREIGN KEY(`feed_id`) REFERENCES `Feed`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )")
    database.execSQL("INSERT INTO `Item_MERGE_TABLE` (`id`,`title`,`description`,`clean_description`,`link`,`image_link`,`author`,`pub_date`,`content`,`feed_id`,`guid`,`read_time`,`read`,`read_it_later`,`remoteId`,`starred`) SELECT `Item`.`id`,`Item`.`title`,`Item`.`description`,`Item`.`clean_description`,`Item`.`link`,`Item`.`image_link`,`Item`.`author`,`Item`.`pub_date`,`Item`.`content`,`Item`.`feed_id`,`Item`.`guid`,`Item`.`read_time`,`Item`.`read`,`Item`.`read_it_later`,`Item`.`remoteId`,0 FROM `Item`")
    database.execSQL("DROP TABLE IF EXISTS `Item`")
    database.execSQL("ALTER TABLE `Item_MERGE_TABLE` RENAME TO `Item`")
    database.execSQL("CREATE INDEX IF NOT EXISTS `index_Item_feed_id` ON `Item` (`feed_id`)")
    database.execSQL("CREATE INDEX IF NOT EXISTS `index_Item_guid` ON `Item` (`guid`)")
  }
}
