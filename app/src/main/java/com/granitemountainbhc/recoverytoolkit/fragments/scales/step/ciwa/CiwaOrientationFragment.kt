package com.granitemountainbhc.recoverytoolkit.fragments.scales.step.ciwa

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.support.annotation.LayoutRes
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import butterknife.ButterKnife

import com.granitemountainbhc.recoverytoolkit.R
import com.granitemountainbhc.recoverytoolkit.adapter.step.OnNavigationBarListener
import com.granitemountainbhc.recoverytoolkit.fragments.scales.step.cows.PulseFragment
import com.stepstone.stepper.BlockingStep
import com.stepstone.stepper.StepperLayout
import com.stepstone.stepper.VerificationError

class CiwaOrientationFragment : Fragment(), BlockingStep {

    companion object {

        private const val RADIO_KEY = "answer"

        private const val LAYOUT_RESOURCE_ID_ARG_KEY = "messageResourceId"

        fun newInstance(@LayoutRes layoutResId: Int): CiwaOrientationFragment {
            val args = Bundle()
            args.putInt(LAYOUT_RESOURCE_ID_ARG_KEY, layoutResId)
            val fragment = CiwaOrientationFragment()
            fragment.arguments = args
            return fragment
        }
    }

    private var RadioGroup = -1

    private var onNavigationBarListener: OnNavigationBarListener? = null

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context is OnNavigationBarListener) {
            onNavigationBarListener = context
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        //initialize your UI

        return inflater!!.inflate(R.layout.fragment_ciwa_orientation, container, false)
    }
    @Suppress("DEPRECATION")
    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val rg10 = view!!.findViewById<View>(R.id.ciwaOrientaionGroup) as RadioGroup
        rg10.setOnCheckedChangeListener { _, checkedId ->
            val context = context
            val thisButton = getView()!!.findViewById<View>(checkedId) as RadioButton
            val toast = Toast.makeText(context, thisButton.text, Toast.LENGTH_SHORT)
            toast.show()
            if (savedInstanceState != null) {
                RadioGroup = savedInstanceState.getInt(CiwaOrientationFragment.RADIO_KEY)
                ButterKnife.bind(this, view)

            }
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
    val layoutResId: Int
        get() = arguments.getInt(CiwaOrientationFragment.LAYOUT_RESOURCE_ID_ARG_KEY)

    override fun verifyStep(): VerificationError? {
        val rg10 = view!!.findViewById<View>(R.id.ciwaOrientaionGroup) as RadioGroup
        return if (rg10.getCheckedRadioButtonId() == -1) VerificationError("Please select an answer!") else null
    }


    override fun onSelected() {

    }
    override fun onError(error: VerificationError) {
    }
    override fun onSaveInstanceState(outState: Bundle?) {
        outState!!.putInt(CiwaOrientationFragment.RADIO_KEY, RadioGroup)
        super.onSaveInstanceState(outState)

    }
}
