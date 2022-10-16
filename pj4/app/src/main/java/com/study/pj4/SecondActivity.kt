package com.study.pj4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.pj4.databinding.ActivityMainBinding
import com.study.pj4.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.txtSecond.text=intent.getStringExtra("data")


    }
}