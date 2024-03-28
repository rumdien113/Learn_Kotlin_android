package com.rumdien113.listview

import android.annotation.SuppressLint
import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class StudentApdater(private var context:Activity, private var lstStudent: ArrayList<Student>) : BaseAdapter(){
    override fun getCount(): Int {
        return lstStudent.size
    }

    override fun getItem(position: Int): Any {
        return lstStudent[position]
    }

    override fun getItemId(position: Int): Long {
        return lstStudent[position].id.toLong()
    }

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val layoutInflater = context.layoutInflater
        val view = layoutInflater.inflate(R.layout.row_student,parent,false)
        val tvIdStudent = view.findViewById<TextView>(R.id.tvIdStudent)
        val tvNameStudent = view.findViewById<TextView>(R.id.tvNameStudent)
        tvIdStudent.text = lstStudent[position].id.toString()
        tvNameStudent.text = lstStudent[position].name
        return view
    }
}