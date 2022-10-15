package com.example.testforhs.ui.menu.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.testforhs.databinding.ItemBannerListBinding
import com.example.testforhs.ui.menu.Banner

class BannerListAdapter :
    ListAdapter<Banner, BannerListAdapter.BannerViewHolder>(BannerItemCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BannerViewHolder {
        val inflater = LayoutInflater.from(parent.context)

        return BannerViewHolder(
            ItemBannerListBinding.inflate(inflater, parent, false)
        )
    }

    override fun onBindViewHolder(holder: BannerViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class BannerViewHolder(
        private val binding: ItemBannerListBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Banner) {
            binding.banner.load(item.imageUrl)
        }

    }


    private object BannerItemCallback : DiffUtil.ItemCallback<Banner>() {
        override fun areItemsTheSame(oldItem: Banner, newItem: Banner): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Banner, newItem: Banner): Boolean {
            return oldItem == newItem
        }
    }
}