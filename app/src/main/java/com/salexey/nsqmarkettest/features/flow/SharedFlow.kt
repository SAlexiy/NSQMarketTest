package com.salexey.nsqmarkettest.features.flow

import android.app.usage.UsageEvents
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow

class SharedFlow {
    private val _events = MutableSharedFlow<UsageEvents.Event>()
    val events = _events.asSharedFlow() // read-only public view

    suspend fun postEvent(event: UsageEvents.Event) {
        _events.emit(event) // suspends until subscribers receive it
    }
}