package com.example.krud2app
import android.content.Context
import java.io.File
import java.io.IOException

class filehandler(private val context: Context) {

    fun updateFile(fileName: String, content: String) {
        try {
            // Get the file path
            val file = File(context.filesDir, fileName)

            // Write the new content to the file
            // For simplicity, we overwrite the entire content
            // You might want to implement a more sophisticated update logic
            // depending on your use case
            Utils.writeToFile(file, content)
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    fun deleteFile(fileName: String) {
        // Get the file path
        val file = File(context.filesDir, fileName)

        // Check if the file exists before attempting to delete
        if (file.exists()) {
            file.delete()
        }
    }
}
