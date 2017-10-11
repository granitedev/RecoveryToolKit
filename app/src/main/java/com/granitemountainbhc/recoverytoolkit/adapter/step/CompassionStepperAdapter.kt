package com.granitemountainbhc.recoverytoolkit.adapter.step

import android.content.Context
import android.os.Bundle
import android.support.annotation.IntRange
import android.support.v4.app.FragmentManager
import com.granitemountainbhc.recoverytoolkit.R
import com.granitemountainbhc.recoverytoolkit.fragments.scales.step.ciwa.*
import com.granitemountainbhc.recoverytoolkit.fragments.scales.step.compassion.*
import com.granitemountainbhc.recoverytoolkit.fragments.scales.step.shame.*
import com.stepstone.stepper.Step
import com.stepstone.stepper.adapter.AbstractFragmentStepAdapter
import com.stepstone.stepper.viewmodel.StepViewModel


class CompassionStepperAdapter(fm: FragmentManager, context: Context) : AbstractFragmentStepAdapter(fm, context) {


    override fun createStep(position: Int): Step? {
        when (position) {
            0 -> {
                val step1 = CompassionIntroFragment.newInstance(R.layout.fragment_compassion_intro)
                val b1 = Bundle()
                b1.putInt(CURRENT_STEP_POSITION_KEY, position)
                step1.arguments = b1
                return step1
            }

            1 -> {
                val step2 = CompassionQ1Fragment.newInstance(R.layout.fragment_compassion_q1)
                val b2 = Bundle()
                b2.putInt(CURRENT_STEP_POSITION_KEY, position)
                step2.arguments = b2
                return step2
            }

            2 -> {
                val step3 = CompassionQ2Fragment.newInstance(R.layout.fragment_compassion_q2)
                val b3 = Bundle()
                b3.putInt(CURRENT_STEP_POSITION_KEY, position)
                step3.arguments = b3
                return step3
            }
            3 -> {
                val step4 = CompassionQ3Fragment.newInstance(R.layout.fragment_compassion_q3)
                val b4 = Bundle()
                b4.putInt(CURRENT_STEP_POSITION_KEY, position)
                step4.arguments = b4
                return step4
            }
            4 -> {
                val step5 = CompassionQ4Fragment.newInstance(R.layout.fragment_compassion_q4)
                val b5 = Bundle()
                b5.putInt(CURRENT_STEP_POSITION_KEY, position)
                step5.arguments = b5
                return step5
            }
            5 -> {
                val step6 = CompassionQ5Fragment.newInstance(R.layout.fragment_compassion_q5)
                val b6 = Bundle()
                b6.putInt(CURRENT_STEP_POSITION_KEY, position)
                step6.arguments = b6
                return step6
            }
            6 -> {
                val step7 = CompassionQ6Fragment.newInstance(R.layout.fragment_compassion_q6)
                val b7 = Bundle()
                b7.putInt(CURRENT_STEP_POSITION_KEY, position)
                step7.arguments = b7
                return step7
            }
            7 -> {
                val step8 = CompassionQ7Fragment.newInstance(R.layout.fragment_compassion_q7)
                val b8 = Bundle()
                b8.putInt(CURRENT_STEP_POSITION_KEY, position)
                step8.arguments = b8
                return step8
            }
            8 -> {
                val step9 = CompassionQ8Fragment.newInstance(R.layout.fragment_compassion_q8)
                val b9 = Bundle()
                b9.putInt(CURRENT_STEP_POSITION_KEY, position)
                step9.arguments = b9
                return step9
            }
            9 -> {
                val step10 = CompassionQ9Fragment.newInstance(R.layout.fragment_compassion_q9)
                val b10 = Bundle()
                b10.putInt(CURRENT_STEP_POSITION_KEY, position)
                step10.arguments = b10
                return step10
            }
            10 -> {
                val step11 = CompassionQ10Fragment.newInstance(R.layout.fragment_compassion_q10)
                val b11 = Bundle()
                b11.putInt(CURRENT_STEP_POSITION_KEY, position)
                step11.arguments = b11
                return step11
            }
            11 -> {
                val step12 = CompassionQ11Fragment.newInstance(R.layout.fragment_compassion_q11)
                val b12 = Bundle()
                b12.putInt(CURRENT_STEP_POSITION_KEY, position)
                step12.arguments = b12
                return step12
            }
            12 -> {
                val step13 = CompassionQ12Fragment.newInstance(R.layout.fragment_compassion_q12)
                val b13 = Bundle()
                b13.putInt(CURRENT_STEP_POSITION_KEY, position)
                step13.arguments = b13
                return step13
            }
            13 -> {
                val step14 = CompassionQ13Fragment.newInstance(R.layout.fragment_compassion_q13)
                val b14 = Bundle()
                b14.putInt(CURRENT_STEP_POSITION_KEY, position)
                step14.arguments = b14
                return step14
            }
            14 -> {
                val step15 = CompassionQ14Fragment.newInstance(R.layout.fragment_compassion_q14)
                val b15 = Bundle()
                b15.putInt(CURRENT_STEP_POSITION_KEY, position)
                step15.arguments = b15
                return step15
            }
            15 -> {
                val step16 = CompassionQ15Fragment.newInstance(R.layout.fragment_compassion_q15)
                val b16 = Bundle()
                b16.putInt(CURRENT_STEP_POSITION_KEY, position)
                step16.arguments = b16
                return step16
            }
            16 -> {
                val step17 = CompassionQ16Fragment.newInstance(R.layout.fragment_compassion_q16)
                val b17 = Bundle()
                b17.putInt(CURRENT_STEP_POSITION_KEY, position)
                step17.arguments = b17
                return step17
            }
            17 -> {
                val step17 = CompassionQ17Fragment.newInstance(R.layout.fragment_compassion_q17)
                val b17 = Bundle()
                b17.putInt(CURRENT_STEP_POSITION_KEY, position)
                step17.arguments = b17
                return step17
            }
            18 -> {
                val step18 = CompassionQ18Fragment.newInstance(R.layout.fragment_compassion_q18)
                val b18 = Bundle()
                b18.putInt(CURRENT_STEP_POSITION_KEY, position)
                step18.arguments = b18
                return step18
            }
            19 -> {
                val step19 = CompassionQ19Fragment.newInstance(R.layout.fragment_compassion_q19)
                val b19 = Bundle()
                b19.putInt(CURRENT_STEP_POSITION_KEY, position)
                step19.arguments = b19
                return step19
            }
            20 -> {
                val step20 = CompassionQ20Fragment.newInstance(R.layout.fragment_compassion_q20)
                val b20 = Bundle()
                b20.putInt(CURRENT_STEP_POSITION_KEY, position)
                step20.arguments = b20
                return step20
            }
            21 -> {
                val step21 = CompassionQ21Fragment.newInstance(R.layout.fragment_compassion_q21)
                val b21 = Bundle()
                b21.putInt(CURRENT_STEP_POSITION_KEY, position)
                step21.arguments = b21
                return step21
            }
            22 -> {
                val step22 = CompassionQ22Fragment.newInstance(R.layout.fragment_compassion_q22)
                val b22 = Bundle()
                b22.putInt(CURRENT_STEP_POSITION_KEY, position)
                step22.arguments = b22
                return step22
            }
            23 -> {
                val step23 = CompassionQ23Fragment.newInstance(R.layout.fragment_compassion_q23)
                val b23 = Bundle()
                b23.putInt(CURRENT_STEP_POSITION_KEY, position)
                step23.arguments = b23
                return step23
            }
            24 -> {
                val step24 = CompassionQ24Fragment.newInstance(R.layout.fragment_compassion_q24)
                val b24 = Bundle()
                b24.putInt(CURRENT_STEP_POSITION_KEY, position)
                step24.arguments = b24
                return step24
            }
            25 -> {
                val step25 = CompassionQ25Fragment.newInstance(R.layout.fragment_compassion_q25)
                val b25 = Bundle()
                b25.putInt(CURRENT_STEP_POSITION_KEY, position)
                step25.arguments = b25
                return step25
            }
            26 -> {
                val step26 = CompassionQ26Fragment.newInstance(R.layout.fragment_compassion_q26)
                val b26 = Bundle()
                b26.putInt(CURRENT_STEP_POSITION_KEY, position)
                step26.arguments = b26
                return step26
            }

            27 -> {
                val step27 = CompassionSummaryFragment.newInstance(R.layout.fragment_compassion_summary)
                val b27 = Bundle()
                b27.putInt(CURRENT_STEP_POSITION_KEY, position)
                step27.arguments = b27
                return step27
            }

        }
        return null
    }

