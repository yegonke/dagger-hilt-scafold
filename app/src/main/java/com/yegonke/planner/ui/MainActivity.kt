package com.yegonke.planner.ui

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.yegonke.planner.PlannerApplicaton
import com.yegonke.planner.R
import com.yegonke.planner.data.PlannerLocalDataSource
import dagger.hilt.android.AndroidEntryPoint

//@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var planner: PlannerLocalDataSource

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        populateFields(this)

        findViewById<Button>(R.id.button1).setOnClickListener {
            planner.addPLan("Interaction with 'Button 1'")
        }

        findViewById<Button>(R.id.button2).setOnClickListener {
            planner.getAllPlans {plans ->
               if (plans.size>0) Toast.makeText(this, plans.toString(), Toast.LENGTH_SHORT).show()

            }
        }

        findViewById<Button>(R.id.button3).setOnClickListener {
            planner.removePlans()
        }
    }

    private fun populateFields(context: Context) {
        planner = (context.applicationContext as PlannerApplicaton).
        plannerServices.plannerLocalDataSource
    }
}