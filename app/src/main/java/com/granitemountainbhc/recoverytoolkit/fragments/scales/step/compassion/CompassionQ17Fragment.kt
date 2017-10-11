package com.granitemountainbhc.recoverytoolkit.fragments.scales.step.compassion

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.support.annotation.LayoutRes
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

import com.granitemountainbhc.recoverytoolkit.R
import com.granitemountainbhc.recoverytoolkit.adapter.step.OnNavigationBarListener
import com.stepstone.stepper.BlockingStep
import com.stepstone.stepper.StepperLayout
import com.stepstone.stepper.VerificationError


class CompassionQ17Fragment : Fragment(), BlockingStep {

    companion object {


        private const val LAYOUT_RESOURCE_ID_ARG_KEY = "messageResourceId"

        fun newInstance(@LayoutRes layoutResId: Int): CompassionQ17Fragment {
            val args = Bundle()
            args.putInt(LAYOUT_RESOURCE_ID_ARG_KEY, layoutResId)
            val fragment = CompassionQ17Fragment()
            fragment.arguments = args
            return fragment
        }
    }

    private var onNavigationBarListener: OnNavigationBarListener? = null

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context is OnNavigationBarListener) {
            onNavigationBarListener = context
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        //initialize your UI

        return inflater!!.inflate(R.layout.fragment_compassion_q17, container, false)
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
        Toast.makeText(this.getContext(), "It\'s all good. You can come back!", Toast.LENGTH_SHORT).show()
        callback.goToPrevStep()

    }

    val layoutResId: Int
        get() = arguments.getInt(LAYOUT_RESOURCE_ID_ARG_KEY)

    override fun verifyStep(): VerificationError? {
        return null
    }

    override fun onSelected() {

    }

    override fun onError(error: VerificationError) {
    }

}
