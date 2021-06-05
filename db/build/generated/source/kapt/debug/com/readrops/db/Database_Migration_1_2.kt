package com.readrops.db

import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

object Database_Migration_1_2 : Migration(1, 2) {
  override fun migrate(database: SupportSQLiteDatabase) {
    database.execSQL("ALTER TABLE `Feed` ADD `notification_enabled` INTEGER NOT NULL DEFAULT 0")
    database.execSQL("ALTER TABLE `Account` ADD `notifications_enabled` INTEGER NOT NULL DEFAULT 0")
  }
}
