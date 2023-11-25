package com.example.mindtherapy.fonts

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.mindtherapy.R

val libreBaskervilleText = FontFamily(
    Font(R.font.libre_baskerville_bold, FontWeight.Bold)
)
val lobsterRegularTitle = FontFamily(
    Font(R.font.lobster_regular)
)
val blackOpsAppTitle = FontFamily(
    Font(R.font.black_ops_one_regular)
)
val styles = Typography (
    displaySmall = TextStyle(
        fontFamily = libreBaskervilleText,
        fontSize = 20.sp
    ),
    displayMedium = TextStyle(
        fontFamily = lobsterRegularTitle,
        fontSize = 30.sp
    ),
    titleLarge = TextStyle(
        fontFamily = blackOpsAppTitle,
        fontSize = 35.sp
    )
)