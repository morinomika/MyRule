package com.example.m_mikamorino.myrule

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//
//        val ss:String = intent.getStringExtra("data")
//
//        val listView = findViewById<ListView>(R.id.listView)
//        listView.adapter = RuleAdapter(this)
//
////        val input_name = name_editText.text
//
//        button.setOnClickListener(object: View.OnClickListener {
//            override fun onClick(view: View): Unit {
//                // Handler code here.
//                val intent = Intent(this@MainActivity, MakeActivity::class.java);
//                startActivity(intent);
//            }
//        })


    }

//    private class RuleAdapter(context: Context) : BaseAdapter() {
//        private val mContext: Context
//        private val names = arrayListOf<String>(
//                "Donald"
//        )
//
//        init {
//            mContext = context
//        }
//
//        // rows
//        override fun getCount(): Int {
//            return names.size
//        }
//
//        override fun getItemId(position: Int): Long {
//            return position.toLong()
//        }
//
//        override fun getItem(p0: Int): Any {
//            return ("TEST STRING") //To change body of created functions use File | Settings | File Templates.
//        }
//
//        // responsible for rendering out each row
//        override fun getView(position: Int, convertView: View?, viewGroup: ViewGroup?): View {
//            val layoutInflator = LayoutInflater.from(mContext)
//            val rowMain = layoutInflator.inflate(R.layout.list, viewGroup, false)
//
//            val positionTextView = rowMain.findViewById<TextView>(R.id.name_textView)
//            positionTextView.text = "Row number: $position"
//            return rowMain
//
////            val textView = TextView(mContext)
////            textView.text = "Here is my Row for listview"
////            return textView
//        }
//
//    }

}
