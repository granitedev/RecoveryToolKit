package com.granitemountainbhc.recoverytoolkit.adapter.step

import android.content.Context
import android.os.Bundle
import android.support.annotation.IntRange
import android.support.v4.app.FragmentManager
import com.granitemountainbhc.recoverytoolkit.R
import com.granitemountainbhc.recoverytoolkit.fragments.scales.step.ciwa.*
import com.stepstone.stepper.Step
import com.stepstone.stepper.adapter.AbstractFragmentStepAdapter
import com.stepstone.stepper.viewmodel.StepViewModel

class CiwaStepperAdapter(fm: FragmentManager, context: Context) : AbstractFragmentStepAdapter(fm, context) {


    override fun createStep(position: Int): Step? {
        when (position) {
            0 -> {
                val step1 = CiwaNauseaFragment.newInstance(R.layout.fragment_ciwa_nausea)
                val b1 = Bundle()
                b1.putInt(CURRENT_STEP_POSITION_KEY, position)
                step1.arguments = b1
                return step1
            }


            1 -> {
                val step2 = CiwaTremorFragment.newInstance(R.layout.fragment_ciwa_shakes)
                val b2 = Bundle()
                b2.putInt(CURRENT_STEP_POSITION_KEY, position)
                step2.arguments = b2
                return step2
            }

            2 -> {
                val step3 = CiwaSweatsFragment.newInstance(R.layout.fragment_ciwa_sweats)
                val b3 = Bundle()
                b3.putInt(CURRENT_STEP_POSITION_KEY, position)
                step3.arguments = b3
                return step3
            }

            3 -> {
                val step4 = CiwaAnxietyFragment.newInstance(R.layout.fragment_ciwa_anxiety)
                val b4 = Bundle()
                b4.putInt(CURRENT_STEP_POSITION_KEY, position)
                step4.arguments = b4
                return step4
            }

            4 -> {
                val step5 = CiwaAgitationFragment.newInstance(R.layout.fragment_ciwa_agitation)
                val b5 = Bundle()
                b5.putInt(CURRENT_STEP_POSITION_KEY, position)
                step5.arguments = b5
                return step5
            }

            5 -> {
                val step6 = CiwaTactileFragment.newInstance(R.layout.fragment_ciwa_tactile)
                val b6 = Bundle()
                b6.putInt(CURRENT_STEP_POSITION_KEY, position)
                step6.arguments = b6
                return step6
            }

            6 -> {
                val step7 = CiwaAuditoryFragment.newInstance(R.layout.fragment_ciwa_auditory)
                val b7 = Bundle()
                b7.putInt(CURRENT_STEP_POSITION_KEY, position)
                step7.arguments = b7
                return step7
            }

            7 -> {
                val step8 = CiwaVisualFragment.newInstance(R.layout.fragment_ciwa_visual)
                val b8 = Bundle()
                b8.putInt(CURRENT_STEP_POSITION_KEY, position)
                step8.arguments = b8
                return step8
            }

            8 -> {
                val step9 = CiwaHeadachesFragment.newInstance(R.layout.fragment_ciwa_headaches)
                val b9 = Bundle()
                b9.putInt(CURRENT_STEP_POSITION_KEY, position)
                step9.arguments = b9
                return step9
            }

            9 -> {
                val step10 = CiwaOrientationFragment.newInstance(R.layout.fragment_ciwa_orientation)
                val b10 = Bundle()
                b10.putInt(CURRENT_STEP_POSITION_KEY, position)
                step10.arguments = b10
                return step10
            }

            10 -> {
                val step11 = CiwaSummaryFragment()
                val b11 = Bundle()
                b11.putInt(CURRENT_STEP_POSITION_KEY, position)
                step11.arguments = b11
                return step11
            }


        }
        return null
    }

    override fun getCount(): Int {
        return 11
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
                    .setEndButtonLabel(R.string.go_to_summary)
                    .setBackButtonLabel("Go Back")
                    .setBackButtonStartDrawableResId(R.drawable.ic_arrow_back_black_24dp)
            10 -> builder
                    .setBackButtonLabel("Go back")
                    .setEndButtonLabel("I'm done!")
            else -> throw IllegalArgumentException("Unsupported position: " + position)
        }
        return builder.create()
    }

    companion object {


        private val CURRENT_STEP_POSITION_KEY = "messageResourceId"
    }

}