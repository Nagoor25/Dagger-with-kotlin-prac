package com.example.mydaggerwithkotlinprac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var mobile: Mobile
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mobileComponent=DaggerMobileComponent.create()
        // By using this implement all the depend parameter with inject
        mobileComponent.inject(this)
        mobile.ringing()


    }
}