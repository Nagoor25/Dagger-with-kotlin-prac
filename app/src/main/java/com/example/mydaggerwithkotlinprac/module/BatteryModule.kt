package com.example.mydaggerwithkotlinprac.module

import com.example.mydaggerwithkotlinprac.Battery
import dagger.Module
import dagger.Provides

@Module
class BatteryModule {
    @Provides
    fun providesBattery(): Battery {
        System.out.println("providesBatteryModule : Battery")
        return Battery()
    }
}