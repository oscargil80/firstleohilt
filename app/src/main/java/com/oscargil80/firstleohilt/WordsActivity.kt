package com.oscargil80.firstleohilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.input.input
import com.oscargil80.firstleohilt.Adapter.WordAdapter
import com.oscargil80.firstleohilt.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class WordsActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val viewmodel: WordsViewModel by viewModels()

     lateinit var adapter: WordAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setRecyclerView()
        binding.btnWords.setOnClickListener { showAddWords() }

        viewmodel.getAllWords().observe(this, Observer {
         adapter.submitList(it)
        })

    }

    private fun setRecyclerView() {
        adapter = WordAdapter()
        binding.rvWords.layoutManager = LinearLayoutManager(this@WordsActivity)
        binding.rvWords.adapter = adapter
        }



    private fun showAddWords() {
        MaterialDialog(this).show {
            input { dialog, text ->
                viewmodel.saveWord(text.toString())
            }
            positiveButton(text = "Submit")
        }
    }

}





