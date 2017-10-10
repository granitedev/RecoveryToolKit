package com.granitemountainbhc.recoverytoolkit.fragments.scales.step.cows


import android.os.Bundle
import android.support.v4.app.Fragment
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

import butterknife.ButterKnife

import com.granitemountainbhc.recoverytoolkit.R
import com.stepstone.stepper.BlockingStep
import com.stepstone.stepper.StepperLayout
import com.stepstone.stepper.VerificationError



class YawningFragment : Fragment(), BlockingStep {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        //initialize your UI

        return inflater!!.inflate(R.layout.fragment_cows_yawning, container, false)
    }
    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val rg9 = view!!.findViewById<View>(R.id.yawningGroup) as RadioGroup
        rg9.setOnCheckedChangeListener { _, checkedId ->
            val context = context
            val thisButton = getView()!!.findViewById<View>(checkedId) as RadioButton
            val toast = Toast.makeText(context, thisButton.text, Toast.LENGTH_SHORT)
            toast.show()
            ButterKnife.bind(this, view)
        }
    }
    override fun onNextClicked(callback: StepperLayout.OnNextClickedCallback) {
        Handler().postDelayed({
            //you can do anythings you want
            callback.goToNextStep()
        }, 0L)// delay open another fragment,
    }

    override fun onCompleteClicked(callback: StepperLayout.OnCompleteClickedCallback) {

    }
    override fun onBackClicked(callback: StepperLayout.OnBackClickedCallback) {
        Toast.makeText(this.getContext(), "You went back a step", Toast.LENGTH_SHORT).show()
        callback.goToPrevStep()

    }
    override fun verifyStep(): VerificationError? {
        val rg9 = view!!.findViewById<View>(R.id.yawningGroup) as RadioGroup
        return if (rg9.getCheckedRadioButtonId() == -1) VerificationError("Please select an answer!") else null
    }

    override fun onSelected() {

    }
    override fun onError(error: VerificationError) {
    }
}