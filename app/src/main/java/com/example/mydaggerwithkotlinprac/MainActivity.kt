package com.example.mydaggerwithkotlinprac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    lateinit var mobile: Mobile
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       /*
       // Manual Dependency Injection
        val battery=Battery()
        val processor=Processor()
        val mobile=Mobile(battery, processor)
        mobile.ringing()
        */
        // using Dagger di DaggerMobileComponent created  by dagger
        mobile=DaggerMobileComponent.create().getMobile()
        mobile.ringing()

    }
}