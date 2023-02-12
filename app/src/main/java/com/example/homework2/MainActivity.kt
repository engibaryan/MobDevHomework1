package com.example.homework2


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val textResult = findViewById<TextView>(R.id.textResult)
        val editNum = findViewById<EditText>(R.id.editNum)



        button.setOnClickListener{
            val msg: String = editNum.text.toString()

            //check if the EditText is 0, have values or not and does not start with 0

            if(msg.equals("0")) {
                textResult.text = "Result: Zero";
            }
            else if(msg.trim().isEmpty() || msg.get(0) == '0') {
                Toast.makeText(applicationContext, "Check your input! ", Toast.LENGTH_SHORT).show()
            }
            else{
                textResult.text = "Result:" + numberToWords(editNum.text.toString().toInt());

            }

        }


    }

}