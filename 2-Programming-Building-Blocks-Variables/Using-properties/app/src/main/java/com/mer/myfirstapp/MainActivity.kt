package com.mer.myfirstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var prop = "Example"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myNum = 10
        myNum = 5

        var myName = "Mer"

        prop = "New Value"
    }
}
