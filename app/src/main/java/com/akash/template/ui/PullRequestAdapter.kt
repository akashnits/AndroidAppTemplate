package com.akash.template.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.akash.template.databinding.ListItemPullRequestBinding
import com.akash.template.model.PullRequestItem


class PullRequestAdapter : ListAdapter<PullRequestItem, RecyclerView.ViewHolder>(PRDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return PRViewHolder(
            ListItemPullRequestBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val pullRequest = getItem(position)
        (holder as PRViewHolder).bind(pullRequest)
    }

    class PRViewHolder(
        private val binding: ListItemPullRequestBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: PullRequestItem) {
            binding.apply {
                pullRequest = item
                executePendingBindings()
            }
        }
    }
}

private class PRDiffCallback : DiffUtil.ItemCallback<PullRequestItem>() {

    override fun areItemsTheSame(oldItem: PullRequestItem, newItem: PullRequestItem): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: PullRequestItem, newItem: PullRequestItem): Boolean {
        return oldItem == newItem
    }
}