package com.numeorn.module

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class WxAuthor(

        @PrimaryKey(autoGenerate = true)
        val id: Long,

        val name: String

)