package com.example.tenactivityapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.tenactivityapp.R
import kotlinx.android.synthetic.main.activity_five.*

class ActivityFive : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_five)
        Toast.makeText(this, "You're halfway there", Toast.LENGTH_SHORT).show()
        button_to_six.setOnClickListener{
            startActivity(Intent(this, ActivitySix::class.java))
        }
    }
}
