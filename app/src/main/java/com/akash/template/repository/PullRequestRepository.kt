package com.akash.template.repository

import com.akash.template.api.NetworkService
import com.akash.template.model.PullRequestItem
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Repository module for handling data operations.
 *
 * The @ExperimentalCoroutinesApi and @FlowPreview indicate that experimental APIs are being used.
 */
@Singleton
class PullRequestRepository @Inject constructor(
    private val networkService: NetworkService,
) {
    suspend fun getPullRequests(
        org: String? = "facebook",
        repo: String? = "react-native",
        state: String? = "closed"
    ): Flow<List<PullRequestItem>?> {
        return networkService.getPullRequests(org!!, repo!!, state!!)
    }
}