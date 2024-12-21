package com.oscargil80.firstleohilt.Adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.oscargil80.firstleohilt.Model.Word
import com.oscargil80.firstleohilt.databinding.ItemWordBinding

class WordViewHolder(
     view: View
) : RecyclerView.ViewHolder(view) {

    private var binding = ItemWordBinding.bind(view)

    fun render(
        word: Word
    ) {
        binding.txtWord.text = word.word
    }
}