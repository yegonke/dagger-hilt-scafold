package com.yegonke.planner

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class PlannerApplicaton : Application () {
    lateinit var plannerServices : PlannerServices
    override fun onCreate() {
        super.onCreate()
        plannerServices = PlannerServices(applicationContext)
    }
}