package com.example.roomproject.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class User(var login: String, var pass: String){
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}

