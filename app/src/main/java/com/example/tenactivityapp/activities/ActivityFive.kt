package com.example.tenactivityapp.activities

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.example.tenactivityapp.R
import kotlinx.android.synthetic.main.activity_five.*

class ActivityFive : AppCompatActivity() {

    val CHANNEL_ID = "halfway"
    val TAG = "ActivityFive"
    lateinit var builder :NotificationCompat.Builder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_five)
        Log.d(TAG, "onCreate")
        builder = notificationStuff()
        val notificationManager: NotificationManager =
            getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            notificationManager.createNotificationChannel(createNotificationChannel())
        }
        notificationManager.notify(1, builder.build())
    }

    fun notificationStuff (): NotificationCompat.Builder {

        return NotificationCompat.Builder(this, CHANNEL_ID)
            .setSmallIcon(R.drawable.notification_template_icon_bg)
            .setContentTitle("Halfway Notification")
            .setContentText("You're halfway there")
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun createNotificationChannel() : NotificationChannel {
            val name = getString(R.string.channel_name)
            val descriptionText = getString(R.string.channel_description)
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            return NotificationChannel(CHANNEL_ID, name, importance).apply {
                description = descriptionText
        }
    }


    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }

}
