package com.example.tenactivityapp.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.tenactivityapp.R
import com.example.tenactivityapp.activities.MainActivity
import kotlinx.android.synthetic.main.fragment_button_ten.view.*

class FragmentTen : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view : View = inflater.inflate(R.layout.fragment_button_ten, container, false)
        view.button_back_to_one.setOnClickListener {
            startActivity(Intent(activity, MainActivity::class.java))
        }
        return view
    }
}