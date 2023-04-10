package com.salexey.nsqmarkettest

import android.app.Application
import org.kodein.di.DI
import org.kodein.di.DIAware

class MainApplication() : Application(), DIAware{

    override val di by DI.lazy {
        /* bindings */
    }


    override fun onCreate() {
        super.onCreate()

    }

}
