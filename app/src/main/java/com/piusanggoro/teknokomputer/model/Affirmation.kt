package com.piusanggoro.teknokomputer.model

// template (model) data --> tipe data yg didefinisikan sendiri
//data class Affirmation(val stringResourceId: Int)

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)