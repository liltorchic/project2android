package com.koehn.project2.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.koehn.project2.R

data class Tips(
    @DrawableRes val imageResourceID:Int,
    @StringRes val textResourceID:Int,
)

val tips = listOf(
    Tips(R.drawable.pic_1, R.string.text_1),
    Tips(R.drawable.pic_2, R.string.text_2),
    Tips(R.drawable.pic_3, R.string.text_3),
    Tips(R.drawable.pic_4, R.string.text_4),
    Tips(R.drawable.pic_5, R.string.text_5),
    Tips(R.drawable.pic_6, R.string.text_6),
    Tips(R.drawable.pic_7, R.string.text_7),
    Tips(R.drawable.pic_8, R.string.text_8),
    Tips(R.drawable.pic_9, R.string.text_9),
    Tips(R.drawable.pic_10, R.string.text_10),
    Tips(R.drawable.pic_11, R.string.text_11),
    Tips(R.drawable.pic_12, R.string.text_12),
    Tips(R.drawable.pic_13, R.string.text_13),
    Tips(R.drawable.pic_14, R.string.text_14),
    Tips(R.drawable.pic_15, R.string.text_15),
    Tips(R.drawable.pic_16, R.string.text_16),
    Tips(R.drawable.pic_17, R.string.text_17),
    Tips(R.drawable.pic_18, R.string.text_18),
    Tips(R.drawable.pic_19, R.string.text_19),
    Tips(R.drawable.pic_20, R.string.text_20),
    Tips(R.drawable.pic_21, R.string.text_21),
    Tips(R.drawable.pic_22, R.string.text_22),
    Tips(R.drawable.pic_23, R.string.text_23),
    Tips(R.drawable.pic_24, R.string.text_24),
    Tips(R.drawable.pic_25, R.string.text_25),
    Tips(R.drawable.pic_26, R.string.text_26),
    Tips(R.drawable.pic_27, R.string.text_27),
    Tips(R.drawable.pic_28, R.string.text_28),
    Tips(R.drawable.pic_29, R.string.text_29),
    Tips(R.drawable.pic_30, R.string.text_30)
)
