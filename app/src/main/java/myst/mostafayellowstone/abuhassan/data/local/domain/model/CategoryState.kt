package myst.mostafayellowstone.abuhassan.data.local.domain.model

import androidx.annotation.DrawableRes

data class CategoryState(
    @DrawableRes val resId: Int,
    val title: String,
    val isSelected: Boolean = false
)
