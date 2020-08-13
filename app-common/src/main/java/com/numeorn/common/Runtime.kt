package com.numeorn.common

import android.app.Application
import android.content.Context
import android.content.ContextWrapper

private lateinit var CONTEXT: RuntimeContext

private class RuntimeContext(base: Context) : ContextWrapper(base)

fun init(application: Application) {
    CONTEXT = RuntimeContext(application.applicationContext)
}

val context: Context
    get() = CONTEXT