package com.example.tenactivityapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.FragmentActivity
import com.example.tenactivityapp.R

class ActivityTen : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ten)
        Toast.makeText(this, "You've made it to the end", Toast.LENGTH_SHORT).show()
    }
}
