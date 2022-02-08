package com.example.rsincara

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val view = findViewById<TextView>(R.id.textView)
        val name = findViewById<TextView>(R.id.name)
        view.text = "Мой текст"
        val me = Student("Ермаков Максим Сергеевич", 3)
        name.text = me.fullName.toString()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

class Student(_fullName: String, _courseNumber: Int) {
    val fullName = _fullName;
    val courseNumber = _courseNumber;

    override fun toString(): String {
        return fullName
    }
}