package com.oscargil80.firstleohilt.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.oscargil80.firstleohilt.Model.Word
import com.oscargil80.firstleohilt.R
import com.oscargil80.firstleohilt.databinding.ItemWordBinding


class WordAdapter(
) : ListAdapter<Word, WordViewHolder>(WordDiffUtill()) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = WordViewHolder (
       ItemWordBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
        holder.render(getItem(position))
    }


}
