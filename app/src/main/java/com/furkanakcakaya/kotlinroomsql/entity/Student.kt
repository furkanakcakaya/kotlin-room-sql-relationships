package com.furkanakcakaya.kotlinroomsql.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

@Entity(tableName = "Student")
data class Student(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "student_id") @NotNull val student_id: Int,
    @ColumnInfo(name = "student_name") @NotNull val student_name: String,
    @ColumnInfo(name = "student_grade") @NotNull val student_grade: String,
    @ColumnInfo(name = "parent_id") @NotNull val parent_id: Int
)