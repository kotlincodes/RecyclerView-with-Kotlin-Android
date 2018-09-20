package com.shrishtionline.recyclerviewwithkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: RecyclerViewAdapter
    var dataList:ArrayList<String> = ArrayList();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Initializing RecyclerView
        recyclerView=findViewById(R.id.recycler_view)


        adapter= RecyclerViewAdapter(this,dataList)

        //Set up recyclerview with Vertical LayoutManager and the adapter

        recyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recyclerView.adapter=adapter

        //Adding animal names
        addAnimals();

        // Notify the adapter for data change.
        adapter.notifyDataSetChanged()

    }

    private fun addAnimals() {
        dataList!!.add("Dog")
        dataList!!.add("Cat")
        dataList!!.add("Monkey")
        dataList!!.add("lion")
        dataList!!.add("Elephent")
        dataList!!.add("Cheetah")
        dataList!!.add("Snake")
        dataList!!.add("Cow")
        dataList!!.add("Ant")
        dataList!!.add("Tiger")
        dataList!!.add("Lizard")

    }
}
