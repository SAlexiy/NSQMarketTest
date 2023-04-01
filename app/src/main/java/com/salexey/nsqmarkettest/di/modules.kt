package com.salexey.nsqmarkettest.di

import com.salexey.nsqmarkettest.ktor.Downloader
import com.salexey.nsqmarkettest.ui.screens.splashscreen.SplashViewModel
import org.koin.dsl.module
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.singleOf

val appModule = module {
    viewModelOf(::SplashViewModel)
}


val networkModule = module {
    singleOf(::Downloader)
}