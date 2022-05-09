package com.furkanakcakaya.kotlinroomsql.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

@Entity(tableName = "Parent")
data class Parent(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "parent_id") @NotNull val parent_id: Int,
    @ColumnInfo(name = "parent_name") @NotNull val parent_name: String,
    @ColumnInfo(name = "parent_location") @NotNull val parent_location: String
)