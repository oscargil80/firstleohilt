package com.oscargil80.firstleohilt.Adapter

import androidx.recyclerview.widget.DiffUtil
import com.oscargil80.firstleohilt.Model.Word


class WordDiffUtill : DiffUtil.ItemCallback<Word>() {

    override fun areItemsTheSame(oldItem: Word, newItem: Word): Boolean {
        return  oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Word, newItem: Word): Boolean {
        return oldItem == newItem
    }
}