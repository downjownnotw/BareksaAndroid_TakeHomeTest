package raderido.me.bareksaandroid_takehometest

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import raderido.me.bareksaandroid_takehometest.MainRecyclerViewAdapter.MainVH
import raderido.me.bareksaandroid_takehometest.databinding.DataContentLayoutBinding

class MainRecyclerViewAdapter : RecyclerView.Adapter<MainVH>() {

    private var data: List<DataContent> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainVH {
        val binding: DataContentLayoutBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.data_content_layout, parent, false)
        return MainVH(binding)
    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: MainVH, position: Int) = holder.bind(data[position])

    fun setData(data: List<DataContent>) {
        this.data = data
        notifyDataSetChanged()
    }

    class MainVH(private val itemBinding: DataContentLayoutBinding): RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(obj: DataContent) {
            itemBinding.setVariable(BR.data, obj)
            itemBinding.executePendingBindings()
        }
    }
}