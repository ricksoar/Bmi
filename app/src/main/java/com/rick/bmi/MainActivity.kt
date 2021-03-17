package com.rick.bmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.rick.bmi.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import android.util.Log

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        //  setContentView(R.layout.activity_main)
        setContentView(binding.root)

    }

    //AUTO FORMAT 自動排版的快捷鍵為CTRL+ALT+L
    fun bmi(view: View) {
        val weight = ed_weight.text.toString().toFloat()
        val height = ed_height.text.toString().toFloat()
        val bmi = weight / (height * height)
        Log.d("BMI",bmi.toString())
        //lb_bmi.text=bmi.toString()
    }
}