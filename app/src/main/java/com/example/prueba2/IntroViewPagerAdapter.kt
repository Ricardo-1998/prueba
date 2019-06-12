package com.example.prueba2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import kotlinx.android.synthetic.main.layout_screen.view.*

class IntroViewPagerAdapter(internal var mContext: Context, internal var mListScreen: List<ScreenTime>) :

    PagerAdapter() {


    override fun getCount(): Int {
        return mListScreen.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        var inflater : LayoutInflater = mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var layoutScreen : View = inflater.inflate(R.layout.layout_screen,null)

        layoutScreen.introTitle.text =  mListScreen.get(position).title
        layoutScreen.intro_description.text = mListScreen.get(position).Description
        layoutScreen.intro_img.setImageResource(mListScreen.get(position).screenImg)

        container.addView(layoutScreen)
        return layoutScreen
    }
}

