package com.example.hwapp02

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn = findViewById<Button>(R.id.button)
        var vi=findViewById<TextView>(R.id.textView)
        var vi2=findViewById<TextView>(R.id.textView2)


        btn.setOnClickListener{
            startActivityForResult(Intent(this,Main2Activity::class.java),1)
        }


    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        data?.extras?.let{
            var tv_menu=findViewById<TextView>(R.id.textView3)
            if(requestCode==1 && resultCode==Activity.RESULT_OK){
               tv_menu.text="飲料: ${it.getString("drink")}\n\n"+
                       "甜度: ${it.getString("sugar")}\n\n"+
                       "冰塊: ${it.getString("ice")}"

            }
        }
    }
}