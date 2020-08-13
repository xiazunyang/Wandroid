package com.numeorn.common

import com.numeron.brick.annotation.Inject

class UserRepo {

    @Inject
    lateinit var userApi: UserApi

}