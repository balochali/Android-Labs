package com.example.guessinggame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    val random = Random()
    var numtoGuess = random.nextInt(1000)

    fun TryAgain(view : View){
        numtoGuess = random.nextInt(1000)
    }
    fun onGuess(view : View){
        var textview = findViewById<TextView>(R.id.textView2)
        var text = findViewById<EditText>(R.id.editTextNumber)
        val num = Integer.parseInt(text.text.toString())

        if (numtoGuess > num)
            textview.text = "You guess is too low"
        else if (numtoGuess < num)
            textview.text = "Your guess is to high"
        else
            textview.text = "Yes! You guessed it right :)"



    }
}