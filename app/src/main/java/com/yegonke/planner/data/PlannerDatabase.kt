package com.yegonke.planner.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Log::class), version = 1, exportSchema = false)
abstract class PlannerDatabase : RoomDatabase() {
    abstract fun logDao(): LogDao
}
