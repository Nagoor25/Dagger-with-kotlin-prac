package com.example.mydaggerwithkotlinprac

import javax.inject.Inject


class Battery {
    //with out construct with @Inject ann dagger not create that class
    @Inject
    constructor()
}