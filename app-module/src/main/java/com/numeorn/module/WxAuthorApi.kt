package com.numeorn.module

import retrofit2.http.GET

interface WxAuthorApi {

    @GET("wxarticle/chapters/json")
    suspend fun getWxAuthorList(): List<WxAuthor>

}