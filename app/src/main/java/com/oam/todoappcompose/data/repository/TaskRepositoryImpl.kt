package com.oam.todoappcompose.data.repository

import com.oam.todoappcompose.data.local.TaskDao
import com.oam.todoappcompose.data.mapper.toDomain
import com.oam.todoappcompose.data.mapper.toEntity
import com.oam.todoappcompose.domain.model.Task
import com.oam.todoappcompose.domain.repository.TaskRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class TaskRepositoryImpl(
    private val dao: TaskDao
) : TaskRepository {

    override fun getTasks(): Flow<List<Task>> {
        return dao.getTasks().map { tasks -> tasks.map { it.toDomain() } }
    }

    override suspend fun getTaskById(id: String): Task? {
        return dao.getTaskById(id)?.toDomain()
    }

    override suspend fun addTask(task: Task) {
        dao.insertTask(task.toEntity())
    }

    override suspend fun updateTask(task: Task) {
        dao.updateTask(task.toEntity())
    }

    override suspend fun deleteTask(task: Task) {
        dao.deleteTask(task.toEntity())
    }
}
