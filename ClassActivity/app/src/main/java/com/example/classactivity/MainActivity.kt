package com.example.classactivity

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.app.NotificationCompat
import java.nio.channels.Channel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun generateNotification (view : View){
        val ChannelID : String = "Test"
        val ChannelName : String = "Android"

        //1 - Create Notification Manager's Object
        val manager : NotificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager

        //2 - Building of Notification
        val builder : NotificationCompat.Builder = NotificationCompat.Builder(this, ChannelID)
            .setSmallIcon(R.drawable.iconnotification)
            .setContentTitle("TestNotification")
            .setContentText("This is just a test Notification")

        val notification : Notification = builder.build()

        //3 - Create a Notification Channel
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            val notificationChannel : NotificationChannel =
                NotificationChannel(ChannelID, ChannelName,
                    NotificationManager.IMPORTANCE_DEFAULT)

            manager.createNotificationChannel(notificationChannel)
        }

    }
}