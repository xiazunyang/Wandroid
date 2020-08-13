package com.numeorn.wandroid

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Update

@Dao
interface ArticleDao {

    @Insert
    suspend fun insert(article: Article): Long

    @Update
    suspend fun update(article: Article): Int

    @Update
    suspend fun delete(article: Article): Int

}