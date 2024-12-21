package com.oscargil80.firstleohilt.Model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Word(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val word: String

)
