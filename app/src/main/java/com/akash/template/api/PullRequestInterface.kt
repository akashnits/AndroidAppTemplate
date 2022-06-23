package com.akash.template.api

import com.akash.template.model.PullRequest
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET
import retrofit2.http.Path

interface PullRequestInterface {
    @GET("/repos/{org}/{repo}/pulls/{state}")
    suspend fun getPullRequests(
        @Path("org") org: String?,
        @Path("repo") repo: String?,
        @Path("state") state: String?
    ): Flow<PullRequest>
}