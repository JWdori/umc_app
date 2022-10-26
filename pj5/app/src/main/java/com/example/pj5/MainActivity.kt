package com.example.pj5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pj5.databinding.ActivityMainBinding
import com.example.pj5.databinding.ListviewItemBinding

data class BusinessCard(val name:String,val contents:String)

class MainActivity : AppCompatActivity() {

    var businessCardArrayList = ArrayList<BusinessCard>()
    private lateinit var customAdapter: CustomAdapter
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



        for (x in 0..30){
            businessCardArrayList.add(BusinessCard("륙","ㅎㅇ"))
            businessCardArrayList.add(BusinessCard("담","ㅎㅇ"))
            businessCardArrayList.add(BusinessCard("륙","ㅎㅇ"))
            businessCardArrayList.add(BusinessCard("담","ㅎㅇ"))
        }


        customAdapter= CustomAdapter(this,businessCardArrayList)
        binding.listviewmain.adapter=customAdapter
    }
}