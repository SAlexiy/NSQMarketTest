package com.salexey.nsqmarkettest.ui.screens.splashscreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.salexey.nsqmarkettest.domain.flow.StateFlow
import com.salexey.nsqmarkettest.domain.stt.STT
import kotlinx.coroutines.*
import java.util.logging.Logger

class SplashViewModel(
    private val stt: STT
) :ViewModel() {
    val logger = Logger.getLogger("SplashViewModel")

    val screenId = StateFlow<String>("")

    init {
        getScreenId()
    }
    private fun getScreenId() {
        viewModelScope.launch {

            logger.info("getScreenId")

            screenId.setValue(
                stt.sttScreenId()
            )

            return@launch
        }
        return
    }


    companion object{
        var splashViewModel: SplashViewModel? = null

        fun getInstance(stt: STT): SplashViewModel {

            if (splashViewModel != null){
                return splashViewModel!!
            }

            splashViewModel = SplashViewModel(stt)
            return splashViewModel!!
        }
    }

}
