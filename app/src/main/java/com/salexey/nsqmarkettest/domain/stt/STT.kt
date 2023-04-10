package com.salexey.nsqmarkettest.domain.stt

import com.salexey.nsqmarkettest.consts.URLs
import com.salexey.nsqmarkettest.network.repositories.STTRepository
import java.util.logging.Logger

class STT(
    private val sttRepository: STTRepository
) {
    val logger = Logger.getLogger("STT")

    suspend fun sttScreenId(): String{
        logger.info("sttScreenId")
        return sttRepository.sttByUrl(URLs.screenIdUrl)
    }

    suspend fun sttByUrl(url: String): String{
        logger.info("sttByUrl: $url")
        return sttRepository.sttByUrl(url)
    }
}