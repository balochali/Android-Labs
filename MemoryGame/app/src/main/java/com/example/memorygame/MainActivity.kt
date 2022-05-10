package com.example.memorygame

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var check = ""
    var img1: ImageView? = null
    var img2: ImageView? = null
    var img3: ImageView? = null
    var img4: ImageView? = null
    var img5: ImageView? = null
    var img6: ImageView? = null
    var img7: ImageView? = null
    var img: ImageView? = null
    var img9: ImageView? = null
    var img10: ImageView? = null
    var img11: ImageView? = null
    var img12: ImageView? = null
    var img13: ImageView? = null
    var img14: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun A(view: View?) {
        if (check === "") {
            img1 = findViewById(R.id.imageView2)
            img1!!.setImageResource(R.drawable.a)
            check = "a"
        } else if (check == "a") {
            img1 = findViewById(R.id.imageView2)
            img1!!.setImageResource(R.drawable.a)
            img1!!.setEnabled(false)
            img13!!.isEnabled = false
        } else {
            img1 = findViewById(R.id.imageView2)
            img1!!.setImageResource(R.drawable.question1)
        }
    }

    fun A1(view: View?) = if (check === "") {
        img13 = findViewById(R.id.imageView13)
        img13!!.setImageResource(R.drawable.a)
        check = "a"
    } else if (check == "a") {
        img13 = findViewById(R.id.imageView13)
        img13!!.setImageResource(R.drawable.a)
        img1!!.isEnabled = false
        img13!!.setEnabled(false)
    } else {
        img13 = findViewById(R.id.imageView13)
        img13!!.setImageResource(R.drawable.question1)
    }
}