package com.furkanakcakaya.kotlinroomsql.entity

import androidx.room.Entity

@Entity(tableName = "Parent")
data class Parent(
    val parent_id: Int,
    val parent_name: String,
    val parent_location: String
)