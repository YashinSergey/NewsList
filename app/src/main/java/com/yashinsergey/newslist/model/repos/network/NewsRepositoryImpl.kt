package com.yashinsergey.newslist.model.repos.network

import com.yashinsergey.newslist.model.repos.NewsRepository
import com.yashinsergey.newslist.model.repos.network.api.NewsApi
import com.yashinsergey.newslist.model.repos.network.json.SourceListData

class NewsRepositoryImpl(private val api: NewsApi): NewsRepository {

    override suspend fun getSources(): SourceListData = api.getSources()

}