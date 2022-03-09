package com.example.syl.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.syl.R

// Set of Material typography styles to start with
val Typography by lazy {
    Typography(

        h1 = TextStyle(
            fontFamily = Bevietnampro_black,
            fontWeight = FontWeight.Normal,
            fontSize = 10.sp
        ),



        body1 = TextStyle(
           // fontFamily = Roboto_regular1,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp
        ),

        button = TextStyle(
            fontFamily = Outfit,
            fontWeight = FontWeight.Bold
        )

    )


}
val Bevietnampro_black = FontFamily(
    Font(R.font.bevietnampro_black),
)

val Bevietnampro_extrabold = FontFamily(
    Font(R.font.bevietnampro_extrabold),
)

val Bevietnampro_medium = FontFamily(
    Font(R.font.bevietnampro_medium),
)

val Roboto_regular1 = FontFamily(
    Font(R.font.roboto_medium),
    Font(R.font.roboto_light),
    Font(R.font.roboto_regular)
)


val Outfit = FontFamily(
    Font(R.font.outfit_medium),
    Font(R.font.outfit_regular),
    Font(R.font.outfit_extrabold)
)
