package com.yashinsergey.newslist.model.repos

import com.yashinsergey.newslist.model.repos.network.json.SourceListData

interface NewsRepository {

    suspend fun getSources(): SourceListData
}