package com.example.contactlist

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class CustomArrayAdapter(context: Context, resource: Int, objects: Array<out User>) :
    ArrayAdapter<User>(context, resource, objects) {

    val ref = context
    val row = resource
    val data = objects

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = convertView

        if (view == null){
            view = LayoutInflater.from(context).inflate(row, parent, false)
        }

        val imageView : ImageView = view!!.findViewById(R.id.image)
        val nameText : TextView = view!!.findViewById(R.id.name)
        val emailText : TextView = view!!.findViewById(R.id.email)
        val mobileText : TextView = view!!.findViewById(R.id.mobile)

        imageView.setImageResource(data[position].img)
        nameText.text = data[position].name
        emailText.text = data[position].email
        mobileText.text = data[position].number

        return view!!
    }
}