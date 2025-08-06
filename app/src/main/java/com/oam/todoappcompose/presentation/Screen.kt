package com.oam.todoappcompose.presentation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.oam.todoappcompose.presentation.tasklist.TaskListScreen
import com.oam.todoappcompose.presentation.addtask.AddTaskScreen

sealed class Screen(val route: String) {
    object TaskList : Screen("task_list")
    object AddTask : Screen("add_task")
}

@Composable
fun ToDoNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.TaskList.route
    ) {
        composable(Screen.TaskList.route) {
            TaskListScreen(onNavigateToAddTask = {
                navController.navigate(Screen.AddTask.route)
            })
        }
        composable(Screen.AddTask.route) {
            AddTaskScreen(onNavigateBack = { navController.popBackStack() })
        }
    }
}
