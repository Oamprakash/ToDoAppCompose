package com.oam.todoappcompose.domain.model

import java.util.UUID
import java.time.LocalDateTime

data class Task(
    val id: String = UUID.randomUUID().toString(),
    val title: String,
    val description: String? = null,
    val dueDate: LocalDateTime? = null,
    val isCompleted: Boolean = false
)
