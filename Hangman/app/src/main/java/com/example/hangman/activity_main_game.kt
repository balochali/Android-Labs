package com.example.hangman

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.util.*

class mainGame : AppCompatActivity() {
    var words: ArrayList<String>? = null
    var GuessWord = ""
    var under_score_string = StringBuilder("")
    var won = false
    var guessleft = 0
    var images = intArrayOf(
        R.drawable.one,
        R.drawable.two,
        R.drawable.three,
        R.drawable.four,
        R.drawable.five,
        R.drawable.six,
        R.drawable.seven
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_game)
        val guess = findViewById<TextView>(R.id.guess)
        try {
            readWords()
            val max = words!!.size
            val min = 1
            val random = Random()
            val index = random.nextInt(max - min) + min
            var counter = 0
            for (w in words!!) {
                if (counter == index) {
                    GuessWord = w
                }
                counter++
            }
            for (character in GuessWord.toCharArray()) {
                under_score_string.append("_")
            }
            guess.text = under_score_string
            Log.d(TAG, "Guess Word: $GuessWord")
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    fun keyPressed(view: View) {
        val left = findViewById<TextView>(R.id.left)
        val btn = view as Button
        val img = findViewById<ImageView>(R.id.imageView)
        val lab = findViewById<TextView>(R.id.label)
        if (guessleft < 6 && won == false) {
            if (GuessWord.contains(btn.text)) {
                btn.setBackgroundColor(Color.alpha(300))
                val guess = findViewById<TextView>(R.id.guess)
                var counterIndex = 0
                for (character in GuessWord.toCharArray()) {
                    if (btn.text[0] == character) {
                        under_score_string.setCharAt(counterIndex, character)
                    }
                    counterIndex++
                }
                guess.text = under_score_string
                Log.d(
                    TAG,
                    "under_score_string: $under_score_string GuessWord : $GuessWord"
                )
                if (under_score_string.toString()
                        .trim { it <= ' ' } == GuessWord.trim { it <= ' ' }
                ) {
                    lab.text = "Yeah You son of ***** ,you Won!"
                    won = true
                }
            } else {
                guessleft++
                btn.visibility = View.INVISIBLE
                img.setImageResource(images[guessleft])
            }
            left.text = "Guess Left: " + (7 - guessleft)
        } else {
            if (!won) {
                left.text = "Guess Left: " + 0
                lab.text = "Ahh! Loss"
            }
        }
    }

    @Throws(IOException::class)
    fun readWords() {
        val inputStream = assets.open("words.txt")
        val bufferedReader = BufferedReader(InputStreamReader(inputStream))
        var word: String? = null
        words = ArrayList()
        while (bufferedReader.readLine().also { word = it } != null) {
            val word_clear = word!!.trim { it <= ' ' }
            words!!.add(word_clear)
        }
    }

    companion object {
        private const val TAG = "MESSAGE "
    }
}