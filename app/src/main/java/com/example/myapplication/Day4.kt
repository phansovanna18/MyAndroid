package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_day4.*

class Day4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_day4)
    }

    fun click(view: View)
    {
        when(view.id)
        {
            R.id.btn1 -> Toast.makeText(this,"Button1",Toast.LENGTH_SHORT).show()
            R.id.btn2 -> Toast.makeText(this,"Button2",Toast.LENGTH_SHORT).show()
        }

    }
}
