package com.salexey.nsqmarkettest.ui.screens.splashscreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.salexey.nsqmarkettest.consts.URLs
import com.salexey.nsqmarkettest.features.file.FileComparator
import com.salexey.nsqmarkettest.features.file.FileDownloader
import com.salexey.nsqmarkettest.features.flow.StateFlow
import kotlinx.coroutines.*
import org.apache.commons.io.IOUtils
import java.io.InputStream

class SplashViewModel(
    private val fileDownloader: FileDownloader,
) :ViewModel() {
    private val ioScope = CoroutineScope(Dispatchers.IO)

    val fileD = StateFlow<Boolean?>(null)

    private var file1 = StateFlow<InputStream?>(null)
    private var file2 = StateFlow<InputStream?>(null)

    private fun compareFile() {
        ioScope.launch {

            if (file1.getValue() != null && file2.getValue() != null){
                try {
                    fileD.setValue(IOUtils.contentEquals(file1.getValue(), file2.getValue()))
                } catch (e: Exception) {
                    fileD.setValue(true)
                }

                //fileComparator.compare(file1.getValue()!!, file2.getValue()!!) == -1.0f
            }
        }
    }

    fun downloadFiles(){
        ioScope.launch {
            file1.setValue(fileDownloader.download(URLs.urlFile1))
            file2.setValue(fileDownloader.download(URLs.urlFile2))
        }

        collectChanges()
    }

    private fun collectChanges(): Unit {
        viewModelScope.launch {
            file1.value.collect{
                compareFile()
            }
        }

        viewModelScope.launch {
            file2.value.collect{
                compareFile()
            }
        }

    }

}
