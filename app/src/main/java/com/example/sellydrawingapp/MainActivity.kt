package com.example.sellydrawingapp

import android.graphics.Color
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.example.sellydrawingapp.DrawingView.Companion.brushColour
import com.example.sellydrawingapp.DrawingView.Companion.colourList
import com.example.sellydrawingapp.DrawingView.Companion.pathList
import kotlin.io.path.Path

class MainActivity : AppCompatActivity() {
    companion object {
        var path = android.graphics.Path()
        var brush = Paint()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

         val redbtn = findViewById<ImageButton>(R.id.btnRed)
        val yellowbtn= findViewById<ImageButton>(R.id.btnYellow)
        val greenbtn= findViewById<ImageButton>(R.id.btnGreen)
        val blackbtn= findViewById<ImageButton>(R.id.btnBlack)
        val eraserbtn= findViewById<ImageButton>(R.id.btnEraser)

        redbtn.setOnClickListener{
          Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show()
            brush.color= Color.RED
            currentColor(brush.color)
        }

        yellowbtn.setOnClickListener{
            Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show()
            brush.color= Color.YELLOW
            currentColor(brush.color)
        }

        greenbtn.setOnClickListener{
            Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show()
            brush.color= Color.GREEN
            currentColor(brush.color)
        }

        blackbtn.setOnClickListener{
            Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show()
            brush.color= Color.BLACK
            currentColor(brush.color)
        }

        eraserbtn.setOnClickListener{
            Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show()
            pathList.clear()
            colourList.clear()
            path.reset()
        }


    }

    private fun currentColor(color: Int){
        brushColour = color
        path = android.graphics.Path()
    }
}