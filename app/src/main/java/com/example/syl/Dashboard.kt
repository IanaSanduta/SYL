package com.example.syl

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIconDefaults.Text
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.syl.ui.theme.LightBack
import com.example.syl.ui.theme.SYLTheme


@Composable
fun DashboardScreen(navController: NavController) {



}

@Composable
@Preview(showBackground = true)
fun DashboardScreenPreview() {
    DashboardScreen(navController = rememberNavController())
}