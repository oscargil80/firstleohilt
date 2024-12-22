package com.oscargil80.firstleohilt.Adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.oscargil80.firstleohilt.Model.Word
import com.oscargil80.firstleohilt.databinding.ItemWordBinding

class WordViewHolder(
    private val binding : ItemWordBinding
) : RecyclerView.ViewHolder(binding.root) {

    //private var binding = ItemWordBinding.bind(view)

    fun render(
        word: Word
    ) {
        binding.txtWord.text = word.word
    }
}