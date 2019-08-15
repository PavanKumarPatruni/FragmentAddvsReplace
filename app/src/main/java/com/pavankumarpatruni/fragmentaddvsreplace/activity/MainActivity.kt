package com.pavankumarpatruni.fragmentaddvsreplace.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pavankumarpatruni.fragmentaddvsreplace.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        buttonAddFragment.setOnClickListener {
            val intent = Intent(this, AddFragmentActivity::class.java)
            startActivity(intent)
        }

        buttonReplaceFragment.setOnClickListener {
            val intent = Intent(this, ReplaceFragmentActivity::class.java)
            startActivity(intent)
        }

    }

}
