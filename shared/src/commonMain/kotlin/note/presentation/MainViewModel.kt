package note.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import note.domain.model.Note

class MainViewModel : ViewModel() {

    private val _state = MutableStateFlow(NoteListState(noteList = notes))

    val state = _state.asStateFlow()

    var newNote: Note? by mutableStateOf(null)
        private set

    fun onEvent(event: NoteListEvent) {


    }

}

private val notes = (1..50).map {
    Note(
        title = it.toString(),
        body = "body $it",
        id = it.toLong()
    )
}