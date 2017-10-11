package com.granitemountainbhc.recoverytoolkit.adapter.step

import android.content.Context
import android.os.Bundle
import android.support.annotation.IntRange
import android.support.v4.app.FragmentManager
import com.granitemountainbhc.recoverytoolkit.R
import com.granitemountainbhc.recoverytoolkit.fragments.scales.step.shame.*

import com.stepstone.stepper.Step
import com.stepstone.stepper.adapter.AbstractFragmentStepAdapter
import com.stepstone.stepper.viewmodel.StepViewModel


class ShameStepperAdapter(fm: FragmentManager, context: Context) : AbstractFragmentStepAdapter(fm, context) {


    override fun createStep(position: Int): Step? {
        when (position) {
            0 -> {
                val step1 = ShameIntroFragment.newInstance(R.layout.fragment_shame_intro)
                val b1 = Bundle()
                b1.putInt(CURRENT_STEP_POSITION_KEY, position)
                step1.arguments = b1
                return step1
            }


            1 -> {
                val step2 = ShameQuestion1Fragment.newInstance(R.layout.fragment_shame_question1)
                val b2 = Bundle()
                b2.putInt(CURRENT_STEP_POSITION_KEY, position)
                step2.arguments = b2
                return step2
            }

            2 -> {
                val step3 = ShameQuestion2Fragment.newInstance(R.layout.fragment_shame_question2)
                val b3 = Bundle()
                b3.putInt(CURRENT_STEP_POSITION_KEY, position)
                step3.arguments = b3
                return step3
            }
            3 -> {
                val step4 = ShameQuestion3Fragment.newInstance(R.layout.fragment_shame_question3)
                val b4 = Bundle()
                b4.putInt(CURRENT_STEP_POSITION_KEY, position)
                step4.arguments = b4
                return step4
            }
            4 -> {
                val step5 = ShameQuestion4Fragment.newInstance(R.layout.fragment_shame_question4)
                val b5 = Bundle()
                b5.putInt(CURRENT_STEP_POSITION_KEY, position)
                step5.arguments = b5
                return step5
            }
            5 -> {
                val step6 = ShameQuestion5Fragment.newInstance(R.layout.fragment_shame_question5)
                val b6 = Bundle()
                b6.putInt(CURRENT_STEP_POSITION_KEY, position)
                step6.arguments = b6
                return step6
            }
            6 -> {
                val step7 = ShameQuestion6Fragment.newInstance(R.layout.fragment_shame_question6)
                val b7 = Bundle()
                b7.putInt(CURRENT_STEP_POSITION_KEY, position)
                step7.arguments = b7
                return step7
            }
            7 -> {
                val step8 = ShameQuestion7Fragment.newInstance(R.layout.fragment_shame_question7)
                val b8 = Bundle()
                b8.putInt(CURRENT_STEP_POSITION_KEY, position)
                step8.arguments = b8
                return step8
            }
            8 -> {
                val step9 = ShameQuestion8Fragment.newInstance(R.layout.fragment_shame_question8)
                val b9 = Bundle()
                b9.putInt(CURRENT_STEP_POSITION_KEY, position)
                step9.arguments = b9
                return step9
            }
            9 -> {
                val step10 = ShameQuestion9Fragment.newInstance(R.layout.fragment_shame_question9)
                val b10 = Bundle()
                b10.putInt(CURRENT_STEP_POSITION_KEY, position)
                step10.arguments = b10
                return step10
            }
            10 -> {
                val step11 = ShameQuestion10Fragment.newInstance(R.layout.fragment_shame_question10)
                val b11 = Bundle()
                b11.putInt(CURRENT_STEP_POSITION_KEY, position)
                step11.arguments = b11
                return step11
            }
            11 -> {
                val step12 = ShameQuestion11Fragment.newInstance(R.layout.fragment_shame_question11)
                val b12 = Bundle()
                b12.putInt(CURRENT_STEP_POSITION_KEY, position)
                step12.arguments = b12
                return step12
            }
            12 -> {
                val step13 = ShameQuestion12Fragment.newInstance(R.layout.fragment_shame_question12)
                val b13 = Bundle()
                b13.putInt(CURRENT_STEP_POSITION_KEY, position)
                step13.arguments = b13
                return step13
            }
            13 -> {
                val step14 = ShameQuestion13Fragment.newInstance(R.layout.fragment_shame_question13)
                val b14 = Bundle()
                b14.putInt(CURRENT_STEP_POSITION_KEY, position)
                step14.arguments = b14
                return step14
            }
            14 -> {
                val step15 = ShameQuestion14Fragment.newInstance(R.layout.fragment_shame_question14)
                val b15 = Bundle()
                b15.putInt(CURRENT_STEP_POSITION_KEY, position)
                step15.arguments = b15
                return step15
            }
            15 -> {
                val step16 = ShameQuestion15Fragment.newInstance(R.layout.fragment_shame_question15)
                val b16 = Bundle()
                b16.putInt(CURRENT_STEP_POSITION_KEY, position)
                step16.arguments = b16
                return step16
            }
            16 -> {
                val step17 = ShameQuestion16Fragment.newInstance(R.layout.fragment_shame_question16)
                val b17 = Bundle()
                b17.putInt(CURRENT_STEP_POSITION_KEY, position)
                step17.arguments = b17
                return step17
            }

            17 -> {
                val step18 = ShameSummaryFragment()
                val b18 = Bundle()
                b18.putInt(CURRENT_STEP_POSITION_KEY, position)
                step18.arguments = b18
                return step18
            }

        }
        return null
    }

