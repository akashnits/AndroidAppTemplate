package com.akash.template.repository

import com.akash.template.api.NetworkService
import com.akash.template.model.PullRequest
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.take

/**
 * Repository module for handling data operations.
 *
 * The @ExperimentalCoroutinesApi and @FlowPreview indicate that experimental APIs are being used.
 */
@ExperimentalCoroutinesApi
@FlowPreview
class PullRequestRepository private constructor(
    private val networkService: NetworkService,
    private val defaultDispatcher: CoroutineDispatcher = Dispatchers.Default
) {

    suspend fun getPullRequests(org: String?, repo: String?, state: String?): Flow<PullRequest> {
        // A Flow from Room will return each value, just like a LiveData.
        return networkService.getPullRequests().take(20)

            .map { pullRequest ->

                // We can make a request for the cached sort order directly here, because map
                // takes a suspend lambda
                //
                // This may trigger a network request if it's not yet cached, but since the network
                // call is main safe, we won't block the main thread (even though this flow executes
                // on Dispatchers.Main).
                //val sortOrderFromNetwork = plantsListSortOrderCache.getOrAwait()

                // The result will be the sorted list with custom sort order applied. Note that this
                // call is also main-safe due to using applyMainSafeSort.
                pullRequest
            }
    }

    /**
     * A function that sorts the list of Plants in a given custom order.
     */
//    private fun List<Plant>.applySort(customSortOrder: List<String>): List<Plant> {
//        // Our product manager requested that these plants always be sorted first in this
//        // order whenever they are present in the array
//        return sortedBy { plant ->
//            val positionForItem = customSortOrder.indexOf(plant.plantId).let { order ->
//                if (order > -1) order else Int.MAX_VALUE
//            }
//            ComparablePair(positionForItem, plant.name)
//        }
//    }

    /**
     * The same sorting function as [applySort], but as a suspend function that can run on any thread
     * (main-safe)
     */
//    @AnyThread
//    private suspend fun List<Plant>.applyMainSafeSort(customSortOrder: List<String>) =
//        withContext(defaultDispatcher) {
//            this@applyMainSafeSort.applySort(customSortOrder)
//        }


    companion object {
        // For Singleton instantiation
        @Volatile private var instance: PullRequestRepository? = null

        fun getInstance(plantService: NetworkService) =
            instance ?: synchronized(this) {
                instance ?: PullRequestRepository(plantService).also { instance = it }
            }
    }
}
