package com.example.testforhs.ui.menu.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.testforhs.databinding.ItemMenuListBinding
import com.example.testforhs.domain.model.Makeup

class MenuListAdapter :
    ListAdapter<Makeup, MenuListAdapter.MenuViewHolder>(MenuItemCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val inflater = LayoutInflater.from(parent.context)

        return MenuViewHolder(
            ItemMenuListBinding.inflate(inflater, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        getItem(position)?.let {
            holder.bind(it)
        }
    }

    inner class MenuViewHolder(
        private val binding: ItemMenuListBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Makeup) {
            binding.image.load(item.image_link)
            binding.title.text = item.name
            binding.subtitle.text = item.description
            binding.btnToCart.text = item.price.toString()
        }
    }

    private object MenuItemCallback : DiffUtil.ItemCallback<Makeup>() {

        override fun areItemsTheSame(oldItem: Makeup, newItem: Makeup): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Makeup, newItem: Makeup): Boolean {
            return oldItem == newItem
        }
    }
}