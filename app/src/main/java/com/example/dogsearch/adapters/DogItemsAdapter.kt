package com.example.dogsearch.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.dogsearch.databinding.ItemsBinding
import com.example.dogsearch.model.Items
import com.example.dogsearch.utils.DiffUtils

class DogItemsAdapter : RecyclerView.Adapter<DogItemsAdapter.DogsItemViewHolder>() {

    private var dogsList = mutableListOf<Items>()
    var clickItem: ((Items) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogsItemViewHolder {
        return DogsItemViewHolder(
            ItemsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: DogsItemViewHolder, position: Int) {
        holder.onBind()
    }

    override fun getItemCount() = dogsList.size

    inner class DogsItemViewHolder(var binding: ItemsBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind() {
            binding.image.setImageResource(dogsList[adapterPosition].img)
            binding.root.setOnClickListener {
                clickItem?.invoke(dogsList[adapterPosition])
            }
        }
    }

    fun setData(data: MutableList<Items>) {
        val diffUtil = DiffUtils(dogsList, data)
        val diffResult = DiffUtil.calculateDiff(diffUtil)
        dogsList = data
        diffResult.dispatchUpdatesTo(this)
    }
}
