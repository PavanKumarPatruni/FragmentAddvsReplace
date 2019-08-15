package com.pavankumarpatruni.fragmentaddvsreplace.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.pavankumarpatruni.fragmentaddvsreplace.R
import com.pavankumarpatruni.fragmentaddvsreplace.fragments.*
import kotlinx.android.synthetic.main.activity.*
import kotlinx.android.synthetic.main.activity_main.toolbar

class AddFragmentActivity : AppCompatActivity() {

    private var fragmentTransaction: FragmentTransaction? = null
    private var count = 0
    private var fragmentManager: FragmentManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity)
        setSupportActionBar(toolbar)

        fragmentManager = supportFragmentManager
        fragmentTransaction = fragmentManager?.beginTransaction()
        fragmentTransaction?.add(R.id.fragmentContainer, DefaultFragment(), "fragments")
        fragmentTransaction?.commit()

        fab.setOnClickListener {

            fragmentTransaction = fragmentManager?.beginTransaction()
            count++

            when (count) {
                1 -> fragmentTransaction?.add(R.id.fragmentContainer, OneFragment(), "fragments")
                2 -> fragmentTransaction?.add(R.id.fragmentContainer, TwoFragment(), "fragments")
                3 -> fragmentTransaction?.add(R.id.fragmentContainer, ThreeFragment(), "fragments")
                4 -> fragmentTransaction?.add(R.id.fragmentContainer, FourFragment(), "fragments")
                else -> {

                }
            }
            fragmentTransaction?.commit()
        }
    }

    override fun onBackPressed() {
        val fragment = fragmentManager?.findFragmentById(R.id.fragmentContainer)
        if (fragment != null) {
            fragmentTransaction = fragmentManager?.beginTransaction()
            fragmentTransaction?.remove(fragment)
            fragmentTransaction?.commit()
        } else {
            super.onBackPressed()
        }
    }

}
