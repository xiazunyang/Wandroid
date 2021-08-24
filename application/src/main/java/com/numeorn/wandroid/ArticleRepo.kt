package com.numeorn.wandroid

import javax.inject.Inject

class ArticleRepo  @Inject constructor(){

    lateinit var articleDao: ArticleDao

}