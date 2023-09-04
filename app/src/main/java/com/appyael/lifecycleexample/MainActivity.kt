package com.appyael.lifecycleexample

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    /**
     * onCreate
     * Se inicia el ciclo de vida, se crean las vistas y se ejecuta por primera vez
     * */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("ON CREATE ------ ","MainActivity: onCreate()")

        val button:Button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            launchSecondaryActivity()
        }

    }

    /**
     * onStart
     * Se inicia el activity
     * */
    override fun onStart() {
        super.onStart()
        Log.d("onStart ------ ", "MainActivity: onStart()")
    }

    /**
     * onResume
     * Se reanuda la ejecucion
     * */
    override fun onResume() {
        super.onResume()
        Log.d("onResume ------ ", "MainActivity: onResume()")
    }

    /**
     * onPause
     * Se detiene la ejecucion
     * */
    override fun onPause() {
        super.onPause()
        Log.d("onPause ------ ", "MainActivity: onPause()")
    }

    /**
     * onPause
     * Se detiene el acitivity para reiniciarse o destruirse
     * */
    override fun onStop() {
        super.onStop()
        Log.d("onStop ------ ", "MainActivity: onStop()")
    }

    /**
     * onRestart
     * Se reinicia el acitivity
     * */
    override fun onRestart() {
        super.onRestart()
        Log.d("onRestart ------ ", "MainActivity: onRestart()")
    }

    /**
     * onRestart
     * Se mata el activity
     * */
    override fun onDestroy() {
        super.onDestroy()
        Log.d("onDestroy ------ ", "MainActivity: onDestroy()")
    }

    private fun launchSecondaryActivity(){
        val intent:Intent = Intent(this,SecondActivity::class.java)
        startActivity(intent)
    }

}