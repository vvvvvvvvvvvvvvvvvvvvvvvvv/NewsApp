package com.example.newsapp.model.api

import com.example.newsapp.model.entity.Article
import com.example.newsapp.model.entity.News

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.*

interface RequestApi {
    @GET("top-headlines")
    fun getNewsList(
        @Query("country") country: String,
        @Query("apiKey") apiKey: String
    ) : Observable<News>
    @GET("everything")
     fun searchForNews(
        @Query("q")
        searchQuery: String,
        @Query("page")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey: String = RetrofitClient.API_KEY
    ): Observable<News>
}