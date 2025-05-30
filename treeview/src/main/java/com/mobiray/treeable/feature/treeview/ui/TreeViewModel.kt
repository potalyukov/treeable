package com.mobiray.treeable.feature.treeview.ui

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class TreeViewModel @Inject constructor() : ViewModel() {
    private val _state = MutableStateFlow("string state")
    val state = _state.asStateFlow()
}