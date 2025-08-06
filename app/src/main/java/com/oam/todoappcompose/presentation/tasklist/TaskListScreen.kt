package com.oam.todoappcompose.presentation.tasklist

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.oam.todoappcompose.domain.model.Task

@Composable
fun TaskListScreen(
    onNavigateToAddTask: () -> Unit,
    viewModel: TaskListViewModel = hiltViewModel()
) {
    val tasks = viewModel.tasks.collectAsState()

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = onNavigateToAddTask) {
                Icon(Icons.Default.Add, contentDescription = "Add Task")
            }
        }
    ) { padding ->
        if (tasks.value.isEmpty()) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding),
                contentAlignment = androidx.compose.ui.Alignment.Center
            ) {
                Text("No tasks yet. Tap + to add.")
            }
        } else {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)
                    .padding(16.dp)
            ) {
                items(tasks.value) { task ->
                    TaskItem(
                        task = task,
                        onDelete = { viewModel.deleteTask(task) },
                        onToggleComplete = {
                            viewModel.updateTask(task.copy(isCompleted = !task.isCompleted))
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun TaskItem(task: Task, onDelete: () -> Unit, onToggleComplete: () -> Unit) {
    Card(
        modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(task.title, style = MaterialTheme.typography.titleMedium)
                if (!task.description.isNullOrEmpty()) {
                    Text(task.description!!, style = MaterialTheme.typography.bodySmall)
                }
            }
            Row {
                Checkbox(
                    checked = task.isCompleted,
                    onCheckedChange = { onToggleComplete() }
                )
                Spacer(modifier = Modifier.width(8.dp))
                IconButton(onClick = onDelete) {
                    Icon(Icons.Default.Add, contentDescription = "Delete") // Replace with Delete icon
                }
            }
        }
    }
}
