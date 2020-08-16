package com.yashinsergey.newslist.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.yashinsergey.newslist.model.repos.NewsRepository
import com.yashinsergey.newslist.model.repos.network.json.SourceListData
import com.yashinsergey.newslist.common.launchInScope

class NewsViewModel(private val repository: NewsRepository) : ViewModel() {

    val sourceListResult = MutableLiveData<Result<SourceListData>>()

    fun getSourceList() {
        launchInScope({repository.getSources()}, sourceListResult)
    }
}