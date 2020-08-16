package com.yashinsergey.newslist.model.repos.network.api

import com.yashinsergey.newslist.model.repos.network.json.SourceListData
import retrofit2.http.GET

interface NewsApi {
    @GET("/v2/top-headlines")
    suspend fun getSources(): SourceListData
}