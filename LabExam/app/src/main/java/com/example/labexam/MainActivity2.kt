package com.example.labexam

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun AddtoCart(view : View){
        val quantity = findViewById<EditText>(R.id.quantity).text.toString()
        val price = findViewById<TextView>(R.id.price)
        val extraTopping = findViewById<CheckBox>(R.id.extraToppings)
        val extraSauce = findViewById<CheckBox>(R.id.extraSauce)
        val doubleCrust = findViewById<CheckBox>(R.id.doubleCrust)
        var totalprice = 8 * Integer.parseInt(quantity)

        if (extraTopping.isChecked){
            totalprice += 4
        }

        if (extraSauce.isChecked){
            totalprice += 4
        }

        if (doubleCrust.isChecked){
            totalprice += 4
        }


        price.text = "Price : $" + totalprice.toString()

        val text = findViewById<TextView>(R.id.textView).text.toString()

        val myprefs : SharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE)
        val editor = myprefs.edit()
        editor.putString("Pizza Name", text)
        editor.putInt("Total Price Pizza", totalprice)
        editor.apply()
    }
}