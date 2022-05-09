    package com.furkanakcakaya.kotlinroomsql.entity.relations

    import androidx.room.Embedded
    import androidx.room.Relation
    import com.furkanakcakaya.kotlinroomsql.entity.Parent
    import com.furkanakcakaya.kotlinroomsql.entity.Student

    data class StudentAndParent (
        @Embedded val student: Student,
        @Relation(
            parentColumn = "parent_id",
            entityColumn = "parent_id"
        )
        val parent: Parent
    )