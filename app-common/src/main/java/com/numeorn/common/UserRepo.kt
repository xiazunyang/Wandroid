package com.numeorn.common

import javax.inject.Inject

class UserRepo @Inject constructor() {

    @Inject
    lateinit var userApi: UserApi

}