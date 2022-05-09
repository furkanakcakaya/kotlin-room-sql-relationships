package com.furkanakcakaya.kotlinroomsql.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

@Entity(tableName = "Class")
data class Class(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "class_id") @NotNull val class_id: Int,
    @ColumnInfo(name = "class_name") @NotNull val class_name: String,
    @ColumnInfo(name = "class_location") @NotNull val class_location: String
)

