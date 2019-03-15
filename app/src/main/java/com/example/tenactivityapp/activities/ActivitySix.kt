package com.example.tenactivityapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tenactivityapp.R
import com.example.tenactivityapp.fragments.FragmentSix

class ActivitySix : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_six)
        addFragment()
    }

    private fun addFragment() {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.fragment_six, FragmentSix()).commit()
    }
}
