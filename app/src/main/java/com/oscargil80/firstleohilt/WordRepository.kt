package com.oscargil80.firstleohilt

import com.oscargil80.firstleohilt.Model.Word

interface WordRepository {
    suspend fun insertWords(word: Word)
    suspend fun getAllWords(): List<Word>
}