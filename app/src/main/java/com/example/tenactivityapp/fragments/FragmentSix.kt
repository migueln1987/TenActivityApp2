package com.example.tenactivityapp.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.tenactivityapp.R
import com.example.tenactivityapp.activities.ActivitySeven
import kotlinx.android.synthetic.main.fragment__button_six.view.*

class FragmentSix : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view : View = inflater.inflate(R.layout.fragment__button_six, container, false)
        view.button_to_seven.setOnClickListener{
            startActivity(Intent(activity ,ActivitySeven::class.java))
        }
        return view
    }
}