package com.oscargil80.firstleohilt.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.oscargil80.firstleohilt.Model.Word

@Database(entities = [Word::class], exportSchema = false, version = 1)
abstract class WordsDatabase: RoomDatabase() {

    abstract fun wordDao(): WordDAO

}