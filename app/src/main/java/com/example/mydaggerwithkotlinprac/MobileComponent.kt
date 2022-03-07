package com.example.mydaggerwithkotlinprac

import com.example.mydaggerwithkotlinprac.module.MediatechProcessorModule
import dagger.Component

@Component(modules = [/*SnapdragonProcessorModule::class,*/MediatechProcessorModule::class])
interface MobileComponent {

    fun getMobile():Mobile

    fun inject(mainActivity: MainActivity)
}