    override fun getCount(): Int {
        return 28
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
                    .setEndButtonLabel("This way")
                    .setBackButtonLabel("Go back")
                    .setNextButtonEndDrawableResId(R.drawable.ic_arrow_forward_black_24dp)
                    .setBackButtonStartDrawableResId(R.drawable.ic_arrow_back_black_24dp)
            17 -> builder
                    .setEndButtonLabel("This way")
                    .setBackButtonLabel("Go back")
                    .setNextButtonEndDrawableResId(R.drawable.ic_arrow_forward_black_24dp)
                    .setBackButtonStartDrawableResId(R.drawable.ic_arrow_back_black_24dp)
            18 -> builder
                    .setEndButtonLabel("This way")
                    .setBackButtonLabel("Go back")
                    .setNextButtonEndDrawableResId(R.drawable.ic_arrow_forward_black_24dp)
                    .setBackButtonStartDrawableResId(R.drawable.ic_arrow_back_black_24dp)
            19 -> builder
                    .setEndButtonLabel("This way")
                    .setBackButtonLabel("Go back")
                    .setNextButtonEndDrawableResId(R.drawable.ic_arrow_forward_black_24dp)
                    .setBackButtonStartDrawableResId(R.drawable.ic_arrow_back_black_24dp)
            20 -> builder
                    .setEndButtonLabel("This way")
                    .setBackButtonLabel("Go back")
                    .setNextButtonEndDrawableResId(R.drawable.ic_arrow_forward_black_24dp)
                    .setBackButtonStartDrawableResId(R.drawable.ic_arrow_back_black_24dp)
            21 -> builder
                    .setEndButtonLabel("This way")
                    .setBackButtonLabel("Go back")
                    .setNextButtonEndDrawableResId(R.drawable.ic_arrow_forward_black_24dp)
                    .setBackButtonStartDrawableResId(R.drawable.ic_arrow_back_black_24dp)
            22 -> builder
                    .setEndButtonLabel("This way")
                    .setBackButtonLabel("Go back")
                    .setNextButtonEndDrawableResId(R.drawable.ic_arrow_forward_black_24dp)
                    .setBackButtonStartDrawableResId(R.drawable.ic_arrow_back_black_24dp)
            23 -> builder
                    .setEndButtonLabel("This way")
                    .setBackButtonLabel("Go back")
                    .setNextButtonEndDrawableResId(R.drawable.ic_arrow_forward_black_24dp)
                    .setBackButtonStartDrawableResId(R.drawable.ic_arrow_back_black_24dp)
            24 -> builder
                    .setEndButtonLabel("This way")
                    .setBackButtonLabel("Go back")
                    .setNextButtonEndDrawableResId(R.drawable.ic_arrow_forward_black_24dp)
                    .setBackButtonStartDrawableResId(R.drawable.ic_arrow_back_black_24dp)
            25 -> builder
                    .setEndButtonLabel("This way")
                    .setBackButtonLabel("Go back")
                    .setNextButtonEndDrawableResId(R.drawable.ic_arrow_forward_black_24dp)
                    .setBackButtonStartDrawableResId(R.drawable.ic_arrow_back_black_24dp)
            26 -> builder
                    .setEndButtonLabel(R.string.go_to_summary)
                    .setBackButtonLabel("Go Back")
                    .setBackButtonStartDrawableResId(R.drawable.ic_arrow_back_black_24dp)
            27 -> builder
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