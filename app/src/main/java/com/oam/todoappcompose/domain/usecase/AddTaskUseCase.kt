package com.oam.todoappcompose.domain.usecase

import com.oam.todoappcompose.domain.model.Task
import com.oam.todoappcompose.domain.repository.TaskRepository

class AddTaskUseCase(
    private val repository: TaskRepository
) {
    suspend operator fun invoke(task: Task) {
        repository.addTask(task)
    }
}
