package com.example.newevent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout


class MainActivity : AppCompatActivity() {
    var clickcount=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clickCountDisplayView = findViewById<TextView>(R.id.CickCountview)
       val clickMeButton = findViewById<TextView>(R.id.ClickButton)
        val userNameTextInputView=findViewById<TextInputLayout>(R.id.NameAttribute)

        val map: MutableMap<String?, Int?> = HashMap()


        clickMeButton.setOnClickListener {
        val userName=userNameTextInputView.editText?.text?.toString()
            val maskedUserName=
               if(userName.isNullOrEmpty())"somebody"
               else userName
            val value = if (map.containsKey(maskedUserName)) map[maskedUserName] else 0
                map[maskedUserName] = value!! + 1
            //var name=map.keys
            var valueN=map[maskedUserName]!!

            clickCountDisplayView.text = "$maskedUserName clicked $valueN"
          //  println("${map.keys} cilicked  ${map.values} times ")
        }
    }
}