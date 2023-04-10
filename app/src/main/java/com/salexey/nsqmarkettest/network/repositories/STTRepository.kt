package com.salexey.nsqmarkettest.network.repositories

import com.salexey.nsqmarkettest.consts.URLs
import com.salexey.nsqmarkettest.network.ktor.Ktor
import io.ktor.client.call.*
import io.ktor.client.request.*
import java.util.logging.Logger

class STTRepository(
    private val ktor: Ktor
) {
    val logger = Logger.getLogger("STTRepository")

    /**
     * отправляет в контейнер ссылку на аудиофайл,
     * который конвертирует в нужный для yandex speechkit формат,
     * отправляет speechkit файл на распознание и возвращает распознаный текст
     */
    suspend fun sttByUrl(audioUrl: String): String {
        logger.info("sttByUrl")

        val response = ktor.client.get(URLs.sstUrl){
            setBody(audioUrl)
        }
        logger.info("sttByUrl: ${response.status}")

        val resultSTT = response.body<String>()
        logger.info("sttByUrl: ${resultSTT}")

        return resultSTT
    }
}