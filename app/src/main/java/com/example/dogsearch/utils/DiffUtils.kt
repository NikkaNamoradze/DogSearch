package com.example.dogsearch.utils

import androidx.recyclerview.widget.DiffUtil
import com.example.dogsearch.model.Items

class DiffUtils(
    private val oldList: MutableList<Items>,
    private val newlist: MutableList<Items>,
): DiffUtil.Callback(){
    override fun getOldListSize() = oldList.size

    override fun getNewListSize() = newlist.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int) =
        oldList[oldItemPosition].title != newlist[newItemPosition].title

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int) =
        oldList[oldItemPosition] != newlist[newItemPosition]

}