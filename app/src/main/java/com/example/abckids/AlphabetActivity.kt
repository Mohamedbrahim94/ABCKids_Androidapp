package com.example.abckids

import android.media.MediaPlayer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_alphabet.*

class AlphabetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alphabet)

        var name = intent.getStringExtra("name")?.toLowerCase()
        Toast.makeText(applicationContext,name,Toast.LENGTH_SHORT).show()

        var id = resources.getIdentifier(name,"drawable",packageName)
        imageView.setImageResource(id)

        var media = resources.getIdentifier(name,"raw",packageName)
        var mediaPlayer = MediaPlayer.create(applicationContext, media)
        mediaPlayer.start()



    }
}