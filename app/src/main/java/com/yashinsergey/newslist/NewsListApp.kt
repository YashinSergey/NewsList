package com.yashinsergey.newslist

import android.app.Application
import com.yashinsergey.newslist.di.appModule
import org.koin.core.context.startKoin

class NewsListApp: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin { modules(appModule) }
    }
}