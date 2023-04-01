package com.salexey.nsqmarkettest.ktor

import android.app.DownloadManager
import android.content.Context
import android.os.Environment
import androidx.core.net.toUri

class Downloader(
    private val context: Context
){

    private val downloadManager = context.getSystemService(DownloadManager::class.java)

    fun downloadFile(url: String): Long {
        val request = DownloadManager.Request(url.toUri())
            .setMimeType("audio/mpeg")
            .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_MOBILE)
            .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI)
            .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
            .setTitle("image.mp3")
            .addRequestHeader("Authorization", "Bearer <token>")
            .setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, "image.mp3")

        return downloadManager.enqueue(request)
    }


}

