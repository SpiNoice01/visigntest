package com.example.visign

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sosButton = findViewById<MaterialButton>(R.id.sos_button)
        sosButton.setOnClickListener {
            showSosDialog()
        }

        findViewById<View>(R.id.tombolplay).setOnClickListener {
            val intent = Intent(this, PlayActivity::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.tomboltranslate).setOnClickListener {
            val intent = Intent(this, TranslateActivity::class.java)
            startActivity(intent)
        }
    }

    // Function to show SOS Dialog
    private fun showSosDialog() {
        // Create the dialog
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Apakah Anda Dalam Masalah?")
        builder.setMessage("Perbuatan ini akan mengabari seluruh user aplikasi untuk membantu terhadap masalah yang anda hadapi.")

        // "YA" button
        builder.setPositiveButton("YA") { dialog, _ ->
            // Logic for when "YA" is clicked
            dialog.dismiss() // Close the dialog
        }

        // "TIDAK" button
        builder.setNegativeButton("TIDAK") { dialog, _ ->
            // Logic for when "TIDAK" is clicked
            dialog.dismiss() // Close the dialog
        }

        // Show the dialog
        val dialog = builder.create()
        dialog.show()
    }
}
