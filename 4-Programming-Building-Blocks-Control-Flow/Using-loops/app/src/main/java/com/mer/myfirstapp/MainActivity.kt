package com.mer.myfirstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttons = arrayOf(button1, button2, button3)

        for (i in buttons.indices) {
            buttons[i].setOnClickListener {
                pressedButton(i + 1);
            }
        }
    }

    private fun pressedButton(buttonNum:Int) {
        textView.text = "Pressed button $buttonNum"
    }
}
