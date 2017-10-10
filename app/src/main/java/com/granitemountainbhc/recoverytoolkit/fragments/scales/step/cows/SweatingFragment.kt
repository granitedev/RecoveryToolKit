package com.granitemountainbhc.recoverytoolkit.fragments.scales.step.cows



import android.os.Bundle
import android.os.Handler
import android.support.v4.app.Fragment;
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

import butterknife.ButterKnife

import com.granitemountainbhc.recoverytoolkit.R
import com.stepstone.stepper.BlockingStep
import com.stepstone.stepper.VerificationError
import com.stepstone.stepper.StepperLayout


class SweatingFragment : Fragment(), BlockingStep {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        //initialize your UI

        return inflater!!.inflate(R.layout.fragment_cows_sweating, container, false)
    }
    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val rg2 = view!!.findViewById<View>(R.id.sweatingGroup) as RadioGroup
        rg2.setOnCheckedChangeListener { _, checkedId ->
            val context = context
            val thisButton = getView()!!.findViewById<View>(checkedId) as RadioButton
            val toast = Toast.makeText(context, thisButton.text, Toast.LENGTH_SHORT)
            toast.show()
            ButterKnife.bind(this, view)
        }
    }

    override fun onCompleteClicked(callback: StepperLayout.OnCompleteClickedCallback) {

    }

    override fun onNextClicked(callback: StepperLayout.OnNextClickedCallback) {
        Handler().postDelayed({
            //you can do anythings you want
            callback.goToNextStep()
        }, 0L)// delay open another fragment,
    }
    override fun onBackClicked(callback: StepperLayout.OnBackClickedCallback) {
        Toast.makeText(this.getContext(), "You went back a step", Toast.LENGTH_SHORT).show()
        callback.goToPrevStep()

    }
    override fun verifyStep(): VerificationError? {
        val rg2 = view!!.findViewById<View>(R.id.sweatingGroup) as RadioGroup
        return if (rg2.getCheckedRadioButtonId() == -1) VerificationError("Please select an answer!") else null
    }

    override fun onSelected() {

    }
    override fun onError(error: VerificationError) {
    }
}
