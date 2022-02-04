package com.example.khatabook_20

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil.setContentView
import com.example.khatabook_20.databinding.ActivityLandingBinding
import com.google.android.material.tabs.TabLayout

class landingscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var binding: ActivityLandingBinding
        = setContentView(this, R.layout.activity_landing)


        val tablayout = binding.tablayout
        val viewpager = binding.viewpager
        tablayout.addTab(tablayout.newTab().setText("Transactions"))
        tablayout.addTab(tablayout.newTab().setText("History"))
        tablayout.tabGravity = TabLayout.GRAVITY_FILL

        val adapter = ViewPager(this, supportFragmentManager,
            tablayout.tabCount)
        viewpager.adapter = adapter

        viewpager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tablayout))
        tablayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewpager.currentItem = tab.position
            }
            override fun onTabUnselected(tab: TabLayout.Tab) {

            }
            override fun onTabReselected(tab: TabLayout.Tab) {

            }
        })

    }
}