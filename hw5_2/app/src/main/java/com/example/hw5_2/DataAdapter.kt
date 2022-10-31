package com.example.hw5_2


import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.hw5_2.databinding.ItemDataBinding

class DataAdapter(private val dataList:ArrayList<data>):RecyclerView.Adapter<DataAdapter.DataViewHolder>() {

    inner class DataViewHolder(val viewBinding:ItemDataBinding):RecyclerView.ViewHolder(viewBinding.root)
    {
        fun bind(data:data){
            viewBinding.tvTitle.text=data.title
            viewBinding.tvDesc.text=data.desc
            viewBinding.tvTitle.setOnClickListener{
                dataList.remove(dataList[1])
                notifyDataSetChanged()
            }
        }
    }




    interface MyItemClickListener{
        fun onClick(position: Int)
    }

    private lateinit var mItemClickListener : MyItemClickListener

    fun setMyItemClickListener(itemClickListener : MyItemClickListener){
        mItemClickListener = itemClickListener
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val viewBinding:ItemDataBinding = ItemDataBinding.inflate(LayoutInflater.from(parent.context),parent,false)
               return DataViewHolder(viewBinding)
    }


    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(dataList[position])
    }

    override fun getItemCount(): Int = dataList.size


    fun add(data: data) {
        this.dataList.apply {
            dataList.add(data("sad", "dd"))
            dataList.add(data("sad", "dd"))
            dataList.add(data("sad", "dd"))
            notifyDataSetChanged()
        }
    }

    // (4) setItemClickListener로 설정한 함수 실행


}