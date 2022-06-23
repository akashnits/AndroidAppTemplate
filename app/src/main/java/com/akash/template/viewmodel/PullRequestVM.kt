package com.akash.template.viewmodel

import android.util.Log
import androidx.lifecycle.*
import com.akash.template.model.PullRequestItem
import com.akash.template.repository.PullRequestRepository
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.take
import kotlinx.coroutines.launch

class PullRequestVM(private val pullRequestRepository: PullRequestRepository) : ViewModel() {

    private val _snackbar = MutableLiveData<String?>()

    /**
     * Request a snackbar to display a string.
     */
    val snackbar: LiveData<String?>
        get() = _snackbar

    private val _spinner = MutableLiveData<Boolean>(false)

    /**
     * Show a loading spinner if true
     */
    val spinner: LiveData<Boolean>
        get() = _spinner


    var pullRequests: LiveData<List<PullRequestItem>?> = MutableLiveData()


    init {
        fetchPullRequests()
    }

    public fun fetchPullRequests() {
        viewModelScope.launch {
            pullRequests = pullRequestRepository.getPullRequests()
                .catch { exception -> exception.message?.let { Log.e("Error", it) } }
                .asLiveData()
        }
    }

}