package com.numeorn.common

import com.numeron.brick.annotation.RetrofitInstance
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

private const val WANDROID_BASE_URL = "https://wanandroid.com/"

@RetrofitInstance
val retrofit: Retrofit by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
    Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl(WANDROID_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
}

val okHttpClient: OkHttpClient by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
    val logInterceptor = HttpLoggingInterceptor()
    logInterceptor.level = HttpLoggingInterceptor.Level.BODY
    OkHttpClient.Builder()
            .addInterceptor(logInterceptor)
            .callTimeout(15, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
            .writeTimeout(60, TimeUnit.SECONDS)
            .connectTimeout(15, TimeUnit.SECONDS)
            .build()
}