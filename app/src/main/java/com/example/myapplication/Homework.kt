package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_homework.*

class Homework : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homework)
        btn_command.setOnClickListener()
        {
            click()
        }

    }
    var number_vowel: Int = 0
    var number_consonant: Int = 0
    var consonant : String = "Consonant:"
    var vowel : String = "Vowel:"

    fun click()
    {
        var string = txt_input.text.toString()
        check(string)
        num_vowel.text = "Vowel:" + number_vowel.toString()
        num_consonant.text = "Consonant:" + number_consonant.toString()
        txt_consonant.text = consonant
        txt_vowel.text = vowel
    }

    fun check(string: String)
    {
        for(i in string)
        {
            when(i)
            {
                'a','e','i','o','u' ->
                {
                    vowel += i
                    number_vowel ++
                }
                else ->
                {
                    consonant += i
                    number_consonant ++
                }

            }

        }
    }

}
