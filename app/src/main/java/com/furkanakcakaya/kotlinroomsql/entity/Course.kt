package com.furkanakcakaya.kotlinroomsql.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

@Entity(tableName = "Course")
data class Course(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "course_id") @NotNull val course_id: Int,
    @ColumnInfo(name = "course_name") @NotNull val course_name: String,
    @ColumnInfo(name = "course_location") @NotNull val course_location: String
)