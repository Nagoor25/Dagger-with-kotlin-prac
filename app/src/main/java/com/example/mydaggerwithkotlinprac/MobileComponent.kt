package com.example.mydaggerwithkotlinprac

import dagger.Component

@Component
interface MobileComponent {

    fun getMobile():Mobile
}