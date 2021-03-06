package com.akash.template.api

import com.akash.template.model.PullRequestItem
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NetworkService @Inject constructor(){

    val httpLogging =  HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://api.github.com")
        .client(OkHttpClient.Builder().addInterceptor(httpLogging).build())
        .addConverterFactory(GsonConverterFactory.create())
        .build()


    private val pullRequestService = retrofit.create(PullRequestInterface::class.java)

    suspend fun getPullRequests(
        org: String,
        repo: String,
        state: String
    ): Flow<List<PullRequestItem>?> =
        flow { emit(pullRequestService.getPullRequests(org, repo, state)) }
}
