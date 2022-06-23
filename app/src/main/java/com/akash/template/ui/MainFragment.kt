package com.akash.template.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.akash.template.api.NetworkService
import com.akash.template.databinding.FragmentMainBinding
import com.akash.template.repository.PullRequestRepository
import com.akash.template.viewmodel.PullRequestVM
import com.akash.template.viewmodel.PullRequestViewModelFactory
import com.google.android.material.snackbar.Snackbar

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private val pullRequestVM: PullRequestVM by viewModels {
        PullRequestViewModelFactory(PullRequestRepository.getInstance(NetworkService()), this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentMainBinding.inflate(inflater, container, false)
        context ?: return binding.root

        // show the spinner when [MainViewModel.spinner] is true
        pullRequestVM.spinner.observe(viewLifecycleOwner) { show ->
            binding.spinner.visibility = if (show) View.VISIBLE else View.GONE
        }

        // Show a snackbar whenever the [ViewModel.snackbar] is updated a non-null value
        pullRequestVM.snackbar.observe(viewLifecycleOwner) { text ->
            text?.let {
                Snackbar.make(binding.root, text, Snackbar.LENGTH_SHORT).show()
            }
        }

        val adapter = PullRequestAdapter()
        binding.pullRequestList.adapter = adapter
        subscribeUi(adapter)

        return binding.root
    }

    private fun subscribeUi(adapter: PullRequestAdapter) {
        pullRequestVM.pullRequests.observe(viewLifecycleOwner) { pullRequestList ->
            adapter.submitList(pullRequestList)
        }
    }
}