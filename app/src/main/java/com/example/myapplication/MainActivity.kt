package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
//import android.support.v4.app.INotificationSideChannel._Parcel
import android.widget.CheckBox
//import android.widget.Switch
import android.widget.Toast
import android.widget.ToggleButton
//import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SwitchCompat
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
import com.google.android.material.slider.RangeSlider
import com.google.android.material.slider.Slider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//Checkbox
        val checkBox = findViewById<CheckBox>(R.id.checkbox)
        checkBox.setOnCheckedChangeListener{_ , isChecked->
            if (isChecked)
            Toast.makeText(this,"2024-yilda malaka oshirgan",Toast.LENGTH_SHORT).show()
            else
            Toast.makeText(this,"Malaka oshirmagan",Toast.LENGTH_SHORT).show()
        }
        //Togglebutton
        val tglbtn = findViewById<ToggleButton>(R.id.togglebtn)
        tglbtn.setOnCheckedChangeListener{_ , isChecked->
            if (isChecked) {
                tglbtn.setBackgroundColor(Color.parseColor("#4B00B2"))
                Toast.makeText(this, "Togglebutton is on", Toast.LENGTH_SHORT).show()
            }
            else {

                tglbtn.setBackgroundColor(Color.parseColor("#6495ED"))
                Toast.makeText(this, "Togglebutton is off", Toast.LENGTH_SHORT).show()
            }
        }
        //Switcher
        val swicher = findViewById<SwitchCompat>(R.id.switcher)
        swicher.setOnCheckedChangeListener{_ , isChecked->
            if (isChecked) {
                swicher.setBackgroundColor(Color.parseColor("#4B00B2"))
                Toast.makeText(this, "Swicher is on", Toast.LENGTH_SHORT).show()
            }
            else {

               swicher.setBackgroundColor(Color.parseColor("#6495ED"))
                Toast.makeText(this, "Swicher is off", Toast.LENGTH_SHORT).show()
            }
        }
        //Slider
            val slider = findViewById<Slider>(R.id.slider)
            slider.addOnChangeListener{_, value,_->
            Toast.makeText(this, "Slider value changed to ${value}",Toast.LENGTH_SHORT).show()
            }
        //Slider
        val rslider = findViewById<RangeSlider>(R.id.rangeslider)
            rslider.addOnChangeListener{s , _, _->
            Toast.makeText(this, "Slider value changed from ${s.values[0].toInt()} to ${s.values[1].toInt()} and ${s.values[2].toInt()}",Toast.LENGTH_SHORT).show()
        }
        }
    }

