package com.mahmoudsalah.counterappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
 var counter = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
  var textView = findViewById<TextView>(R.id.textView)
textView.setText(counter.toString())

    }

    fun add(view: View) {
        counter++
        textView.setText(counter.toString())
    }
    fun rest(view: View) {
        counter=0
        textView.setText(counter.toString())
    }
}
