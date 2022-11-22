package com.example.hw8_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val roomDb = AppDatabase.getInstance(this)
        if(roomDb != null){
            val user = roomDb.userDao().selectByUserId(1)
            Log.d("DB", "USER ID 1:$user")

        }
    }
}