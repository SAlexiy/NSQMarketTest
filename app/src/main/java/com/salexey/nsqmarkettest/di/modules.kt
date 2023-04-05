package com.salexey.nsqmarkettest.di

import com.salexey.nsqmarkettest.features.file.FileComparator
import com.salexey.nsqmarkettest.features.file.FileDownloader
import com.salexey.nsqmarkettest.ui.screens.splashscreen.SplashViewModel
import org.koin.dsl.module
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.singleOf

val appModule = module {
    viewModelOf(::SplashViewModel)
}

val fileModule = module {
    singleOf(::FileComparator)
    singleOf(::FileDownloader)
}