package com.rumdien113.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.rumdien113.calculator.databinding.ActivityMainBinding
import kotlin.reflect.typeOf

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAdd.setOnClickListener { calculator(1) }
        binding.btnSub.setOnClickListener { calculator(2) }
        binding.btnMul.setOnClickListener { calculator(3) }
        binding.btnDiv.setOnClickListener { calculator(4) }
    }

    private fun calculator(operation : Int) {
        val firstNum = binding.num1.text.toString()
        val secondNum = binding.num2.text.toString()

        if (firstNum.isEmpty() || secondNum.isEmpty()) {
            Toast.makeText(
                this,
                "Fill first and second number text area please",
                Toast.LENGTH_SHORT
            ).show()
            return
        }

        val firstNumber = firstNum.toIntOrNull()
        val secondNumber = secondNum.toIntOrNull()

        if (firstNumber != null && secondNumber != null) {
            val result = when(operation) {
                1 -> firstNumber + secondNumber
                2 -> firstNumber - secondNumber
                3 -> firstNumber * secondNumber
                4 -> if (secondNumber != 0) firstNumber / secondNumber else {
                    Toast.makeText(this, "You can not divide any number to zero", Toast.LENGTH_SHORT).show()
                    return
                }
                else -> 0
            }
            binding.resultText.text = result.toString()
        } else {
            Toast.makeText(this, "Please add only number", Toast.LENGTH_SHORT).show()
        }
    }
}