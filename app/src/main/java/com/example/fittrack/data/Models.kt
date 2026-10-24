package com.example.fittrack.data

import androidx.navigationevent.NavigationEventHistory

//workout difficulty level
enum class Difficulty {Beginner, Intermediate, Advanced}

data class Exercise(
    val category: String,
    val difficulty: Difficulty,
    val id: Int, // number used for navagation
    val name: String,
    val preview: String, //one sentence instruction
    val instructions: List<String>, //step by step instructions
    val minutesRecommended: Int
)

//for history log
data class WorkoutLog(
    val id: Int,
    val exerciseName: String,
    val category: String,
    val minutes: Int,
)

data class WorkoutUiState(
    //set to 0 or emptyList(), for no workout history
    val history: List<WorkoutLog> = emptyList(),
    val logCounterId: Int = 1,
    val totalWorkouts: Int = 0,
    val totalMinutes: Int = 0,
)


