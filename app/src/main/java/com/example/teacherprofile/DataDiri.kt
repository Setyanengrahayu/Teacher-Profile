package com.example.teacherprofile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class DataDiri : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_diri)

        val btn1 = findViewById<Button>(R.id.profil)
        val btn2 = findViewById<Button>(R.id.teach)


        btn1.setOnClickListener{
            val Intent = Intent(this, Profil::class.java)
            startActivity(Intent)
        }

        btn2.setOnClickListener{
            val Intent1 = Intent(this, Mengajar::class.java)
            startActivity(Intent1)
        }
    }
}