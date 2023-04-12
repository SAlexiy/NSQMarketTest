package com.salexey.nsqmarkettest.di

import com.salexey.nsqmarkettest.domain.stt.STT
import com.salexey.nsqmarkettest.network.ktor.Ktor
import com.salexey.nsqmarkettest.network.repositories.STTRepository
import com.salexey.nsqmarkettest.ui.screens.splashscreen.SplashViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val appModule = module {
    single { Ktor() }
    single { STTRepository(get()) }
    single { STT(get()) }

    viewModel { SplashViewModel.getInstance(get()) }

}

val ktorModule = module {
    single { Ktor() }
    single { STTRepository(get()) }
    single { STT(get()) }

}
