package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_task.*
import org.w3c.dom.Text

class task : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task)
    }

    fun onclick(view: View)
    {
        when(view.id)
        {
            R.id.btnSubmit ->
            {
                var a = Intent(this,task1::class.java)
                a.putExtra("user",txtUser.text.toString())
                a.putExtra("password",txtPassword.text.toString())
                startActivity(a)
            }
            R.id.btnReset ->
            {
                txtUser.text.clear()
                txtPassword.text.clear()
            }
        }
    }
}
