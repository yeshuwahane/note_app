package note.domain

import kotlinx.coroutines.flow.Flow
import note.domain.model.Note

interface NoteDataSource  {

    fun getNotes():Flow<List<Note>>

    fun getRecentNotes(amount:Int):Flow<List<Note>>

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(id:Long)

}