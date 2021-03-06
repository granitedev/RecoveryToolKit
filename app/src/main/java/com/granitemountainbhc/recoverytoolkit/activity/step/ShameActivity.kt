package com.granitemountainbhc.recoverytoolkit.activity.step

import android.content.res.Resources
import android.os.Bundle
import android.support.design.widget.CollapsingToolbarLayout
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.Toast
import butterknife.BindView
import butterknife.ButterKnife


import com.granitemountainbhc.recoverytoolkit.R
import com.granitemountainbhc.recoverytoolkit.adapter.step.CiwaStepperAdapter
import com.granitemountainbhc.recoverytoolkit.adapter.step.ShameStepperAdapter
import com.stepstone.stepper.StepperLayout
import com.stepstone.stepper.VerificationError

class ShameActivity : AppCompatActivity(), StepperLayout.StepperListener {

    companion object {
        private const val CURRENT_STEP_POSITION_KEY = "position"
    }


    @BindView(R.id.stepperLayout)
    lateinit var stepperLayout: StepperLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.MyMaterialTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_styled_progress_bar)

        ButterKnife.bind(this)
        val startingStepPosition = savedInstanceState?.getInt(ShameActivity.CURRENT_STEP_POSITION_KEY) ?: 0
        stepperLayout.setAdapter(ShameStepperAdapter(supportFragmentManager, this), startingStepPosition)

        stepperLayout.setListener(this)
    }
    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(ShameActivity.CURRENT_STEP_POSITION_KEY, stepperLayout.currentStepPosition)
        super.onSaveInstanceState(outState)
    }

    override fun onBackPressed() {
        val currentStepPosition = stepperLayout.currentStepPosition
        if (currentStepPosition > 0) {
            stepperLayout.onBackClicked()
        } else {
            finish()
        }
    }

    override fun onCompleted(completeButton: View) {
        Toast.makeText(this, "Hope this helped!", Toast.LENGTH_SHORT).show()
        finish()
    }

    override fun onError(verificationError: VerificationError) {
        Toast.makeText(this, "" + verificationError.errorMessage, Toast.LENGTH_SHORT).show()
    }

    override fun onStepSelected(newStepPosition: Int) {

    }

    override fun onReturn() {
        finish()
    }
}