package com.example.fanianggita.recyclerview.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

// TODO 2: Menyiapkan tipe data afirmasi dan gambarnya
data class Affirmation(
    // Menyiapkan resource teks dan gambar
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)