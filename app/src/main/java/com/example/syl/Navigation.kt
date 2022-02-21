package com.example.syl

import android.provider.ContactsContract
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation(navController : NavController) {

    NavHost(navController = navController as NavHostController, startDestination = Screen.Home.route) {
        composable(Screen.Home.route) {
            HomeScreen(navController = navController)
        }
        composable(Screen.Login.route) {
            SignInScreen(navController = navController)
        }

        composable(Screen.Dashboard.route) {
            DashboardScreen(navController = navController)
        }

        composable(Screen.Register.route) {
            RegisterScreen(navController = navController)
        }

    }
}