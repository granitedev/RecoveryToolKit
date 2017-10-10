package com.granitemountainbhc.recoverytoolkit.activity.step


import android.app.Activity
import android.content.Intent
import android.os.Bundle

import android.view.View
import android.widget.Button

import com.granitemountainbhc.recoverytoolkit.R




class WithdrawalScaleSelectActivity : Activity(), View.OnClickListener {


    lateinit var buttonCows: Button
    lateinit var buttonCiwa: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_withdrawal_scale_select)

        buttonCows = findViewById<View>(R.id.buttonCows) as Button
        buttonCiwa = findViewById<View>(R.id.buttonCiwa) as Button
        buttonCows.setOnClickListener(this)
        buttonCiwa.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.buttonCows -> {
                val intent1 = Intent(this, CowsWithdrawalsActivity::class.java)
                startActivity(intent1)
            }
            R.id.buttonCiwa -> {
                val intent2 = Intent(this, CiwaWithdrawalsActivity::class.java)
                startActivity(intent2)
            }
            else -> {
            }
        }

    }
}



