package com.example.mydaggerwithkotlinprac.module

import com.example.mydaggerwithkotlinprac.MediatechProcessor
import com.example.mydaggerwithkotlinprac.Processor
import dagger.Binds
import dagger.Module

@Module
abstract class MediatechProcessorModule {
//it will Reduse the code by abstract methods
  @Binds
    abstract fun providesMediatech(MediatechProcessor: MediatechProcessor): Processor

}