package com.yashinsergey.newslist.model.repos.network.json

data class SourceListData(
    val status : String,
    val sources : List<Sources>
)

data class Sources (
    val id : String,
    val name : String,
    val description : String,
    val url : String,
    val category : String,
    val language : String,
    val country : String
)