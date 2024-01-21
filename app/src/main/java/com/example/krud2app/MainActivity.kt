package com.example.krud2app

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var fileHandler: filehandler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fileHandler = filehandler(this)

        val btnUpdateFile: Button = findViewById(R.id.btnUpdateFile)
        val btnDeleteFile: Button = findViewById(R.id.btnDeleteFile)

        btnUpdateFile.setOnClickListener {
            // Example: Update file named "example.txt" with new content "Updated Content"
            fileHandler.updateFile("example.txt", "Updated Content")
        }

        btnDeleteFile.setOnClickListener {
            // Example: Delete file named "example.txt"
            fileHandler.deleteFile("example.txt")
        }
    }
}
