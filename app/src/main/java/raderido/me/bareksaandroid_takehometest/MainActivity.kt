package raderido.me.bareksaandroid_takehometest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupTabMenu()
        viewpager_content.reduceDragSensitivity(7)
        back_menu.setOnClickListener {
            Toast.makeText(this, "Back menu ..", Toast.LENGTH_SHORT).show()
        }
    }

    private fun setupTabMenu() {
        val adapter = MainPagerAdapter(this)
        viewpager_content.adapter = adapter
        TabLayoutMediator(tab_content, viewpager_content){tab, position ->
            tab.text = adapter.titleTab(position)
        }.attach()
    }

    private fun ViewPager2.reduceDragSensitivity(sensitivity: Int) {
        val recyclerViewField = ViewPager2::class.java.getDeclaredField("mRecyclerView")
        recyclerViewField.isAccessible = true
        val recyclerView = recyclerViewField.get(this) as RecyclerView
        val touchSlopField = RecyclerView::class.java.getDeclaredField("mTouchSlop")
        touchSlopField.isAccessible = true
        val touchSlop = touchSlopField.get(recyclerView) as Int
        touchSlopField.set(recyclerView, touchSlop*sensitivity)
    }

}