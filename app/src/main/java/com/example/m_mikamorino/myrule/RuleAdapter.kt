package com.example.m_mikamorino.myrule

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

/**
 * Created by m-mikamorino on 2018-03-14.
 */

class RuleAdapter(var context: Context, var items: ArrayList<RuleName>) : BaseAdapter() {
    val inflater: LayoutInflater

    init {
        inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var v = convertView
        var holder: CustomViewHolder? = null

        v?.let {
            holder = it.tag as CustomViewHolder?
        } ?: run {
            v = inflater.inflate(R.layout.list, null)
            holder = CustomViewHolder(v?.findViewById<TextView>(R.id.text) as TextView)
            v?.tag = holder
        }

        holder?.let {
            it.textView.text = items.get(position).name
        }

        return v as View
    }

    override fun getItem(position: Int): Any {
        return items[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return items.size
    }

    class CustomViewHolder(var textView: TextView)
}
