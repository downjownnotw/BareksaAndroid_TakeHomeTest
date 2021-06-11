package raderido.me.bareksaandroid_takehometest.ui.imbal_hasil.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import raderido.me.bareksaandroid_takehometest.R
import raderido.me.bareksaandroid_takehometest.ui.imbal_hasil.ChartTemplateFragment

class ImbalHasilPagerAdapter(private val fragment: Fragment): FragmentStateAdapter(fragment) {

    private val mainPages = listOf(
        ChartTemplateFragment(),
        ChartTemplateFragment(),
        ChartTemplateFragment(),
        ChartTemplateFragment(),
        ChartTemplateFragment(),
        ChartTemplateFragment(),
        ChartTemplateFragment()
    )

    override fun getItemCount(): Int {
        return mainPages.size
    }

    override fun createFragment(position: Int): Fragment {
        return mainPages[position]
    }

    fun titleTab(position: Int): CharSequence{
        return when(position){
            0 -> fragment.getString(R.string.time_tabs_1w)
            1 -> fragment.getString(R.string.time_tabs_1m)
            2 -> fragment.getString(R.string.time_tabs_1y)
            3 -> fragment.getString(R.string.time_tabs_3y)
            4 -> fragment.getString(R.string.time_tabs_5y)
            5 -> fragment.getString(R.string.time_tabs_10y)
            else -> fragment.getString(R.string.time_tabs_all)
        }
    }
}