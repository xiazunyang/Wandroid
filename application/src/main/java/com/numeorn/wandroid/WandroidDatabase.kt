package com.numeorn.wandroid

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.numeorn.common.context
import com.numeron.brick.annotation.RoomInstance

@RoomInstance
val wandroidDatabase: WandroidDatabase by lazy {
    Room.databaseBuilder(context, WandroidDatabase::class.java, "wandroid.db").build()
}

@Database(entities = [Article::class], version = 1, exportSchema = false)
abstract class WandroidDatabase : RoomDatabase() {

    abstract val articleDao: ArticleDao

}