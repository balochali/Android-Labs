package com.example.lab2task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onStart() {
        super.onStart()
        println("calledOn Start")
    }

    override fun onResume() {
        super.onResume()
        Log.d("called", "On Resume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("called", "On Pause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("called", "On Stop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("called", "On Restart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("called", "On Destroy")
    }
}