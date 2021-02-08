package com.example.notes.olshanov.screens.start

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.notes.olshanov.database.room.AppRoomDatabase
import com.example.notes.olshanov.database.room.AppRoomRepository
import com.example.notes.olshanov.utilits.REPOSITORY
import com.example.notes.olshanov.utilits.TYPE_ROOM

class StartFragmentViewModel(application: Application): AndroidViewModel(application) {
    private val mContext = application

    fun initDatabase(type:String, onSuccess:()->Unit){
        when(type){
            TYPE_ROOM -> {
                val dao = AppRoomDatabase.getInstance(mContext).getAppRoomDao()
                REPOSITORY = AppRoomRepository(dao)
                onSuccess()
            }
        }
    }
}