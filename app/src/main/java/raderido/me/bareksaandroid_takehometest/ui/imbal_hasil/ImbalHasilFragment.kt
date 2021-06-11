package raderido.me.bareksaandroid_takehometest.ui.imbal_hasil

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_imbal_hasil.*
import org.koin.android.viewmodel.ext.android.viewModel
import raderido.me.bareksaandroid_takehometest.R
import raderido.me.bareksaandroid_takehometest.repo.model.DataContent
import raderido.me.bareksaandroid_takehometest.ui.imbal_hasil.adapter.ImbalHasilPagerAdapter
import raderido.me.bareksaandroid_takehometest.ui.imbal_hasil.adapter.ImbalHasilRVAdapter

class ImbalHasilFragment : Fragment() {
    private val imbalHasilVM: ImbalHasilViewModel by viewModel()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_imbal_hasil, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupTabTime()
        imbalHasilVM.dummyData { dummy->
            setupDataContent(dummy)
        }
    }

    private fun setupDataContent(data: List<DataContent>){
        val adapter = ImbalHasilRVAdapter()
        adapter.setData(data)
        val layout = LinearLayoutManager(requireContext())
        data_content.layoutManager = layout
        data_content.adapter = adapter
    }

    private fun setupTabTime() {
        val adapter = ImbalHasilPagerAdapter(this)
        chart_content.adapter = adapter
        TabLayoutMediator(time_tabs, chart_content){tab, position ->
            tab.text = adapter.titleTab(position)
        }.attach()
    }
}