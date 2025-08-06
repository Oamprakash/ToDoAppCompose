package com.oam.todoappcompose.domain.usecase

import com.oam.todoappcompose.domain.model.Task
import com.oam.todoappcompose.domain.repository.TaskRepository

class DeleteTaskUseCase(
    private val repository: TaskRepository
) {
    suspend operator fun invoke(task: Task) {
        repository.deleteTask(task)
    }
}
