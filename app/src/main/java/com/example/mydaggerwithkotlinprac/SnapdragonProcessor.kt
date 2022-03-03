package com.example.mydaggerwithkotlinprac

import android.util.Log
import javax.inject.Inject

class SnapdragonProcessor: Processor {
    @Inject
    constructor()
    override fun run() {
        //Log.e("SnapdragonProcessor","running SnapdraonProcessor")
        System.out.println("running SnapdraonProcessor")
    }
}