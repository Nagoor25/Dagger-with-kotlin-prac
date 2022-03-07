package com.example.mydaggerwithkotlinprac

import android.util.Log
import javax.inject.Inject

class Mobile {
    lateinit var battery: Battery
     lateinit var processor: Processor
  //Inject tell to dagger to create particular classes in construc
    @Inject
    constructor(battery: Battery, processor: Processor) {
        this.battery = battery
        this.processor = processor
    }
    fun ringing(){
        processor.run()
        System.out.println("Mobile ringing...")
        Log.e("rrr","Mobile ringing...")
    }
}