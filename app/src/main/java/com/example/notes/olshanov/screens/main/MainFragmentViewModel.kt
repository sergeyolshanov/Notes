package com.example.notes.olshanov.screens.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.notes.olshanov.utilits.REPOSITORY

class MainFragmentViewModel(application: Application) : AndroidViewModel(application) {
    val allNotes = REPOSITORY.allNotes
}