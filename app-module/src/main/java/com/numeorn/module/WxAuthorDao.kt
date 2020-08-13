package com.numeorn.module

import androidx.room.*
import com.numeorn.module.WxAuthor

@Dao
interface WxAuthorDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(wxAuthor: WxAuthor): Long

    @Delete
    suspend fun delete(wxAuthor: WxAuthor): Int

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun update(wxAuthor: WxAuthor): Int

    @Query("SELECT * FROM WxAuthor WHERE id = :id")
    suspend fun findById(id: Long): WxAuthor

}