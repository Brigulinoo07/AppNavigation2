package com.example.appnav2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class BlankFragment6 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val btn2 = inflater.inflate(R.layout.fragment_6, container, false)


        btn2.findViewById<Button>(R.id.button_8).setOnClickListener {
            Navigation.findNavController(btn2)
                .navigate(R.id.action_blankFragment6_to_blankFragment)}

        return btn2
    }
}
