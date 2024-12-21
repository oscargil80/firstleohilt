package com.oscargil80.firstleohilt

import androidx.lifecycle.LiveData
import com.oscargil80.firstleohilt.Model.Word

interface WordRepository {
    suspend fun insertWords(word: Word)
    fun getAllWords(): LiveData<List<Word>>
}