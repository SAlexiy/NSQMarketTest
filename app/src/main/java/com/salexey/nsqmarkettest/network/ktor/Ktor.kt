package com.salexey.nsqmarkettest.network.ktor

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.contentnegotiation.*

class Ktor{
    val client = HttpClient(CIO){
        install(ContentNegotiation){

        }
    }
}
