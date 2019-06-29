package com.example.myapplication

import android.app.DatePickerDialog
import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.DatePicker
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.activity_day3homework.*
import java.sql.Time
import java.text.SimpleDateFormat
import java.time.Year
import java.util.*
import java.util.concurrent.TimeUnit

class Day3homework : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_day3homework)
    }

    var myc = Calendar.getInstance()
    var thisADay = 0
    var thisAMonth = 0
    var thisAYear = 0

    fun click(view : View)
    {
        when(view.id)
        {
            R.id.pickdate ->
            {
                thisADay = myc.get(Calendar.DAY_OF_MONTH)
                thisAMonth = myc.get(Calendar.MONTH)
                thisAYear = myc.get(Calendar.YEAR)
                val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view2, thisYear, thisMonth, thisDay ->
                    // Display Selected date in textbox
                    thisAMonth = thisMonth + 1
                    thisADay = thisDay
                    thisAYear = thisYear

                    pickdate.setText("Date: " + thisAMonth + "/" + thisDay + "/" + thisYear)
                }, thisAYear, thisAMonth, thisADay)
                dpd.show()
            }
            R.id.calculate ->
            {
                var dob = Calendar.getInstance()
                dob.set(thisAYear,thisAMonth,thisADay)
                var age = myc.get(Calendar.YEAR) - dob.get(Calendar.YEAR)
                if (myc.get(Calendar.DAY_OF_YEAR) < dob.get(Calendar.DAY_OF_YEAR) && age > 0){
                    age--
                }
                var simpleDateFormat = SimpleDateFormat("dd/MM/yyyyy")
                var st = simpleDateFormat.format(Date())
                var date2 = simpleDateFormat.parse(st)
                var st2 = "$thisADay/$thisAMonth/$thisAYear"
                var date1 = simpleDateFormat.parse(st2)
                var diff = date2.time - date1.time
                output.text = "Day ${TimeUnit.MILLISECONDS.toDays(diff)}"
                outputMonth.text = "Year $age"
            }
        }
    }
}

