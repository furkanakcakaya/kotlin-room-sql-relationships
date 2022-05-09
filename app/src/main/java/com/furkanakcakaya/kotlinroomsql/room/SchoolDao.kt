package com.furkanakcakaya.kotlinroomsql.room

import androidx.room.*
import com.furkanakcakaya.kotlinroomsql.entity.Course
import com.furkanakcakaya.kotlinroomsql.entity.Parent
import com.furkanakcakaya.kotlinroomsql.entity.School
import com.furkanakcakaya.kotlinroomsql.entity.Student
import com.furkanakcakaya.kotlinroomsql.entity.relations.StudentAndParent

@Dao
interface SchoolDao {

    @Query("SELECT * FROM Course")
    suspend fun getAllCourses()

    @Query("SELECT * FROM Parent")
    suspend fun getAllParents()

    @Query("SELECT * FROM School")
    suspend fun getAllSchools()

    @Query("SELECT * FROM Student")
    suspend fun getAllStudents()

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertCourse(course: Course)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertParent(parent: Parent)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertSchool(school: School)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertStudent(student: Student)

    @Transaction
    @Query("SELECT * FROM Student WHERE student_id = :studentId")
    suspend fun getStudentAndParentWithStudentId(studentId: Int): StudentAndParent?
}