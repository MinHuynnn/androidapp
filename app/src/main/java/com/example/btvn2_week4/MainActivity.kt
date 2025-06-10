package com.example.btvn2_week4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import navigation.AppNavigation
import com.example.btvn2_week4.ui.theme.Btvn2_Week4Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Btvn2_Week4Theme {
                AppNavigation()
            }
        }
    }
}
