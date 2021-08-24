package com.numeorn.wandroid

import androidx.room.Room
import cn.numeron.android.AppRuntime

object WandroidRuntime {

    val wandroidDatabase: WandroidDatabase by lazy {
        Room.databaseBuilder(AppRuntime.context, WandroidDatabase::class.java, "wandroid.db").build()
    }

}