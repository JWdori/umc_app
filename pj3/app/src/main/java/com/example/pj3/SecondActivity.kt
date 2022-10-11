package com.example.pj3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pj3.databinding.ActivityMainBinding
import com.example.pj3.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        val extars = intent.extras
        val data = extars!!["text"] as String

        viewBinding.tvSecondText.text = data

    }
}