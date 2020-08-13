package com.numeorn.wandroid

import com.numeron.brick.annotation.Inject

class ArticleRepo {

    @Inject
    lateinit var articleDao: ArticleDao

}