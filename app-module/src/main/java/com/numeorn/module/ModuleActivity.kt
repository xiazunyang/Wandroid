package com.numeorn.module

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity

class ModuleActivity: AppCompatActivity() {

    private val moduleViewModel: WxAuthorViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        moduleViewModel
    }

}