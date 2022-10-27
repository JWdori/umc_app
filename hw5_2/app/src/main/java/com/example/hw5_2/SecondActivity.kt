package com.example.hw5_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw5_2.databinding.ActivitySecondBinding


class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

//        binding.txtSecond.text=intent.getStringExtra("data")
        binding.btn2.setOnClickListener{
            var intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("data",binding.txtSecond.text.toString())
            startActivity(intent)
        }

    }
}