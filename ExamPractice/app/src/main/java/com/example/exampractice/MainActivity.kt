package com.example.exampractice

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }


    fun play (v : View){
        var mediaPlayer = MediaPlayer.create(this, R.raw.pir)
        mediaPlayer.start()
    }
    fun stop (v : View){
        var mediaPlayer = MediaPlayer.create(this, R.raw.pir)
        mediaPlayer.stop()
    }
}