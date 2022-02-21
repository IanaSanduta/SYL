package com.example.syl

sealed class Screen(val route: String) {
    object Home : Screen("homeScreen_activity")
    object Login : Screen("loginScreen_activity")
    object Dashboard : Screen ("dashboard_activity")
    object Register : Screen ("register_activity")
}


