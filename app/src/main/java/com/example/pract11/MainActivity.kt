package com.example.pract11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    var checked: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun OnClick_Button(view: View) {
        val image: ImageView = findViewById(R.id.imageView2)
        image.setImageResource(R.drawable.neapple)
    }

    fun OnClick_Button1 (view: View) {
        val imageButton: ImageView = findViewById(R.id.imageButton2)
        if (checked == false) {
            imageButton.setImageResource(R.drawable.on)
            checked = true

        } else {
            imageButton.setImageResource(R.drawable.krest)
            checked = false
        }
    }
}
