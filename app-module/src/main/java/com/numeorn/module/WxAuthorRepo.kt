package com.numeorn.module

import javax.inject.Inject

class WxAuthorRepo @Inject constructor() {

    lateinit var wxAuthorApi: WxAuthorApi

    lateinit var wxAuthorDao: WxAuthorDao

}