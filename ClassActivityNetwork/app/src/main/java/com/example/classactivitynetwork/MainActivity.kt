package com.example.classactivitynetwork

import android.app.DownloadManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.URL
import javax.net.ssl.HttpsURLConnection

class MainActivity : AppCompatActivity() {

    val stringUrl = "https://tryphp.w3schools.com/showphp.php?filename=demo_global_get"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun getData (view: View){


        val text : TextView = findViewById(R.id.textView)
        val url : URL = URL(stringUrl)


        val thread = Thread(Runnable {
                val connection : HttpsURLConnection = url.openConnection() as HttpsURLConnection

                var inputStream = BufferedReader(InputStreamReader(connection.inputStream))

                var line = ""

                line = inputStream.readLine()
                runOnUiThread(Runnable {
                    text.text = line

                })

                inputStream.close()
                connection.disconnect()
            }
        )
        thread.start()
    }

    fun getDataThroughVolley(v : View){
        val url : URL = URL(stringUrl)

        val text : TextView = findViewById(R.id.textView)
        var line = ""

        val queue = Volley.newRequestQueue(this)

        val stringRequest = StringRequest(Request.Method.GET, stringUrl, Response.Listener <String>{ response ->
            text.text = line;
        },
        Response.ErrorListener { text.text = "Did not worked correctly"  })

        queue.add(stringRequest)
    }
}