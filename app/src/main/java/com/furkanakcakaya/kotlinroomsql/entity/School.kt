package com.furkanakcakaya.kotlinroomsql.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

@Entity(tableName = "School")
data class School(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "school_id") @NotNull val school_id: Int,
    @ColumnInfo(name = "school_name") @NotNull val school_name: String,
    @ColumnInfo(name = "school_location") @NotNull val school_location: String
)