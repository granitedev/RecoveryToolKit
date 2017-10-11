package com.granitemountainbhc.recoverytoolkit.adapter.step

import android.content.Context
import android.os.Bundle
import android.support.annotation.IntRange
import android.support.v4.app.FragmentManager
import com.granitemountainbhc.recoverytoolkit.R
import com.granitemountainbhc.recoverytoolkit.fragments.scales.step.drinkingLimits.LimitsIntroFragment
import com.granitemountainbhc.recoverytoolkit.fragments.scales.step.drinkingLimits.LimitsQuestion1Fragment
import com.granitemountainbhc.recoverytoolkit.fragments.scales.step.drinkingLimits.LimitsQuestion2Fragment
import com.granitemountainbhc.recoverytoolkit.fragments.scales.step.drinkingLimits.LimitsSummaryFragment
import com.stepstone.stepper.Step
import com.stepstone.stepper.adapter.AbstractFragmentStepAdapter
import com.stepstone.stepper.viewmodel.StepViewModel


class LimitsStepperAdapter(fm: FragmentManager, context: Context) : AbstractFragmentStepAdapter(fm, context) {


    override fun createStep(position: Int): Step? {
        when (position) {
            0 -> {
                val step1 = LimitsIntroFragment.newInstance(R.layout.fragment_limits_intro)
                val b1 = Bundle()
                b1.putInt(CURRENT_STEP_POSITION_KEY, position)
                step1.arguments = b1
                return step1
            }


            1 -> {
                val step2 = LimitsQuestion1Fragment.newInstance(R.layout.fragment_limits_question1)
                val b2 = Bundle()
                b2.putInt(CURRENT_STEP_POSITION_KEY, position)
                step2.arguments = b2
                return step2
            }

            2 -> {
                val step3 = LimitsQuestion2Fragment()
                val b3 = Bundle()
                b3.putInt(CURRENT_STEP_POSITION_KEY, position)
                step3.arguments = b3
                return step3
            }

            3 -> {
                val step4 = LimitsSummaryFragment()
                val b4 = Bundle()
                b4.putInt(CURRENT_STEP_POSITION_KEY, position)
                step4.arguments = b4
                return step4
            }

        }
        return null
    }

    override fun getCount(): Int {
        return 4
    }

    override fun getViewModel(@IntRange(from = 0) position: Int): StepViewModel {
        val builder = StepViewModel.Builder(context)
                .setTitle(R.string.tab_title)
        when (position) {
            0 -> builder
                    .setEndButtonLabel("This way")
                    .setBackButtonLabel("Cancel")
                    .setNextButtonEndDrawableResId(R.drawable.ic_arrow_forward_black_24dp)
                    .setBackButtonStartDrawableResId(StepViewModel.NULL_DRAWABLE)
            1 -> builder
                    .setEndButtonLabel("This way")
                    .setBackButtonLabel("Go back")
                    .setNextButtonEndDrawableResId(R.drawable.ic_arrow_forward_black_24dp)
                    .setBackButtonStartDrawableResId(R.drawable.ic_arrow_back_black_24dp)
            2 -> builder
                    .setEndButtonLabel(R.string.go_to_summary)
                    .setBackButtonLabel("Go Back")
                    .setBackButtonStartDrawableResId(R.drawable.ic_arrow_back_black_24dp)
            3 -> builder
                    .setBackButtonLabel("Go back")
                    .setEndButtonLabel("I'm done!")
            else -> throw IllegalArgumentException("Unsupported position: " + position)
        }
        return builder.create()
    }

    companion object {


        private val CURRENT_STEP_POSITION_KEY = "position"
    }

}