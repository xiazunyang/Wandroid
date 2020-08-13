package com.numeorn.wandroid

import androidx.lifecycle.ViewModel
import com.numeorn.common.UserRepo
import com.numeorn.module.WxAuthorRepo
import com.numeron.brick.annotation.Inject
import com.numeron.brick.annotation.Provide

@Provide
class MainViewModel : ViewModel() {

    @Inject
    private lateinit var userRepo: UserRepo

    @Inject
    private lateinit var articleRepo: ArticleRepo

    @Inject
    private lateinit var wxAuthorRepo: WxAuthorRepo

}