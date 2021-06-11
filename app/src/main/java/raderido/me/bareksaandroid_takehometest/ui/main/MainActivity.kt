package raderido.me.bareksaandroid_takehometest.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.viewmodel.ext.android.viewModel
import raderido.me.bareksaandroid_takehometest.R
import raderido.me.bareksaandroid_takehometest.ui.main.adapter.MainPagerAdapter

class MainActivity : AppCompatActivity() {
    private val mainVM: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupTabMenu()
        back_menu.setOnClickListener {
            mainVM.backMenu(this)
        }
    }

    private fun setupTabMenu() {
        val adapter = MainPagerAdapter(this)
        viewpager_content.adapter = adapter
        TabLayoutMediator(tab_content, viewpager_content){tab, position ->
            tab.text = adapter.titleTab(position)
        }.attach()
    }
}