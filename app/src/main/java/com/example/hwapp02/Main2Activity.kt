package com.example.hwapp02

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class Main2Activity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var btn_send=findViewById<Button>(R.id.button2)
        var drink_name=findViewById<EditText>(R.id.editTextTextPersonName)
        var sugargroup=findViewById<RadioGroup>(R.id.radioGroup)
        var icegroup=findViewById<RadioGroup>(R.id.radioGroup2)
        btn_send.setOnClickListener{
            if(drink_name.length()<1)
                Toast.makeText(this,"請輸入飲料名稱", Toast.LENGTH_SHORT).show()
            else {
                val b = Bundle()
                b.putString("drink", drink_name.text.toString())
                b.putString("sugar", sugargroup.findViewById<RadioButton>(sugargroup.checkedRadioButtonId).text.toString())
                b.putString("ice", icegroup.findViewById<RadioButton>(icegroup.checkedRadioButtonId).text.toString())
                setResult(Activity.RESULT_OK, Intent().putExtras(b))
                finish()



            }
        }
    }

}