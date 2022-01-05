package com.example.recyclerviewproject

import androidx.room.Entity
import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

@Entity(tableName="notes_table")
class Note(@ColumnInfo(name:"note_text")val text:String, val id:Int) {
@PrimaryKey(autoGenerate=true)var id=0
}


