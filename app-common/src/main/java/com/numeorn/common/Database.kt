package com.numeorn.common

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.numeron.brick.annotation.RoomInstance

@RoomInstance
val commonDatabase: CommonDatabase by lazy {
    Room.databaseBuilder(context, CommonDatabase::class.java, "common.db")
            .fallbackToDestructiveMigration()
            .build()
}

@Database(entities = [User::class], version = 1, exportSchema = false)
abstract class CommonDatabase : RoomDatabase() {

    abstract val userDao: UserDao

}