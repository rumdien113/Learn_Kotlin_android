package com.rumdien113.chapter7_intent

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.rumdien113.chapter7_intent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            val num1 = binding.editFirst.text.toString()
            val num2 = binding.editSecond.text.toString()

            val val1 = num1.toIntOrNull()
            val val2 = num2.toIntOrNull()

            if (val1 != null && val2 != null) {
                val sum = val1 + val2
                Toast.makeText(this, "$val1 + $val2 = $sum", Toast.LENGTH_SHORT).show()

                val i = Intent(this, Screen2::class.java)
                i.putExtra("add", "Result: $sum")
                startActivity(i)
            } else {
                Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }

        val note = intent.getStringExtra("note")
        binding.note.text = note
    }
}