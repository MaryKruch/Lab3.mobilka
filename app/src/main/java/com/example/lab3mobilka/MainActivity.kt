package com.example.lab3mobilka

import RightTriangle
import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextCathetus1: EditText = findViewById(R.id.editTextCathetus1)
        val editTextCathetus2: EditText = findViewById(R.id.editTextCathetus2)
        val buttonCalculate: Button = findViewById(R.id.buttonCalculate)
        val textViewResult: TextView = findViewById(R.id.textViewResult)

        buttonCalculate.setOnClickListener {
            val cathetus1 = editTextCathetus1.text.toString().toDoubleOrNull()
            val cathetus2 = editTextCathetus2.text.toString().toDoubleOrNull()

            if (cathetus1 != null && cathetus2 != null) {
                val triangle = RightTriangle(cathetus1, cathetus2)
                val hypotenuse = triangle.calculateHypotenuse()
                textViewResult.text = "Гипотенуза: $hypotenuse"
            } else {
                textViewResult.text = "Некорректные значения катетов"
            }
        }
    }
}