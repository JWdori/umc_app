package com.example.pj3

import android.app.appsearch.AppSearchManager
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pj3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
             supportFragmentManager.beginTransaction().replace(viewBinding.framFragment.id,FirstFragment()).commitAllowingStateLoss()

        viewBinding.btnFragment1.setOnClickListener{
            supportFragmentManager
                .beginTransaction()
                .replace(viewBinding.framFragment.id,FirstFragment())
                .commitAllowingStateLoss()
        }
        viewBinding.btnFragment2.setOnClickListener{
            supportFragmentManager
                .beginTransaction()
                .replace(viewBinding.framFragment.id,SecondFragment())
                .commitAllowingStateLoss()
        }

        }
    }
