package com.salexey.nsqmarkettest.features.file

import org.apache.commons.io.IOUtils
import java.io.BufferedInputStream
import java.io.InputStream

class FileComparator {
    fun compare(file1: InputStream, file2: InputStream): Float {



        IOUtils.contentEquals(file1, file2)

        BufferedInputStream(file1).use { fis1 ->
            BufferedInputStream(file2).use { fis2 ->

                var ch = 0
                var pos: Long = 1

                while (fis1.read().also { ch = it } != -1) {
                    if (ch != fis2.read()) {
                        file1.close()
                        file2.close()

                        return pos.toFloat()
                    }
                    pos++
                }

                if (fis2.read() == -1) {
                    file1.close()
                    file2.close()

                    return (-1).toFloat()
                } else {
                    file1.close()
                    file2.close()
                    return pos.toFloat()
                }

            }
        }




    }


}
