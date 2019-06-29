package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_tic__tac__toe.*
import java.util.ArrayList

class Tic_Tac_Toe : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tic__tac__toe)
    }

    var i = 1
    lateinit var undo : Button
    var type : Array<Char> = arrayOf('x','o')
    var buttonID : Array<Int> = arrayOf(R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9)

    fun onClick(view: View)
    {
        var button = findViewById<Button>(view.id)
        if(button.text.toString() == "")
        {
            undo = findViewById(view.id)
            btnUndo.isEnabled = true
            if(i%2 == 1)
                button.text = "x"
            else
                button.text = "o"
            txt.text = "${type.get(i%2)} turn"
            check()
            i++
        }
        else if(button.text.toString() == "Reset")
        {
            for(x in buttonID)
            {
                var b = findViewById<Button>(x)
                b.text = ""
            }
            btnUndo.isEnabled = false
            isEnableButton(true)
            txt.text = "x turn"
            i = 1
        }
        else if(button.text.toString() == "Undo")
        {
            undo.text = ""
            txt.text = "${type.get(i%2)} turn"
            i--
            btnUndo.isEnabled = false
        }
    }

    private fun check()
    {
        for (x in type)
            if((btn1.text.toString() == x+"" && btn2.text.toString() == x+"" && btn3.text.toString() == x+"")||(btn4.text.toString() == x+"" && btn5.text.toString() == x+"" && btn6.text.toString() == x+"")||(btn7.text.toString() == x+"" && btn8.text.toString() == x+"" && btn9.text.toString() == x+"")||(btn1.text.toString() == x+"" && btn4.text.toString() == x+"" && btn7.text.toString() == x+"")||(btn2.text.toString() == x+"" && btn5.text.toString() == x+"" && btn8.text.toString() == x+"")||(btn3.text.toString() == x+"" && btn6.text.toString() == x+"" && btn9.text.toString() == x+"")||(btn1.text.toString() == x+"" && btn5.text.toString() == x+"" && btn9.text.toString() == x+"")||(btn3.text.toString() == x+"" && btn5.text.toString() == x+"" && btn7.text.toString() == x+""))
            {
                txt.text = "Player $x win"
                isEnableButton(false)
                btnUndo.isEnabled = false
            }
            else if(i == 9) txt.text ="Draw"
    }

    private fun isEnableButton(show : Boolean)
    {
        for(x in buttonID)
        {
            var b = findViewById<Button>(x)
            b.isEnabled = show
        }
    }
}
