package com.furkanakcakaya.kotlinroomsql.entity

import androidx.room.Entity

@Entity(tableName = "School")
data class School(
    val school_id: Int,
    val school_name: String,
    val school_location: String
)