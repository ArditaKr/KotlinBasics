package com.example.kotlinbasics

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText

class MainActivity : AppCompatActivity() {

    private lateinit var name: TextView
    private lateinit var nameEdt: AppCompatEditText
    private lateinit var addBtn: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        onClick()
    }

    private fun initView() {
        name = findViewById(R.id.nameTxt)
        nameEdt = findViewById(R.id.nameEdt)
        addBtn = findViewById(R.id.addBtn)
    }

    private fun onClick() {
        addBtn.setOnClickListener {
            val input = nameEdt.text.toString()
            if (input.isNotEmpty()) {
                name.text = input
            }
        }
    }
}