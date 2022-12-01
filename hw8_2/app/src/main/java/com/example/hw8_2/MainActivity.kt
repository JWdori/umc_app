package com.example.hw8_2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hw8_2.databinding.ActivityMainBinding

data class BusinessCard(val contents:String, var isSwitched: Boolean = false)
var a = 1
class MainActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        val dataList: ArrayList<data> = arrayListOf()
        val adapter = DataAdapter(dataList)

        viewBinding.rvData.adapter = adapter
        viewBinding.rvData.layoutManager = LinearLayoutManager(this)
        viewBinding.btnMain.setOnClickListener {
            var intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
            a = 2
            b=1
        }
        viewBinding.btnFav.setOnClickListener {
            var intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }

        if (a == 1) {
            dataList.apply {
                clear()
                add(data("23", "여긴 안넣음"))
                add(data("232", "여긴 안넣음"))
            }
        } else {
            dataList.apply {
                clear()
                add(data("23", "여긴 안넣음"))
                add(data("232", "여긴 안넣음"))
                add(data("bbb", "여긴 안넣음"))
            }

        }


    }


    //class MainActivity : AppCompatActivity() {
//    private lateinit var binding: ActivityMainBinding
//    var content:String = ""
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        val view = binding.root
//        setContentView(view)
//        binding.btnMain.setOnClickListener{
//            var intent = Intent(this, SecondActivity::class.java)
//            intent.putExtra("data",binding.editMain.text.toString())
//            startActivity(intent)
//        }
//        Toast.makeText(this,"oncreate",Toast.LENGTH_SHORT).show()
//    }
//
//
//
//
    override fun onStop() {
        super.onStop()
        val dataList: ArrayList<data> = arrayListOf()
        dataList.apply {
            add(data("gd", "dd"))
            add(data("gd", "dd"))
            add(data("어쩔", "dd"))

        }

    }
}

//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        val roomDb = AppDatabase.getInstance(this)
//        if(roomDb != null){
//            val user = roomDb.userDao().selectByUserId(1)
//            Log.d("DB", "USER ID 1:$user")
//
//        }
//    }
//}