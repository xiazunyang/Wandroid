package com.numeorn.common

import androidx.lifecycle.ViewModel
import com.numeron.brick.annotation.Inject
import com.numeron.brick.annotation.Provide

@Provide
class UserViewModel: ViewModel() {

    @Inject
    private lateinit var userRepo: UserRepo

}