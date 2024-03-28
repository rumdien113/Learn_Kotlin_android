package com.rumdien113.listview

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.rumdien113.listview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var lsStudent:ArrayList<String>
    private lateinit var studentAdappter:ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        lsStudent = ArrayList()

        lsStudent.add("Nguyễn Lê Tiến Đảk")
        lsStudent.add("Android Studio")
        lsStudent.add("Kotlin")

        studentAdappter = ArrayAdapter(this, android.R.layout.simple_list_item_1, lsStudent)

        binding.lvStudent.adapter = studentAdappter

        binding.btnAdd.setOnClickListener {
            val fullname = binding.edtName.text.toString()
            if (TextUtils.isEmpty(fullname)) {
                Toast.makeText(this, "Vui lòng nhập tên", Toast.LENGTH_SHORT).show()
            } else {
                lsStudent.add(fullname)
                studentAdappter.notifyDataSetChanged()
                binding.edtName.setText("")
            }
        }

        var pos = 0

        binding.lvStudent.setOnItemClickListener { _, _, position, _ ->
            binding.edtName.setText(lsStudent[position])
            pos = position
        }

        binding.btnUpdate.setOnClickListener {
            val fullname = lsStudent.set(pos, binding.edtName.text.toString())
            if (TextUtils.isEmpty(fullname)) {
                Toast.makeText(this, "Vui lòng nhập tên", Toast.LENGTH_SHORT).show()
            } else {
                lsStudent[pos] = binding.edtName.text.toString()
                studentAdappter.notifyDataSetChanged()
                binding.edtName.setText("")
            }
        }

        binding.lvStudent.setOnItemLongClickListener { _, _, position, _ ->
            val alertDialog = AlertDialog.Builder(this)
            alertDialog.setTitle("Xác nhận xóa")
            alertDialog.setMessage("Bạn có chắc chắn muốn xóa không?")
            alertDialog.setPositiveButton("Có") { _, _ ->
                lsStudent.removeAt(position)
                studentAdappter.notifyDataSetChanged()
                binding.edtName.setText("")
            }
            alertDialog.setNegativeButton("Không") { _, _ -> }

            alertDialog.create().show()
            true
        }

        binding.btnAdvanceListView.setOnClickListener {
            val myIntent = Intent(this,AdvanceListviewActivity::class.java)
            startActivity(myIntent)
        }
    }


}