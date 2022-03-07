package com.example.mydaggerwithkotlinprac.module

import com.example.mydaggerwithkotlinprac.Processor
import com.example.mydaggerwithkotlinprac.SnapdragonProcessor
import dagger.Module
import dagger.Provides

@Module
class SnapdragonProcessorModule {

    @Provides
    fun providesSnapdragon(snapdragonProcessor: SnapdragonProcessor): Processor {
        return snapdragonProcessor
    }
}