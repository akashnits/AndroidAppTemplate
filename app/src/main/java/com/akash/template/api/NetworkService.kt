package com.akash.template.api

import com.akash.template.model.PullRequest
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NetworkService {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://api.github.com")
        .client(OkHttpClient())
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val pullRequestService = retrofit.create(PullRequestInterface::class.java)

    suspend fun getPullRequests(
        org: String? = "facebook",
        repo: String? = "react-native",
        state: String? = "closed"
    ): Flow<PullRequest> = withContext(Dispatchers.Default) {
        return@withContext pullRequestService.getPullRequests(org, repo, state)
    }
}