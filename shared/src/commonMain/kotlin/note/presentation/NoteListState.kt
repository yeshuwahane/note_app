package note.presentation

import note.domain.model.Note

data class NoteListState(
    val noteList: List<Note>,
    val isNoteSheetOpen:Boolean? = false,
    val isSelectedNoteOpen:Boolean? = false,
    val selectedContact:Boolean? = null
)
