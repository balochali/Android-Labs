package com.example.contactlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

   val data : Array<User> = arrayOf(
       User(R.drawable.img1, "Ali", "ali@gmail.com", "0300123232323"),
       User(R.drawable.img2, "Imran Ali", "imranali@gmail.com", "0300454545454"),
       User(R.drawable.img1, "Hizbullah", "hizbullah@gmail.com", "030045343433"),
       User(R.drawable.img2, "Ghafoor", "ghafoor@gmail.com", "0300453322211"),
       User(R.drawable.img1, "Jabbar", "Jabbar@gmail.com", "0300453343434"),
       User(R.drawable.img2, "Sagar", "sagar@gmail.com", "030045333433"),
       User(R.drawable.img1, "Fayaz", "fayaz@gmail.com", "030045343433"),
       User(R.drawable.img2, "Sudheer", "sudheer@gmail.com", "03034522113"),
       User(R.drawable.img1, "Amjad", "amjad@gmail.com", "030045343433"),
       User(R.drawable.img2, "Tahir", "tahir@gmail.com", "030045111113"),
       User(R.drawable.img1, "Samad", "samad@gmail.com", "0300453442222"),
   )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView : ListView = findViewById(R.id.listview)
        val adapter : CustomArrayAdapter = CustomArrayAdapter(this, R.layout.customarrayadapter, data)
        listView.adapter = adapter

    }
}

data class User(val img : Int, val name : String, val email : String, val number : String)