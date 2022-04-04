package com.example.sharedpreferencespractice

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


    }

    fun onClick(v : View){

        var username = findViewById<EditText>(R.id.editTextTextPersonName);
        var password = findViewById<EditText>(R.id.editTextTextPassword);

        val prefs : SharedPreferences = getSharedPreferences("LoginDetails", MODE_PRIVATE);
        var editor = prefs.edit();
        editor.putString("Username", username.text.toString())
        editor.putString("Password", password.text.toString())
        editor.commit()
        var intent =   Intent(this, MainActivity::class.java)

        startActivity(intent)
    }
}