package raderido.me.bareksaandroid_takehometest.ui.imbal_hasil

import androidx.lifecycle.ViewModel
import raderido.me.bareksaandroid_takehometest.repo.IMainRepository
import raderido.me.bareksaandroid_takehometest.repo.model.DataContent

class ImbalHasilViewModel(mainRepo: IMainRepository): ViewModel() {

    fun dummyData(data: (List<DataContent>) -> Unit){
        val dummy = mutableListOf<DataContent>()
        dummy.add(DataContent("Jenis reksa dana", "Saham", "Pasar Uang", "Saham"))
        dummy.add(DataContent("Imbal hasil", "5,50% / 5 thn", "6,29% / thn", "7,17% / 5 thn"))
        dummy.add(DataContent("Dana kelolaan", "3,64 Miliar", "215,97 Miliar", "3,89 Triliun"))
        dummy.add(DataContent("Min. pembelian", "1 Juta", "100 Ribu", "100 Ribu"))
        dummy.add(DataContent("Jangka waktu", "5 Tahun", "1 Tahun", "5 Tahun"))
        dummy.add(DataContent("Tingkat risiko", "Tinggi", "Rendah", "Tinggi"))
        dummy.add(DataContent("Peluncuran", "16 Apr 2014", "14 Jan 2016", "20 Feb 2007"))
        data(dummy)
    }
}