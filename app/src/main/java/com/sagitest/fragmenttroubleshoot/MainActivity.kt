package com.sagitest.fragmenttroubleshoot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

//for ref: https://youtu.be/Q2HY58s9cHs

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnfrag1.setOnClickListener{replaceFrag(FragOne())}
        btnfrag2.setOnClickListener{replaceFrag(FragTwo())}
        btnfrag3.setOnClickListener{replaceFrag(FragThree())}
    }

    private fun replaceFrag(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction.replace(R.id.fragCont, fragment)
        fragmentTransaction.commit()
    }
}

