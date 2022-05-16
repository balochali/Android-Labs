package com.example.stopwatch

import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    var txt: TextView? = null

    //Thread thread;
    var handler: Handler? = null
    var thread: Thread? = null
    var sec = 0
    var mints = 0
    var check = false
    var hours = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txt = findViewById(R.id.textView2)
        handler = Handler()
    }

    fun onStart1(view: View?) {
        call(true)
    }

    fun call(`val`: Boolean) {
        thread = Thread {
            while (true) {
                if (sec == 60) {
                    mints++
                    sec = 0
                }
                if (mints == 60) {
                    hours++
                    mints = 0
                }
                try {
                    Thread.sleep(1000)
                } catch (ex: Exception) {
                    ex.printStackTrace()
                }
                txt!!.text = "$hours : $mints : $sec"
                sec++
            }
        }
        if (`val`) {
            thread!!.start()
        } else {
            try {
                thread!!.isInterrupted
                thread!!.stop()
            } catch (ex: Exception) {
                ex.printStackTrace()
            }
        }
    }

    fun onStop1(view: View?) {
        call(false)
    }

    fun onRestart1(view: View?) {
        mints = 0
        sec = 0
        hours = 0
    }
}