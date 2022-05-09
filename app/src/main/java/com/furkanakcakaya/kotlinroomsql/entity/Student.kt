package com.furkanakcakaya.kotlinroomsql.entity

import androidx.room.Entity

@Entity(tableName = "Student")
data class Student(
    val student_id: Int,
    val student_name: String,
    val student_grade: String
)