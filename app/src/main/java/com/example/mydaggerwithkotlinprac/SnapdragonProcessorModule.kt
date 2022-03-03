package com.example.mydaggerwithkotlinprac

import dagger.Module
import dagger.Provides

@Module
class SnapdragonProcessorModule {

    @Provides
    fun providesSnapdragon(snapdragonProcessor: SnapdragonProcessor):Processor{
        return snapdragonProcessor
    }
}