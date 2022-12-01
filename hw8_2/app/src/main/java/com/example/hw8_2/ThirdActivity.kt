package com.example.hw8_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hw8_2.databinding.ActivityThirdBinding

var b = 2
class ThirdActivity : AppCompatActivity() {
        private lateinit var viewBinding: ActivityThirdBinding

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            viewBinding = ActivityThirdBinding.inflate(layoutInflater)
            setContentView(viewBinding.root)

            val dataList: ArrayList<data> = arrayListOf()
            val adapter = DataAdapter(dataList)
            viewBinding.btnBack.setOnClickListener {
                finish()
            }
            viewBinding.rvData.adapter = adapter
            viewBinding.rvData.layoutManager = LinearLayoutManager(this)
            if (b == 1) {
                dataList.apply {
                    clear()
                    add(data("bbb", "여긴 안넣음"))
                }
            } else {
                dataList.apply {

                }

            }


        }
}