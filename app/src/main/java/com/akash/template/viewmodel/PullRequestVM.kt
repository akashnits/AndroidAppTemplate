package com.akash.template.viewmodel

import androidx.lifecycle.*
import com.akash.template.model.PullRequestItem
import com.akash.template.repository.PullRequestRepository
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
            pullRequests = pullRequestRepository.getPullRequests().asLiveData()
        }
    }

}