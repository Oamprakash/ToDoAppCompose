package com.oam.todoappcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.oam.todoappcompose.presentation.ToDoNavGraph
import com.oam.todoappcompose.ui.theme.ToDoAppComposeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ToDoAppComposeTheme {
                Surface(
                    color = MaterialTheme.colorScheme.background,
                    modifier = Modifier
                ) {
                    val navController = rememberNavController()
                    ToDoNavGraph(navController)
                }
            }
        }
    }
}
