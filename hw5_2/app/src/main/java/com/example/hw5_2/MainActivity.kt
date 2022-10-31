package com.example.hw5_2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hw5_2.databinding.ActivityMainBinding

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


        println(a)
        viewBinding.rvData.adapter = adapter
        viewBinding.rvData.layoutManager = LinearLayoutManager(this)
        viewBinding.btnMain.setOnClickListener {
            var intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
            a = 2
        }
        if (a == 1) {
            dataList.apply {
                clear()
                add(data("111", "여긴 안넣음"))
                add(data("111", "여긴 안넣음"))
            }
        } else{
            dataList.apply {
                clear()
                add(data("111", "여긴 안넣음"))
                add(data("111", "여긴 안넣음"))
                add(data("hard..", "여긴 안넣음"))
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
//
//    override fun onResume() {
//        super.onResume()
//        Toast.makeText(this,"onResume",Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onPause() {
//        super.onPause()
//        Toast.makeText(this,"onPause",Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onStop() {
//        super.onStop()
//        Toast.makeText(this,"onStop",Toast.LENGTH_SHORT).show()
//        content = binding.editMain.text.toString()
//
//    }
//
//    fun toast(message:String){
//        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onRestart() {
//        super.onRestart()
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        Toast.makeText(this,"onDestory",Toast.LENGTH_SHORT).show()
//    }
}

