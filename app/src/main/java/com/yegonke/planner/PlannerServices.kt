package com.yegonke.planner

import android.content.Context
import androidx.room.Room
import com.yegonke.planner.data.PlannerDatabase
import com.yegonke.planner.data.PlannerLocalDataSource

class PlannerServices(applicationContext: Context) {
    val plannerDatabase = Room.databaseBuilder(
        applicationContext,
        PlannerDatabase::class.java, "planner-db"
    ).build()

    val plannerLocalDataSource = PlannerLocalDataSource(plannerDatabase.logDao())

}