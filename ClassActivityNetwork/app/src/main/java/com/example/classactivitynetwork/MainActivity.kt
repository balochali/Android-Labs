package com.example.classactivitynetwork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.URL
import javax.net.ssl.HttpsURLConnection

class MainActivity : AppCompatActivity() {

    val stringUrl = "test_get.php?subject=PHP&web=W3schools.com"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun getData (view: View){
        val text : TextView = findViewById(R.id.textView)
        var url : URL = URL(stringUrl)
        val connection : HttpsURLConnection = url.openConnection() as HttpsURLConnection

        var inputStream = BufferedReader(InputStreamReader(connection.inputStream))

        var data = ""
        var line = ""

        line = inputStream.readLine()
        text.text = line

        inputStream.close()
        connection.disconnect()
    }
}