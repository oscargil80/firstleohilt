package com.oscargil80.firstleohilt

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class WordsViewModel @Inject constructor(
private val wordRepository: WordRepository
): ViewModel(){

    lateinit var nombre: String

    init {
        nombre = "Luis"
    }

}