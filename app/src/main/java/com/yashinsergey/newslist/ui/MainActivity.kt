package com.yashinsergey.newslist.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import com.yashinsergey.newslist.R
import com.yashinsergey.newslist.viewmodel.NewsViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val newsViewModel: NewsViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        newsViewModel.getSourceList()

        newsViewModel.sourceListResult.observe(this, Observer {
            if (it.isSuccess) {
                Log.d("NEWS_LIST", "${it.getOrNull()}")
            } else {
                Log.d("NEWS_LIST", "${it.exceptionOrNull()?.message}")
            }
        })
    }
}