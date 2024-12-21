package com.oscargil80.firstleohilt

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.oscargil80.firstleohilt.Model.Word
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WordsViewModel @Inject constructor(
private val wordRepository: WordRepository
): ViewModel() {

    fun saveWord(text: String) {
        viewModelScope.launch(Dispatchers.IO) {
            wordRepository.insertWords(Word(0, text))
        }
    }

    fun getAllWords(): LiveData<List<Word>> = wordRepository.getAllWords()
}