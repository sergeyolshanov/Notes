package com.example.notes.olshanov.database

import androidx.lifecycle.LiveData
import com.example.notes.olshanov.models.AppNote

interface DatabaseRepository {
    val allNotes:LiveData<List<AppNote>>
    suspend fun insert(note: AppNote,onSuccess:()->Unit)
    suspend fun delete(note: AppNote,onSuccess:()->Unit)
}