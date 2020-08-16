package com.yashinsergey.newslist.model.repos.network

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit


class NewsListRetrofit {

    companion object {
        val BASE_URL = "https://newsapi.org"

        fun getRetrofitBuilder(okHttpClient: OkHttpClient) {
            Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(MoshiConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
        }

        fun createOkHttpClient(): OkHttpClient {
            val builder = OkHttpClient.Builder()
            builder.callTimeout(10, TimeUnit.HOURS)
            builder.readTimeout(10, TimeUnit.HOURS)
            builder.writeTimeout(10, TimeUnit.HOURS)
            builder.retryOnConnectionFailure(true)
            builder.followRedirects(false)
            return builder.build()
        }
    }
}