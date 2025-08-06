package com.oam.todoappcompose.domain.usecase

import com.oam.todoappcompose.domain.model.Task
import com.oam.todoappcompose.domain.repository.TaskRepository

class UpdateTaskUseCase(
    private val repository: TaskRepository
) {
    suspend operator fun invoke(task: Task) {
        repository.updateTask(task)
    }
}
