package com.example.tenactivityapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.core.app.NotificationCompat
import com.example.tenactivityapp.R
import kotlinx.android.synthetic.main.activity_five.*

class ActivityFive : AppCompatActivity() {

    val CHANNEL_ID = "halfway"
    val TAG = "ActivityFive"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_five)
        Log.d(TAG, "onCreate")
        Toast.makeText(this, "You're halfway there", Toast.LENGTH_SHORT).show()
        button_to_six.setOnClickListener{
            startActivity(Intent(this, ActivitySix::class.java))
        }
    }

    fun notificationStuff () {

        var builder = NotificationCompat.Builder(this, CHANNEL_ID)
            .setSmallIcon(R.drawable.notification_template_icon_bg)
            .setContentTitle("Halfway Notification")
            .setContentText("You're halfway there")
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
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
