package com.oam.todoappcompose.data.mapper

import com.oam.todoappcompose.data.local.TaskEntity
import com.oam.todoappcompose.domain.model.Task


fun TaskEntity.toDomain(): Task {
    return Task(
        id = id,
        title = title,
        description = description,
        dueDate = dueDate,
        isCompleted = isCompleted
    )
}

fun Task.toEntity(): TaskEntity {
    return TaskEntity(
        id = id,
        title = title,
        description = description,
        dueDate = dueDate,
        isCompleted = isCompleted
    )
}
