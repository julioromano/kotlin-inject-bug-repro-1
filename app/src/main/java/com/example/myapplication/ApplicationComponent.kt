package com.example.myapplication

import android.app.Application
import com.example.foo.TrendingNavigation
import me.tatarka.inject.annotations.Component

@ApplicationScope
@Component
abstract class ApplicationComponent(
    private val application: Application,
) {
    abstract val trendingNavigation: TrendingNavigation
}
