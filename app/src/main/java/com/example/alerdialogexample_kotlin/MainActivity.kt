package com.example.alerdialogexample_kotlin

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// Set a click listener for button widget

          button.setOnClickListener {
            val builder = AlertDialog.Builder(this@MainActivity)
            // Set the alert dialog title
            builder.setTitle("App background color")

            // Display a message on alert dialog
            builder.setMessage("Are you want to set the app background color to RED?")

            // Set a positive button and its click listener on alert dialog
            builder.setPositiveButton("YES") { dialog, which ->
                // Do something when user press the positive button
                Toast.makeText(
                    applicationContext,
                    "we change the app background.",
                    Toast.LENGTH_SHORT
                ).show()
                // Change the app background color
                root_layout.setBackgroundColor(Color.RED)
            }

              builder.setNegativeButton("No"){dialog,which ->
                  Toast.makeText(applicationContext,"You are not agree.",Toast.LENGTH_SHORT).show()
              }
              // Display a neutral button on alert dialog
              builder.setNeutralButton("Cancel"){_,_ ->
                  Toast.makeText(applicationContext,"You cancelled the dialog.",Toast.LENGTH_SHORT).show()
              }

              // Finally, make the alert dialog using builder
               val dialog: AlertDialog = builder.create()

              // Display the alert dialog on app interface
              dialog.show()

        }
    }}
