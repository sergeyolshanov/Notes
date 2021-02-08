package com.example.notes.olshanov.note

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.notes.olshanov.models.AppNote
import com.example.notes.olshanov.utilits.REPOSITORY
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.lang.Appendable

class NoteFragmentViewModel(application: Application) : AndroidViewModel(application) {
    fun delete(note: AppNote, onSuccess:() -> Unit) =
        viewModelScope.launch(Dispatchers.IO){
            REPOSITORY.delete(note){
                onSuccess()
            }
        }
}