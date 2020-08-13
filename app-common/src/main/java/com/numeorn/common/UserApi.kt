package com.numeorn.common

import retrofit2.http.GET


interface UserApi {

    @GET("wxarticle/chapters")
    suspend fun getUserList(): List<User>

}