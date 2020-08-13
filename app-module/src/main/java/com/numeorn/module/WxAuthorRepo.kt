package com.numeorn.module

import com.numeron.brick.annotation.Inject

class WxAuthorRepo {

    @Inject
    lateinit var wxAuthorApi: WxAuthorApi

    @Inject
    lateinit var wxAuthorDao: WxAuthorDao

}