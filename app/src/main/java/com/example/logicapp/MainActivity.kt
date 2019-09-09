package com.example.logicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        confirm_btn.setOnClickListener {
            if (allInputCorrect()) {
                Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, getString(R.string.incorrect), Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun allInputCorrect():Boolean {
        val t = "T"
        val f = "F"

        // if all values are correct
        return tt_input.text.toString() == t && tf_input.text.toString() == f &&
            ft_input.text.toString() == f && ff_input.text.toString() == f
    }
}
