package com.rumdien113.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rumdien113.listview.databinding.ActivityAdvanceListviewBinding

class AdvanceListviewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAdvanceListviewBinding
    private lateinit var lstStudent:ArrayList<Student>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdvanceListviewBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        lstStudent = ArrayList()
        lstStudent.add(Student(1,"Lê Thị Đẹp"))
        lstStudent.add(Student(2,"Nguyễn Văn Mệt"))
        lstStudent.add(Student(3,"Tran Văn Lâu"))

        val studentApdater = StudentApdater(this, lstStudent)
        binding.lvStudentNew.adapter = studentApdater
    }
}
