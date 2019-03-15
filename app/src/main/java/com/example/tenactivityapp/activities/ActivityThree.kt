package com.example.tenactivityapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tenactivityapp.R
import kotlinx.android.synthetic.main.activity_three.*

class ActivityThree : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)
        button_to_four.setOnClickListener{
            startActivity(Intent(this, ActivityFour::class.java))
        }
    }
}
