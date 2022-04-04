package com.example.sharedpreferencespractice

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun onClick(view : View) {
        val prefs: SharedPreferences = getSharedPreferences("LoginDetails", MODE_PRIVATE)

        var username = prefs.getString("Username", "guest")
        var password = prefs.getString("Password", "guest")

        Toast.makeText(this, "Username : " + username + " Password : " + password, Toast.LENGTH_SHORT).show()

    }
}