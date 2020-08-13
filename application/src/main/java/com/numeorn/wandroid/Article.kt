package com.numeorn.wandroid

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Article(

        @PrimaryKey(autoGenerate = true)
        val id: Long,

        val title: String,

        val url: String

)