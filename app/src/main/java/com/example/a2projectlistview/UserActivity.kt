package com.example.a2projectlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class UserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        // get data from previous Activity
        val name = intent.getStringExtra("name")
        val phone = intent.getStringExtra("phone")
        val imageId = intent.getIntExtra("imageId", R.drawable.profile)


        // define the varaible activity
        val nameTv = findViewById<TextView>(R.id.nameTextV)
        val phoneTv = findViewById<TextView>(R.id.phoneTextV)
        val image = findViewById<CircleImageView>(R.id.profile_image)

        // set the data
        nameTv.text = name
        phoneTv.text = phone
        image.setImageResource(imageId)
    }
}