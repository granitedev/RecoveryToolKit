package com.granitemountainbhc.recoverytoolkit.activity

import android.content.Intent
import android.os.Bundle

import android.support.design.widget.NavigationView
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v4.view.ViewPager
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.*
import android.widget.Toast
import butterknife.BindView


import com.granitemountainbhc.recoverytoolkit.R
import com.granitemountainbhc.recoverytoolkit.fragments.CardContentFragment


import butterknife.ButterKnife
import com.granitemountainbhc.recoverytoolkit.activity.step.WithdrawalScaleSelectActivity
import java.util.*



class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {


    private var mToolbar: Toolbar? = null
    private var mDrawerLayout: DrawerLayout? = null



    @BindView(R.id.toolbar)
    lateinit var toolbar: Toolbar


    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.MyMaterialTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myToolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(myToolbar)
        ButterKnife.bind(this)



        // Setting ViewPager for each Tabs
        val viewPager = findViewById<View>(R.id.viewpager) as ViewPager
        setupViewPager(viewPager)

        setupToolbarMenu()
        setupNavigationDrawerMenu()

    }


    private fun setupToolbarMenu() {

        mToolbar = findViewById<View>(R.id.toolbar) as Toolbar
        mToolbar!!.title = "Recovery Toolkit"
    }

    private fun setupNavigationDrawerMenu() {

        val navigationView = findViewById<View>(R.id.nav_view) as NavigationView
        mDrawerLayout = findViewById<View>(R.id.drawer_layout) as DrawerLayout
        navigationView.setNavigationItemSelectedListener(this)

        val drawerToggle = ActionBarDrawerToggle(this,
                mDrawerLayout,
                mToolbar,
                R.string.drawer_open,
                R.string.drawer_close)

        mDrawerLayout!!.addDrawerListener(drawerToggle)
        drawerToggle.isDrawerIndicatorEnabled = true
        drawerToggle.syncState()
    }

    override// Called when Any Navigation Item is Clicked
    fun onNavigationItemSelected(menuItem: MenuItem): Boolean {

        menuItem.isCheckable = true
        menuItem.isChecked = true  // This helps to know which Menu Item is Clicked

        val itemName = menuItem.title as String

        Toast.makeText(this@MainActivity, itemName + " Clicked", Toast.LENGTH_SHORT).show()

        closeDrawer()

        when (menuItem.itemId) {

            R.id.stepperLayout -> {
                // launch new intent instead of loading fragment
                startActivity(Intent(this@MainActivity, WithdrawalScaleSelectActivity::class.java))
                mDrawerLayout!!.closeDrawers()
                return true
            }

            R.id.nav_limits -> {
                // launch new intent instead of loading fragment
                startActivity(Intent(this@MainActivity, LimitsActivity::class.java))
                mDrawerLayout!!.closeDrawers()
                return true
            }

            R.id.nav_shame -> {
                // launch new intent instead of loading fragment
                startActivity(Intent(this@MainActivity, ShameActivity::class.java))
                mDrawerLayout!!.closeDrawers()
                return true
            }

            R.id.nav_compassion -> {
                // launch new intent instead of loading fragment
                startActivity(Intent(this@MainActivity, CompassionActivity::class.java))
                mDrawerLayout!!.closeDrawers()
                return true
            }

            R.id.nav_worksheets -> {
                // launch new intent instead of loading fragment
                startActivity(Intent(this@MainActivity, WorksheetsActivity::class.java))
                mDrawerLayout!!.closeDrawers()
                return true
            }

            R.id.nav_books -> {
                // launch new intent instead of loading fragment
                startActivity(Intent(this@MainActivity, EbooksActivity::class.java))
                mDrawerLayout!!.closeDrawers()
                return true
            }

            R.id.nav_prescreen -> {
                // launch new intent instead of loading fragment
                startActivity(Intent(this@MainActivity, PrescreenActivity::class.java))
                mDrawerLayout!!.closeDrawers()
                return true
            }

            R.id.nav_intake -> {
                // launch new intent instead of loading fragment
                startActivity(Intent(this@MainActivity, IntakeActivity::class.java))
                mDrawerLayout!!.closeDrawers()
                return true
            }

            R.id.nav_handbook -> {
                // launch new intent instead of loading fragment
                startActivity(Intent(this@MainActivity, HandbookActivity::class.java))
                mDrawerLayout!!.closeDrawers()
                return true
            }


            R.id.nav_about_us -> {
                // launch new intent instead of loading fragment
                startActivity(Intent(this@MainActivity, AboutUsActivity::class.java))
                mDrawerLayout!!.closeDrawers()
                return true
            }

            R.id.nav_privacy_policy -> {
                // launch new intent instead of loading fragment
                startActivity(Intent(this@MainActivity, PrivacyPolicyActivity::class.java))
                mDrawerLayout!!.closeDrawers()
                return true
            }

            R.id.user_profile -> {
                // launch new intent instead of loading fragment
                startActivity(Intent(this@MainActivity, UserProfile::class.java))
                mDrawerLayout!!.closeDrawers()
                return true
            }
        }

        return true
    }


    // Close the Drawer
    private fun closeDrawer() {
        mDrawerLayout!!.closeDrawer(GravityCompat.START)
    }

    // Open the Drawer
    private fun showDrawer() {
        mDrawerLayout!!.openDrawer(GravityCompat.START)
    }

    override fun onBackPressed() {
        if (mDrawerLayout!!.isDrawerOpen(GravityCompat.START))
            closeDrawer()
        else
            super.onBackPressed()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the main; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {

            R.id.action_chat -> {
                startActivity(Intent(this@MainActivity, ChatActivity::class.java))
                mDrawerLayout!!.closeDrawers()
                return true
            }

            else ->
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item)
        }


    }


    // Add Fragments to Tabs
    private fun setupViewPager(viewPager: ViewPager) {
        val adapter = Adapter(supportFragmentManager)
        adapter.addFragment(CardContentFragment(), "Card")
        viewPager.adapter = adapter
    }

    internal class Adapter(manager: FragmentManager) : FragmentPagerAdapter(manager) {
        private val mFragmentList = ArrayList<Fragment>()
        private val mFragmentTitleList = ArrayList<String>()

        override fun getItem(position: Int): Fragment {
            return mFragmentList[position]
        }

        override fun getCount(): Int {
            return mFragmentList.size
        }

        fun addFragment(fragment: Fragment, title: String) {
            mFragmentList.add(fragment)
            mFragmentTitleList.add(title)
        }

        override fun getPageTitle(position: Int): CharSequence {
            return mFragmentTitleList[position]
        }

    }



}

