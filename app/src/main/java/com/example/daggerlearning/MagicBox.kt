package com.example.daggerlearning

import dagger.Component


@Component
interface MagicBox {
    fun poke(app:MainActivity)
}