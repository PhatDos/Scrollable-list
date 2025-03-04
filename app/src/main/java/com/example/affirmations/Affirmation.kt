package com.example.affirmations

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int,
    @DrawableRes val like: Int,
    @DrawableRes val dislike: Int
)
