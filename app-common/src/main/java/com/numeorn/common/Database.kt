package com.numeorn.common

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [User::class], version = 1, exportSchema = false)
abstract class CommonDatabase : RoomDatabase() {

    abstract val userDao: UserDao

}