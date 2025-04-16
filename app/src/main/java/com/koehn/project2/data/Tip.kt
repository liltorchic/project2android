package com.koehn.project2.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.koehn.project2.R

data class Tip(
    @DrawableRes val imageResourceID:Int,
    @StringRes val textResourceID:Int,
)

val tips = listOf<Tip>(
    Tip(R.drawable.pic_1, R.string.text_1),
    Tip(R.drawable.pic_2, R.string.text_2),
    Tip(R.drawable.pic_3, R.string.text_3),
    Tip(R.drawable.pic_4, R.string.text_4),
    Tip(R.drawable.pic_5, R.string.text_5),
    Tip(R.drawable.pic_6, R.string.text_6),
    Tip(R.drawable.pic_7, R.string.text_7),
    Tip(R.drawable.pic_8, R.string.text_8),
    Tip(R.drawable.pic_9, R.string.text_9),
    Tip(R.drawable.pic_10, R.string.text_10),
    Tip(R.drawable.pic_11, R.string.text_11),
    Tip(R.drawable.pic_12, R.string.text_12),
    Tip(R.drawable.pic_13, R.string.text_13),
    Tip(R.drawable.pic_14, R.string.text_14),
    Tip(R.drawable.pic_15, R.string.text_15),
    Tip(R.drawable.pic_16, R.string.text_16),
    Tip(R.drawable.pic_17, R.string.text_17),
    Tip(R.drawable.pic_18, R.string.text_18),
    Tip(R.drawable.pic_19, R.string.text_19),
    Tip(R.drawable.pic_20, R.string.text_20),
    Tip(R.drawable.pic_21, R.string.text_21),
    Tip(R.drawable.pic_22, R.string.text_22),
    Tip(R.drawable.pic_23, R.string.text_23),
    Tip(R.drawable.pic_24, R.string.text_24),
    Tip(R.drawable.pic_25, R.string.text_25),
    Tip(R.drawable.pic_26, R.string.text_26),
    Tip(R.drawable.pic_27, R.string.text_27),
    Tip(R.drawable.pic_28, R.string.text_28),
    Tip(R.drawable.pic_29, R.string.text_29),
    Tip(R.drawable.pic_30, R.string.text_30)
)
