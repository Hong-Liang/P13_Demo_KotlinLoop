package com.myapplicationdev.android.p13_demo_kotlinloop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCount
        btnLetter
        etWord

        btnCount.setOnClickListener {
            for (i in 1..5) {
                Log.d("MainActivity:", i.toString())
            }
        }

        btnLetter.setOnClickListener {
            val letter = etWord.text.toString()
            for (i in letter) {
                Log.d("MainActivity:", i.toString())
            }
        }
    }
}
