package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_task1.*

class task1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task1)
        var user : String = intent.getStringExtra("user")
        var password : String = intent.getStringExtra("password")
//        Toast.makeText(this,user,Toast.LENGTH_SHORT).show()
        txtUser.text = user
        txtPassword.text = password
    }
}
