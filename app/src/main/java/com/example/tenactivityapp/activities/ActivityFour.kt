package com.example.tenactivityapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tenactivityapp.R
import kotlinx.android.synthetic.main.activity_four.*

class ActivityFour : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four)
        button_to_five.setOnClickListener{
            startActivity(Intent(this, ActivityFive::class.java))
        }
    }
}
