package com.granitemountainbhc.recoverytoolkit.fragments.scales.step

import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import butterknife.ButterKnife

internal abstract class ButterKnifeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(layoutResId, container, false)
        ButterKnife.bind(this, view)
        return view
    }

    @get:LayoutRes
    protected abstract val layoutResId: Int

}