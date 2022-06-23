package com.akash.template.api

import com.akash.template.model.PullRequestItem
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PullRequestInterface {
    @GET("/repos/{org}/{repo}/pulls")
    suspend fun getPullRequests(
        @Path("org") org: String,
        @Path("repo") repo: String,
        @Query("state") state: String
    ): List<PullRequestItem>?
}