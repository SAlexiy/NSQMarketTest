package com.salexey.nsqmarkettest.domain.flow

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class StateFlow<T>(value: T) {
    private val _value = MutableStateFlow<T>(value)
    val value = _value.asStateFlow()

    fun setValue(value: T) {
        _value.value = value
    }

    fun getValue(): T {
        return value.value
    }

    suspend fun a(): Unit {
        value.collect {
            println("")
        }
    }
}