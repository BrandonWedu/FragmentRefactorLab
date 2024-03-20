package edu.temple.fragmentrefactor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerView, Greeting())
            .commit()

//        val displayTextView = findViewById<TextView>(R.id.displayTextView)
//        val nameEditText = findViewById<EditText>(R.id.nameEditText)
//        val changeButton = findViewById<Button>(R.id.changeButton)
//
//        changeButton.setOnClickListener {
//            val name = nameEditText.text
//
//            displayTextView.text = if (name.isNotBlank()) {
//                "Hello, $name!"
//            } else {
//                "Please enter your name"
//            }
//        }
    }
}