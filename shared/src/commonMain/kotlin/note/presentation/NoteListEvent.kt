package note.presentation

import note.domain.model.Note

sealed interface NoteListEvent {

    object OnAddNoteClick:NoteListEvent

    object DismissNote:NoteListEvent

    data class OnTitleChange(val title:String):NoteListEvent

    data class OnBodyChange(val body:String):NoteListEvent

    object OnSaveNote:NoteListEvent

    data class SelectedNote(val note: Note):NoteListEvent

    data class EditNote(val note: Note):NoteListEvent

    object DeleteNote:NoteListEvent

}