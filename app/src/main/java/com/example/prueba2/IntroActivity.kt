package com.example.prueba2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_intro.*

class IntroActivity : AppCompatActivity() {

    private lateinit var screenPager : ViewPager
    private lateinit var  introViewPagerAdapter: IntroViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        //setiando el viewpager

        var mList:ArrayList<ScreenTime> = ArrayList()

        mList.add(ScreenTime("Javi","puto el del titulo", R.drawable.drink_icon))
        mList.add(ScreenTime("Peche","culo el del titulo",R.drawable.images))
        mList.add(ScreenTime("Ansti","manco el del titulo", R.drawable.drink_icon))


        introViewPagerAdapter = IntroViewPagerAdapter(this,mList)
        screen_viewpager.adapter = introViewPagerAdapter

    }
}
