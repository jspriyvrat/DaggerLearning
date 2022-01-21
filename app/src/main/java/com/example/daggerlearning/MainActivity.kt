package com.example.daggerlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject lateinit var txt:MyClass
    lateinit var myText:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myText=findViewById(R.id.dummy)
        DaggerMagicBox.create().poke(this)

        myText.text=txt.texts


    }
}