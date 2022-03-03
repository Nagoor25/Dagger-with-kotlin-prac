package com.example.mydaggerwithkotlinprac

import javax.inject.Inject

class Mediatech:Processor {
    @Inject
    constructor()
    override fun run() {
        System.out.println("running Mediatech")

    }
}