package com.example.krud2app

import java.io.File
import java.io.FileWriter
import java.io.IOException

object Utils {

    @Throws(IOException::class)
    fun writeToFile(file: File, content: String) {
        file.writer().use { it.write(content) }
    }
}