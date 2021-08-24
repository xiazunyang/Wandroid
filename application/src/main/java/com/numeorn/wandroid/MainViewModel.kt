package com.numeorn.wandroid

import androidx.lifecycle.ViewModel
import com.numeorn.common.UserRepo
import com.numeorn.module.WxAuthorRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {

    @Inject
    lateinit var userRepo: UserRepo

    @Inject
    lateinit var articleRepo: ArticleRepo

    @Inject
    lateinit var wxAuthorRepo: WxAuthorRepo

}