package com.numeorn.module

import com.numeron.brick.annotation.Url
import retrofit2.http.GET

@Url("https://wanwandroid.com:80/")
interface WxAuthorApi {

    @GET("wxarticle/chapters/json")
    suspend fun getWxAuthorList(): List<WxAuthor>

}