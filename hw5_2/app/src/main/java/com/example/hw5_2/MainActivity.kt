package com.example.hw5_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.hw5_2.databinding.ActivityMainBinding

data class BusinessCard(val contents:String, var isSwitched: Boolean = false)

class MainActivity : AppCompatActivity() {

    var businessCardArrayList = ArrayList<BusinessCard>()
    private lateinit var customAdapter: CustomAdapter
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        businessCardArrayList.add(BusinessCard("륙",))

        binding.btnMain.setOnClickListener{
            var intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }


        customAdapter= CustomAdapter(this,businessCardArrayList)
        binding.listviewmain.adapter=customAdapter
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
//    override fun onStart() {
//        super.onStart()
//        Toast.makeText(this,"onStart",Toast.LENGTH_SHORT).show()
//    }
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
//        Toast.makeText(this,"onRestart",Toast.LENGTH_SHORT).show()
//        val builder = AlertDialog.Builder(this)
//        builder.setMessage("이어서 작성하시겠습니까?")
//        builder.setPositiveButton("넹",DialogInterface.OnClickListener{
//                dialog,id-> //
//        })
//        builder.setNegativeButton("놉",DialogInterface.OnClickListener{
//                dialog,id->
//            binding.editMain.setText("")
//        })
//        builder.show()
//        Log.e("dd",content)
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        Toast.makeText(this,"onDestory",Toast.LENGTH_SHORT).show()
//    }
//}