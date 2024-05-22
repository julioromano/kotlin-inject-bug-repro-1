package com.example.myapplication;

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel
import me.tatarka.inject.annotations.Inject;

@Inject
class TrendingNavigation(
    val trendingScreen: TrendingScreen,
)

typealias TrendingScreen = @Composable ((id: Long) -> Unit) -> Unit

@Inject
@Composable
fun TrendingScreen(
    trendingViewModel: () -> TrendingViewModel,
    navToDetail: (id: Long) -> Unit,
) {
    val vm = remember { trendingViewModel() }
    Text(text = "I'm just a placeholder")
}

@Inject
class TrendingViewModel : ViewModel()
