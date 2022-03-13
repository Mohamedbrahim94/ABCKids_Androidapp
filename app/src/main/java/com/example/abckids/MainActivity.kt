package com.example.abckids

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)
        // getSupportActionBar()?.setIcon(R.drawable.vector)

//        supportActionBar?.hide()
//        val handler = Handler()
//        Handler().postDelayed({
//            val intent =Intent(this@HomeActivity, HomeActivity::class.java)
//            startActivity(intent)
//        },2000)
        setContentView(R.layout.activity_main)

        var alpha = Array<String>(26) { "" }
        var j = 65
        for (i in 0..25) {
            alpha[i] = Character.toString(j.toChar())
            j++
        }
        var adapter = ArrayAdapter<String>(
            applicationContext,
            android.R.layout.simple_dropdown_item_1line,
            alpha
        )
        gridview.adapter = adapter

        gridview.setOnItemClickListener { adapterView, view, i, id ->


            var intent = Intent(applicationContext, AlphabetActivity::class.java)
            intent.putExtra("name", alpha[i])
            startActivity(intent)
        }


    }
}
