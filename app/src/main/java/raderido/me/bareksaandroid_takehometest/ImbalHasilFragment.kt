package raderido.me.bareksaandroid_takehometest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_imbal_hasil.*

class ImbalHasilFragment : Fragment() {
    private val dummy = mutableListOf<DataContent>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_imbal_hasil, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dummy.add(DataContent("Jenis reksa dana", "Saham", "Pasar Uang", "Saham"))
        dummy.add(DataContent("Imbal hasil", "5,50% / 5 thn", "6,29% / thn", "7,17% / 5 thn"))
        dummy.add(DataContent("Dana kelolaan", "3,64 Miliar", "215,97 Miliar", "3,89 Triliun"))
        dummy.add(DataContent("Min. pembelian", "1 Juta", "100 Ribu", "100 Ribu"))
        dummy.add(DataContent("Jangka waktu", "5 Tahun", "1 Tahun", "5 Tahun"))
        dummy.add(DataContent("Tingkat risiko", "Tinggi", "Rendah", "Tinggi"))
        dummy.add(DataContent("Peluncuran", "16 Apr 2014", "14 Jan 2016", "20 Feb 2007"))

        setupDataContent()
    }

    private fun setupDataContent(){
        val adapter = MainRecyclerViewAdapter()
        adapter.setData(dummy)
        val layout = LinearLayoutManager(requireContext())
        data_content.layoutManager = layout
        data_content.adapter = adapter
    }
}