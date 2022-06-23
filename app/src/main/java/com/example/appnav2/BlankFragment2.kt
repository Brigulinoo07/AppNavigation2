package com.example.appnav2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class BlankFragment2 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val btn2 = inflater.inflate(R.layout.fragment_2, container, false)

        btn2.findViewById<Button>(R.id.button_4).setOnClickListener {
            Navigation.findNavController(btn2).navigate(R.id.action_blankFragment2_to_blankFragment4)

        }
        return btn2
    }
}
