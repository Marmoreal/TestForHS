package com.example.testforhs.ui.menu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.testforhs.data.BannersList
import com.example.testforhs.databinding.FragmentMenuBinding
import com.example.testforhs.ui.menu.adapter.BannerListAdapter
import com.example.testforhs.ui.menu.adapter.MenuListAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MenuFragment : Fragment() {

    private lateinit var binding: FragmentMenuBinding
    private val bannerAdapter = BannerListAdapter()
    private val viewModel: MenuViewModel by viewModels()
    private val menuAdapter = MenuListAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMenuBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.bannerList.adapter = bannerAdapter
        bannerAdapter.submitList(BannersList.getBannersList())

        viewModel.loadMenu()

        binding.swipeRefresh.setOnRefreshListener {
            viewModel.loadMenu()
            binding.swipeRefresh.isRefreshing = false
        }

        binding.menuList.adapter = menuAdapter

        viewModel.menuLiveData.observe(viewLifecycleOwner){
            menuAdapter.submitList(it)
        }
    }
}