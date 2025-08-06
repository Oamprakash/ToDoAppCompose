package com.oam.todoappcompose.domain.usecase

import com.oam.todoappcompose.domain.model.Task
import com.oam.todoappcompose.domain.repository.TaskRepository
import kotlinx.coroutines.flow.Flow

class GetTasksUseCase(
    private val repository: TaskRepository
) {
    operator fun invoke(): Flow<List<Task>> {
        return repository.getTasks()
    }
}
