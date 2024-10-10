package myst.mostafayellowstone.abuhassan.data.local.domain.model

import androidx.annotation.DrawableRes

data class PopularItemsState (
    @DrawableRes val ResId: Int,
    val title: String,
    val price: Double,
    val rate: Double,
    val description: String,
    val calori: Double,
    val ingradients: List<Int>
)