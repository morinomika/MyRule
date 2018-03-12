package com.example.m_mikamorino.myrule

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun changePage (view: View){
        val intent = Intent(this, RuleActivity::class.java)
        startActivity(intent)
    }

}
