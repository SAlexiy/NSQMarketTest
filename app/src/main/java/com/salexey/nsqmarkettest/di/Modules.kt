package com.salexey.nsqmarkettest.di

import com.salexey.nsqmarkettest.domain.stt.STT
import com.salexey.nsqmarkettest.network.ktor.Ktor
import com.salexey.nsqmarkettest.network.repositories.STTRepository
import com.salexey.nsqmarkettest.ui.screens.splashscreen.SplashViewModel
import io.ktor.util.reflect.*
import org.kodein.di.*

val di = DI {

    bindSingleton<Ktor> { Ktor() }
    bindSingleton<STTRepository> { STTRepository(instance()) }
    bindProvider<STT> { STT(instance()) }

    bindSingleton<SplashViewModel> { SplashViewModel( instance())}
}
