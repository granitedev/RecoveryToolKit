package com.granitemountainbhc.recoverytoolkit.activity.step

import android.content.Intent
import android.os.Bundle

import android.support.v7.app.AppCompatActivity

import android.view.View
import android.widget.Toast
import com.granitemountainbhc.recoverytoolkit.R
import com.granitemountainbhc.recoverytoolkit.activity.MainActivity
import com.granitemountainbhc.recoverytoolkit.adapter.step.CowsStepperAdapter
import com.stepstone.stepper.StepperLayout
import com.stepstone.stepper.VerificationError


class CowsWithdrawalsActivity : AppCompatActivity(), StepperLayout.StepperListener {


    private var mStepperLayout: StepperLayout? = null
    private var mCowsStepperAdapter: CowsStepperAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.MyMaterialTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.stepper_layout)
        mStepperLayout = findViewById<View>(R.id.stepperLayout) as StepperLayout
        mCowsStepperAdapter = CowsStepperAdapter(supportFragmentManager, this)
        mStepperLayout!!.adapter = mCowsStepperAdapter!!
        mStepperLayout!!.setListener(this)
    }

    override fun onCompleted(completeButton: View) {
        Toast.makeText(this, "Hope this helped!", Toast.LENGTH_SHORT).show()
        finish()

    }

    override fun onError(verificationError: VerificationError) {
        Toast.makeText(this, "" + verificationError.errorMessage, Toast.LENGTH_SHORT).show()
    }

    override fun onStepSelected(newStepPosition: Int) {}

    override fun onReturn() {
        finish()
    }
}
