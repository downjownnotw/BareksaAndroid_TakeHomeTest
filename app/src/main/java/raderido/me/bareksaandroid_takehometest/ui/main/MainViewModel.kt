package raderido.me.bareksaandroid_takehometest.ui.main

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.ViewModel
import raderido.me.bareksaandroid_takehometest.repo.IMainRepository

class MainViewModel(mainRepo: IMainRepository): ViewModel(){

    fun backMenu(ctx: Context){
        Toast.makeText(ctx, "Back menu ..", Toast.LENGTH_SHORT).show()
    }
}
