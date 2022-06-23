package com.akash.template.viewmodel


import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.akash.template.repository.PullRequestRepository
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class PullRequestViewModelFactory @Inject constructor(
    val repository: PullRequestRepository
) : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return PullRequestVM(repository) as T
    }
}