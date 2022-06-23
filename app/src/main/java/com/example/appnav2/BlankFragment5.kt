package com.example.appnav2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class BlankFragment5 : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val btn2 = inflater.inflate(R.layout.fragment_5, container, false)

        btn2.findViewById<Button>(R.id.button_7).setOnClickListener {
            Navigation.findNavController(btn2)
                .navigate(R.id.action_blankFragment5_to_blankFragment6)

        }
        return btn2
    }


    }
