package com.syafi.skinscan.features.welcome

import androidx.annotation.IdRes

data class ScreenData(
    @IdRes
    val screenImg: Int,
    val screenTitle: String,
    val screenDesc: String
)