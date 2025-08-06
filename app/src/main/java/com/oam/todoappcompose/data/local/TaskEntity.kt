package com.oam.todoappcompose.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.oam.todoappcompose.domain.model.Task
import java.time.LocalDateTime

@Entity(tableName = "tasks")
data class TaskEntity(
    @PrimaryKey val id: String,
    val title: String,
    val description: String?,
    val dueDate: LocalDateTime?, // Requires a TypeConverter
    val isCompleted: Boolean
)


