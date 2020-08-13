package com.numeorn.wandroid

import android.app.Application
import com.numeorn.common.init

class WandroidApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        init(this)
    }

}