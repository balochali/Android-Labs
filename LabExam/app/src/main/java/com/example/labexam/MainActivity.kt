package com.example.labexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun OnClick (view : View){

        val intent : Intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }

    fun onClickCart (view : View){
        val intent : Intent = Intent(this, MainActivity3::class.java)
        startActivity(intent)
    }
}