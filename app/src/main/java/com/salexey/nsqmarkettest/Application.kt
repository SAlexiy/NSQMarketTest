package com.salexey.nsqmarkettest

import android.app.Application
import com.salexey.nsqmarkettest.di.appModule
import com.salexey.nsqmarkettest.di.fileModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class MainApplication : Application(){

    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidLogger()
            androidContext(this@MainApplication)
            modules(appModule, fileModule)
        }
    }

}
