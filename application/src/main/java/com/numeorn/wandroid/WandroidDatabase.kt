package com.numeorn.wandroid

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Article::class], version = 1, exportSchema = false)
abstract class WandroidDatabase : RoomDatabase() {

    abstract val articleDao: ArticleDao

}