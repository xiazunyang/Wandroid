package com.numeorn.common

import androidx.room.Room
import cn.numeron.android.AppRuntime

object CommonRuntime {

    val database: CommonDatabase by lazy {
        Room.databaseBuilder(AppRuntime.context, CommonDatabase::class.java, "common.db")
                .fallbackToDestructiveMigration()
                .build()
    }

}