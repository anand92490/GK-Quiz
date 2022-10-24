package com.team2.gkquiz3
// October 17, 2022 - Team 2 - Anand and Muhammed

data class Question(
    val id: Int,
    val questionText: String,
    val image: Int,
    val alternatives: ArrayList<String>,
    val correctAnswerIndex: Int,
)
