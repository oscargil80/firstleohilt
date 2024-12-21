package com.oscargil80.firstleohilt

import com.oscargil80.firstleohilt.Model.Word
import com.oscargil80.firstleohilt.database.WordDAO

class WordRepositoryImpl(
    private val wordDao: WordDAO
) : WordRepository {
    override suspend fun insertWords(word: Word) {
        return wordDao.insertWord(word)
    }

    override suspend fun getAllWords(): List<Word> {
        return wordDao.getAllWords()
    }
}