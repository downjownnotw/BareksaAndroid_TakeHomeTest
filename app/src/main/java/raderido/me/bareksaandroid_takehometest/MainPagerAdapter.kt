package raderido.me.bareksaandroid_takehometest

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class MainPagerAdapter(private val activity: FragmentActivity): FragmentStateAdapter(activity) {

    private val mainPages = listOf(
        ImbalHasilFragment(),
        DanaKelolaanFragment()
    )

    override fun getItemCount(): Int {
        return mainPages.size
    }

    override fun createFragment(position: Int): Fragment {
        return mainPages[position]
    }

    fun titleTab(position: Int): CharSequence{
        return when(position){
            0 -> activity.getString(R.string.imbal_hasil)
            else -> activity.getString(R.string.dana_kelolaan)
        }
    }
}