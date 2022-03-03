package com.example.mydaggerwithkotlinprac

import dagger.Component
import javax.inject.Inject

@Component
interface MobileComponent {

    fun getMobile():Mobile

    fun inject(mainActivity: MainActivity)
}