package com.granitemountainbhc.recoverytoolkit.fragments.scales.step.cows

import android.os.Bundle
import android.os.Handler
import android.support.annotation.UiThread
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.granitemountainbhc.recoverytoolkit.R
import com.stepstone.stepper.BlockingStep
import com.stepstone.stepper.StepperLayout
import com.stepstone.stepper.VerificationError


class CowsSummaryFragment : android.support.v4.app.Fragment(), BlockingStep {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        //initialize your UI

        return inflater!!.inflate(R.layout.fragment_cows_summary, container, false)
    }

    override fun onNextClicked(callback: StepperLayout.OnNextClickedCallback) {
        Handler().postDelayed(Runnable {
            //you can do anythings you want
            callback.goToNextStep()
        }, 0L)// delay open another fragment,
    }

    @UiThread
    override fun onCompleteClicked(callback: StepperLayout.OnCompleteClickedCallback) {
        Handler().postDelayed({ callback.complete() }, 1000L)
    }

    override fun onBackClicked(callback: StepperLayout.OnBackClickedCallback) {
        Toast.makeText(this.getContext(), "You went back a step", Toast.LENGTH_SHORT).show()
        callback.goToPrevStep()

    }
    override fun verifyStep(): VerificationError? {
        return null
    }

    override fun onSelected() {

    }
    override fun onError(error: VerificationError) {
    }
}
