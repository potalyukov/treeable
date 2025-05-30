package com.mobiray.treeable.feature.treeview.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun TreeScreen(
    modifier: Modifier = Modifier,
    viewModel: TreeViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()

    Scaffold(modifier = modifier) { padding ->
        Text(state, Modifier.padding(padding))
    }
}

