package com.numeorn.common

import cn.numeron.okhttp.LogLevel
import cn.numeron.okhttp.OAuthClientInterceptor
import cn.numeron.okhttp.ProgressInterceptor
import cn.numeron.okhttp.TextLogInterceptor
import cn.numeron.retrofit.DateConverterFactory
import cn.numeron.retrofit.FileConverterFactory
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object Http {

    private const val WANDROID_BASE_URL = "https://wanandroid.com/"

    val okHttpClient: OkHttpClient
        get() = OkHttpClient.Builder()
                .addInterceptor(ProgressInterceptor())
                .addInterceptor(OAuthClientInterceptor(OauthManager))
                .addInterceptor(TextLogInterceptor().setLevel(LogLevel.BODY))
                .callTimeout(8, TimeUnit.SECONDS)
                .readTimeout(16, TimeUnit.SECONDS)
                .writeTimeout(16, TimeUnit.SECONDS)
                .connectTimeout(16, TimeUnit.SECONDS)
                .build()

    val retrofit: Retrofit
        get() = Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl(WANDROID_BASE_URL)
                .addConverterFactory(FileConverterFactory())
                .addConverterFactory(DateConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()

}