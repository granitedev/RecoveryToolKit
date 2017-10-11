package com.granitemountainbhc.recoverytoolkit.activity.step

import android.databinding.DataBindingUtil.setContentView
import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.compat.R.id.title
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import butterknife.BindView
import butterknife.ButterKnife
import com.granitemountainbhc.recoverytoolkit.R
import com.granitemountainbhc.recoverytoolkit.adapter.step.CowsStepperAdapter
import com.granitemountainbhc.recoverytoolkit.adapter.step.OnNavigationBarListener
import com.stepstone.stepper.StepperLayout
import com.stepstone.stepper.VerificationError


abstract class AbstractStepperActivity : AppCompatActivity(), StepperLayout.StepperListener, OnNavigationBarListener {

    companion object {
        private const val CURRENT_STEP_POSITION_KEY = "position"
    }

    @BindView(R.id.stepperLayout)
    lateinit var stepperLayout: StepperLayout

    @get:LayoutRes
    protected abstract val layoutResId: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Stepper sample"

        setContentView(layoutResId)

        ButterKnife.bind(this)
        val startingStepPosition = savedInstanceState?.getInt(CURRENT_STEP_POSITION_KEY) ?: 0
        stepperLayout.setAdapter(CowsStepperAdapter(supportFragmentManager, this), startingStepPosition)

        stepperLayout.setListener(this)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(CURRENT_STEP_POSITION_KEY, stepperLayout.currentStepPosition)
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
        Toast.makeText(this, "onCompleted!", Toast.LENGTH_SHORT).show()
    }

    override fun onError(verificationError: VerificationError) {
        Toast.makeText(this, "onError! -> " + verificationError.errorMessage, Toast.LENGTH_SHORT).show()
    }

    override fun onStepSelected(newStepPosition: Int) {
        Toast.makeText(this, "onStepSelected! -> " + newStepPosition, Toast.LENGTH_SHORT).show()
    }

    override fun onReturn() {
        finish()
    }

    override fun onChangeEndButtonsEnabled(enabled: Boolean) {
        stepperLayout.setNextButtonVerificationFailed(!enabled)
        stepperLayout.setCompleteButtonVerificationFailed(!enabled)
    }

}