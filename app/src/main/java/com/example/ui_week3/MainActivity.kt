package com.example.ui_week3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import screens.ColumnLayoutScreen
import screens.ImagesScreen
import screens.RowLayoutScreen
import screens.TextDetailScreen
import screens.TextFieldScreen
import screens.UIComponentsListScreen
import screens.WelcomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "welcome") {
        composable("welcome") { WelcomeScreen(navController) }
        composable("components") { UIComponentsListScreen(navController) }
        composable("text_detail") { TextDetailScreen(navController) }
        composable("images") { ImagesScreen(navController) }
        composable("textfield") { TextFieldScreen(navController) }
        composable("row_layout") { RowLayoutScreen(navController) }
        composable("column_layout") { ColumnLayoutScreen(navController) }
    }
}