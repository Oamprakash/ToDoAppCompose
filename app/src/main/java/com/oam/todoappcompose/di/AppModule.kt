package com.oam.todoappcompose.di

import android.app.Application
import androidx.room.Room
import com.oam.todoappcompose.data.local.TaskDatabase
import com.oam.todoappcompose.data.repository.TaskRepositoryImpl
import com.oam.todoappcompose.domain.repository.TaskRepository
import com.oam.todoappcompose.domain.usecase.AddTaskUseCase
import com.oam.todoappcompose.domain.usecase.DeleteTaskUseCase
import com.oam.todoappcompose.domain.usecase.GetTasksUseCase
import com.oam.todoappcompose.domain.usecase.TaskUseCases
import com.oam.todoappcompose.domain.usecase.UpdateTaskUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    // Provide Room Database
    @Provides
    @Singleton
    fun provideDatabase(app: Application): TaskDatabase {
        return Room.databaseBuilder(
            app,
            TaskDatabase::class.java,
            "task_db"
        ).build()
    }

    // Provide DAO
    @Provides
    fun provideTaskDao(db: TaskDatabase) = db.taskDao()

    // Provide Repository
    @Provides
    @Singleton
    fun provideTaskRepository(db: TaskDatabase): TaskRepository {
        return TaskRepositoryImpl(db.taskDao())
    }

    // Provide UseCases
    @Provides
    @Singleton
    fun provideTaskUseCases(repository: TaskRepository): TaskUseCases {
        return TaskUseCases(
            addTask = AddTaskUseCase(repository),
            getTasks = GetTasksUseCase(repository),
            updateTask = UpdateTaskUseCase(repository),
            deleteTask = DeleteTaskUseCase(repository)
        )
    }
}
