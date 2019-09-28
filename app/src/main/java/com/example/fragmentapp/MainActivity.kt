package com.example.fragmentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fm = supportFragmentManager
        val fragment_DEMO = Fragment_DEMO()

        add_BT.setOnClickListener {
            fm.beginTransaction().replace(R.id.container_frag, fragment_DEMO, "numberGenerator").addToBackStack(null).commit()
        }

        rm_BT.setOnClickListener{
            fm.beginTransaction().remove(fragment_DEMO).commit()
        }
    }
}
