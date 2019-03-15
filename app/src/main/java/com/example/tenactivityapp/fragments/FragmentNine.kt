package com.example.tenactivityapp.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.tenactivityapp.R
import com.example.tenactivityapp.activities.ActivityTen
import kotlinx.android.synthetic.main.fragment_button_nine.view.*

class FragmentNine : Fragment(){
        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
            val view : View = inflater.inflate(R.layout.fragment_button_nine, container, false)
            view.button_to_ten.setOnClickListener {
                startActivity(Intent(activity, ActivityTen::class.java))
            }
            return view
        }

}