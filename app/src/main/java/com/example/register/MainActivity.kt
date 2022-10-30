package com.example.register

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_click=findViewById(R.id.myButton) as Button
        val myName= findViewById<TextInputEditText>(R.id.first_name)
        val mySurename=findViewById<TextInputEditText>(R.id.first_surename)
        val myMail=findViewById<TextInputEditText>(R.id.first_email)
        val myPassword=findViewById<TextInputEditText>(R.id.first_password)
        var name= myName.text.toString()
        var surename=mySurename.text.toString()
        var mail= myMail.text.toString()
        var password=myPassword.text.toString()


        btn_click.setOnClickListener {

            if(name ==""){
                Toast.makeText(this@MainActivity,"მიუთითეთ სახელი",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this@MainActivity,"kargia",Toast.LENGTH_SHORT).show()
            }



        }

    }
}







