package com.numeorn.module

import androidx.room.Room
import cn.numeron.android.AppRuntime

object ModuleRuntime {

    val moduleDatabase: ModuleDatabase by lazy {
        Room.databaseBuilder(AppRuntime.context, ModuleDatabase::class.java, "module.db").build()
    }

}