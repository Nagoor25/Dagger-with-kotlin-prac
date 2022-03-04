package com.example.mydaggerwithkotlinprac

import dagger.Module
import dagger.Provides

@Module
class MediatechProcessorModule {

    @Provides
    fun providesMediatech(MediatechProcessor: MediatechProcessor):Processor{
        return MediatechProcessor
    }
}