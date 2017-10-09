package com.granitemountainbhc.recoverytoolkit.activity

import android.content.res.Resources
import android.os.Bundle
import android.support.design.widget.CollapsingToolbarLayout
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View


import com.granitemountainbhc.recoverytoolkit.R

class IntakeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intake)
        setSupportActionBar(findViewById<View>(R.id.toolbar) as Toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        // Set Collapsing Toolbar layout to the screen
        val collapsingToolbar = findViewById<View>(R.id.collapsing_toolbar) as CollapsingToolbarLayout
        // Set title of Detail page
        // collapsingToolbar.setTitle(getString(R.string.item_title));
        val postion = intent.getIntExtra(EXTRA_POSITION, 0)
        val resources = resources
        val intake = resources.getStringArray(R.array.intake)
        collapsingToolbar.title = intake[postion % intake.size]
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    companion object {

        val EXTRA_POSITION = "position"
    }
}
