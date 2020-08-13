package com.numeorn.module

import androidx.lifecycle.ViewModel
import com.numeron.brick.annotation.Inject
import com.numeron.brick.annotation.Provide

@Provide
class WxAuthorViewModel : ViewModel() {

    @Inject
    private lateinit var wxAuthorRepo: WxAuthorRepo

}