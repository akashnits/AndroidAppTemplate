package com.akash.template.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.akash.template.R
import androidx.fragment.app.viewModels
import com.akash.template.api.NetworkService
import com.akash.template.repository.PullRequestRepository
import com.akash.template.viewmodel.PullRequestVM
import com.akash.template.viewmodel.PullRequestViewModelFactory

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
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onResume() {
        super.onResume()
        pullRequestVM.pullRequests
            .observe(this) { pullRequests ->
                Toast.makeText(context,"pullrequest size is ${pullRequests?.size}", Toast.LENGTH_LONG).show()
            }
    }
}