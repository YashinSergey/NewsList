package com.yashinsergey.newslist.di

import com.yashinsergey.newslist.model.repos.NewsRepository
import com.yashinsergey.newslist.model.repos.network.NewsRepositoryImpl
import com.yashinsergey.newslist.model.repos.network.NewsListRetrofit
import com.yashinsergey.newslist.model.repos.network.api.NewsApi
import com.yashinsergey.newslist.viewmodel.NewsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit

val appModule = module {

    single { NewsListRetrofit.createOkHttpClient() }

    single { NewsListRetrofit.getRetrofitBuilder(get()) }

    single { get<Retrofit>().create(NewsApi::class.java) }

    single<NewsRepository> { NewsRepositoryImpl(get()) }

    viewModel { NewsViewModel(get()) }
}