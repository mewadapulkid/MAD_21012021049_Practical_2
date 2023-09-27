package com.pulkid.mad_21012021049_practical_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
class MainActivity : AppCompatActivity() {
    val TAG="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayMessage("OnCreate")
    }
    override fun onStart() {
        super.onStart()
        displayMessage("OnStart")
    }
    override fun onResume() {
        super.onResume()
        displayMessage("OnResume")
    }
    override fun onPause() {
        super.onPause()
        displayMessage("OnPause")
    }
    override fun onStop() {
        super.onStop()
        displayMessage("OnStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        displayMessage("OnDestroy")
    }
    fun displayMessage(msg:String){
        Toast.makeText(this, "$msg" + " is called", Toast.LENGTH_LONG).show()
        Log.i(TAG, "this is a $msg")
        Snackbar.make(
            findViewById(R.id.pulkid),
            R.string.email_sent,
            Snackbar.LENGTH_LONG
        ).show()
    }
}
