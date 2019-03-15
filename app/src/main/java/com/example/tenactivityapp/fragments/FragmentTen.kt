package com.example.tenactivityapp.fragments

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat
import androidx.fragment.app.Fragment
import com.example.tenactivityapp.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_button_ten.view.*

class FragmentTen : Fragment(){

    val CHANNEL_ID = "halfway"
    val TAG = "FragmentTen"
    val GROUP = "TenActivityApp"
    lateinit var builder :NotificationCompat.Builder


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d(TAG, "onCreateView")
        val view : View = inflater.inflate(R.layout.fragment_button_ten, container, false)
        builder = notificationStuff()
        val notificationManager: NotificationManager =
            activity!!.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            notificationManager.createNotificationChannel(createNotificationChannel())
        }
        notificationManager.notify(1, builder.build())
        view.button_back_to_one.setOnClickListener {
            Snackbar.make(view, "Olay (get it 'ole' hahaha)", Snackbar.LENGTH_SHORT).show();
        }
        return view
    }

    fun notificationStuff (): NotificationCompat.Builder {

        return NotificationCompat.Builder(activity!!, CHANNEL_ID)
            .setSmallIcon(R.drawable.ic_stat_drawing)
            .setContentTitle("The End Notification")
            .setContentText("You have reached the end")
            .setGroup(GROUP)
            .setPriority(NotificationCompat.PRIORITY_MAX)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun createNotificationChannel() : NotificationChannel {
        val name = getString(R.string.channel_name)
        val descriptionText = getString(R.string.channel_description)
        val importance = NotificationManager.IMPORTANCE_HIGH
        return NotificationChannel(CHANNEL_ID, name, importance).apply {
            description = descriptionText
        }
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        Log.d(TAG, "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(TAG, "onActivityCreated")
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

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "onDetach")
    }
}