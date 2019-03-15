package com.example.tenactivityapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tenactivityapp.R
import kotlinx.android.synthetic.main.activity_two.*

class ActivityTwo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)
        button_to_three.setOnClickListener{
            startActivity(Intent(this, ActivityThree::class.java))
        }
    }
}
