package com.rumdien113.chapter7_intent

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rumdien113.chapter7_intent.databinding.ActivityScreen2Binding

class Screen2 : AppCompatActivity() {

    private lateinit var binding: ActivityScreen2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScreen2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent
        val add = i.getStringExtra("add")

        binding.result.text = add

        binding.btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("note", "Bạn đã thực hiện phép tính thành công")
            }
            startActivity(intent)
        }
    }
}