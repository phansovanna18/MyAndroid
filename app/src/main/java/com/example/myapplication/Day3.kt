package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_day3.*
import java.util.*

class Day3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_day3)
    }

    fun ang(view:View)
    {
        var yob = dob.text.toString().toInt()
        var get = Calendar.getInstance().get(Calendar.YEAR)
        var age = get-yob
        textview.text = "age = $age"
    }
}
