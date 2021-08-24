package com.numeorn.module

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [WxAuthor::class], version = 1, exportSchema = false)
abstract class ModuleDatabase : RoomDatabase() {

    abstract val wxAuthorDao: WxAuthorDao

}