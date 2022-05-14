package com.example.lab2task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    var check : Boolean = true

    fun onEat(view : View){
        val image : ImageView = findViewById(R.id.imageView)
        val textView : TextView = findViewById(R.id.textView)
        val button : Button = findViewById(R.id.button)
        if (check){
            image.setImageResource(R.drawable.ful)
            textView.text = "I'm full !"
            button.text = "full"

            check = false
        }
        else{
            image.setImageResource(R.drawable.hungry)
            textView.text = "I'm hungary !!"
            button.text = "eat"
            check = true
        }



    }
}