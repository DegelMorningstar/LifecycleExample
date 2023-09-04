package com.appyael.lifecycleexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.d("ON CREATE ------ ","SecondActivity: onCreate()")
        val button:Button = findViewById<Button>(R.id.button2)
        button.setOnClickListener {
            finish()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("onDestroy ------ ","SecondActivity: onDestroy()")
    }
}