package com.example.testforhs.ui.menu

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.testforhs.domain.model.Makeup
import com.example.testforhs.domain.usecase.GetMakeupUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MenuViewModel @Inject constructor(
    private val getMakeupUseCase: GetMakeupUseCase
) : ViewModel() {

    private val _menuLiveData = MutableLiveData<List<Makeup>>()
    val menuLiveData: LiveData<List<Makeup>> = _menuLiveData

    fun loadMenu() {
        viewModelScope.launch {
//            val menu = getMakeupUseCase()
//                _menuLiveData.value = menu

        }
    }

}