    override fun getCount(): Int {
        return 18
    }

    override fun getViewModel(@IntRange(from = 0) position: Int): StepViewModel {
        val builder = StepViewModel.Builder(context)
                .setTitle(R.string.tab_title)
        when (position) {
            0 -> builder
                    .setEndButtonLabel("Start")
                    .setBackButtonLabel("Cancel")
                    .setNextButtonEndDrawableResId(R.drawable.ic_arrow_forward_black_24dp)
                    .setBackButtonStartDrawableResId(StepViewModel.NULL_DRAWABLE)
            1 -> builder
                    .setEndButtonLabel("This way")
                    .setBackButtonLabel("Go back")
                    .setNextButtonEndDrawableResId(R.drawable.ic_arrow_forward_black_24dp)
                    .setBackButtonStartDrawableResId(R.drawable.ic_arrow_back_black_24dp)
            2 -> builder
                    .setEndButtonLabel("This way")
                    .setBackButtonLabel("Go back")
                    .setNextButtonEndDrawableResId(R.drawable.ic_arrow_forward_black_24dp)
                    .setBackButtonStartDrawableResId(R.drawable.ic_arrow_back_black_24dp)
            3 -> builder
                    .setEndButtonLabel("This way")
                    .setBackButtonLabel("Go back")
                    .setNextButtonEndDrawableResId(R.drawable.ic_arrow_forward_black_24dp)
                    .setBackButtonStartDrawableResId(R.drawable.ic_arrow_back_black_24dp)
            4 -> builder
                    .setEndButtonLabel("This way")
                    .setBackButtonLabel("Go back")
                    .setNextButtonEndDrawableResId(R.drawable.ic_arrow_forward_black_24dp)
                    .setBackButtonStartDrawableResId(R.drawable.ic_arrow_back_black_24dp)
            5 -> builder
                    .setEndButtonLabel("This way")
                    .setBackButtonLabel("Go back")
                    .setNextButtonEndDrawableResId(R.drawable.ic_arrow_forward_black_24dp)
                    .setBackButtonStartDrawableResId(R.drawable.ic_arrow_back_black_24dp)
            6 -> builder
                    .setEndButtonLabel("This way")
                    .setBackButtonLabel("Go back")
                    .setNextButtonEndDrawableResId(R.drawable.ic_arrow_forward_black_24dp)
                    .setBackButtonStartDrawableResId(R.drawable.ic_arrow_back_black_24dp)
            7 -> builder
                    .setEndButtonLabel("This way")
                    .setBackButtonLabel("Go back")
                    .setNextButtonEndDrawableResId(R.drawable.ic_arrow_forward_black_24dp)
                    .setBackButtonStartDrawableResId(R.drawable.ic_arrow_back_black_24dp)
            8 -> builder
                    .setEndButtonLabel("This way")
                    .setBackButtonLabel("Go back")
                    .setNextButtonEndDrawableResId(R.drawable.ic_arrow_forward_black_24dp)
                    .setBackButtonStartDrawableResId(R.drawable.ic_arrow_back_black_24dp)
            9 -> builder
                    .setEndButtonLabel("This way")
                    .setBackButtonLabel("Go back")
                    .setNextButtonEndDrawableResId(R.drawable.ic_arrow_forward_black_24dp)
                    .setBackButtonStartDrawableResId(R.drawable.ic_arrow_back_black_24dp)
            10 -> builder
                    .setEndButtonLabel("This way")
                    .setBackButtonLabel("Go back")
                    .setNextButtonEndDrawableResId(R.drawable.ic_arrow_forward_black_24dp)
                    .setBackButtonStartDrawableResId(R.drawable.ic_arrow_back_black_24dp)
            11 -> builder
                    .setEndButtonLabel("This way")
                    .setBackButtonLabel("Go back")
                    .setNextButtonEndDrawableResId(R.drawable.ic_arrow_forward_black_24dp)
                    .setBackButtonStartDrawableResId(R.drawable.ic_arrow_back_black_24dp)
            12 -> builder
                    .setEndButtonLabel("This way")
                    .setBackButtonLabel("Go back")
                    .setNextButtonEndDrawableResId(R.drawable.ic_arrow_forward_black_24dp)
                    .setBackButtonStartDrawableResId(R.drawable.ic_arrow_back_black_24dp)
            13 -> builder
                    .setEndButtonLabel("This way")
                    .setBackButtonLabel("Go back")
                    .setNextButtonEndDrawableResId(R.drawable.ic_arrow_forward_black_24dp)
                    .setBackButtonStartDrawableResId(R.drawable.ic_arrow_back_black_24dp)
            14 -> builder
                    .setEndButtonLabel("This way")
                    .setBackButtonLabel("Go back")
                    .setNextButtonEndDrawableResId(R.drawable.ic_arrow_forward_black_24dp)
                    .setBackButtonStartDrawableResId(R.drawable.ic_arrow_back_black_24dp)
            15 -> builder
                    .setEndButtonLabel("This way")
                    .setBackButtonLabel("Go back")
                    .setNextButtonEndDrawableResId(R.drawable.ic_arrow_forward_black_24dp)
                    .setBackButtonStartDrawableResId(R.drawable.ic_arrow_back_black_24dp)
            16 -> builder
                    .setEndButtonLabel(R.string.go_to_summary)
                    .setBackButtonLabel("Go Back")
                    .setBackButtonStartDrawableResId(R.drawable.ic_arrow_back_black_24dp)
            17 -> builder
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