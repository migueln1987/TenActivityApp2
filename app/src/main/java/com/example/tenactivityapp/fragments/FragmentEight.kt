package com.example.tenactivityapp.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.tenactivityapp.R
import com.example.tenactivityapp.activities.ActivityNine
import kotlinx.android.synthetic.main.fragment_button_eight.view.*

class FragmentEight : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view : View = inflater.inflate(R.layout.fragment_button_eight, container, false)
        view.button_to_nine.setOnClickListener {
            startActivity(Intent(activity, ActivityNine::class.java))
        }
        return view
    }
}