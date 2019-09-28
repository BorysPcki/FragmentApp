package com.example.fragmentapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_demo.*
import kotlin.random.Random

class Fragment_DEMO : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_demo, container, false)
    }

    override fun onStart() {
        super.onStart()
        generate_BT.setOnClickListener {
            val randNumber = Random.nextInt(100)
            randomNumber_TV.text = randNumber.toString()
            randomNumber_TV.visibility = TextureView.VISIBLE
        }
    }
}