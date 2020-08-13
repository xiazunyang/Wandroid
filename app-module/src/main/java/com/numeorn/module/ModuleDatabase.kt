package com.numeorn.module

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.numeorn.common.context
import com.numeron.brick.annotation.RoomInstance

@RoomInstance
val moduleDatabase: ModuleDatabase by lazy {
    Room.databaseBuilder(context, ModuleDatabase::class.java, "module.db").build()
}

@Database(entities = [WxAuthor::class], version = 1, exportSchema = false)
abstract class ModuleDatabase : RoomDatabase() {

    abstract val wxAuthorDao: WxAuthorDao

}