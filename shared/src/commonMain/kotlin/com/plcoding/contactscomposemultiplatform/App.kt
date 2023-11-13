package com.plcoding.contactscomposemultiplatform

import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import dev.icerock.moko.mvvm.compose.getViewModel
import dev.icerock.moko.mvvm.compose.viewModelFactory
import note.domain.model.Note
import note.presentation.MainViewModel
import note.presentation.NoteListScreen


@Composable
fun App() {

    val viewModel = getViewModel(
        key = "note-list-screen",
        factory = viewModelFactory {
            MainViewModel()
        }
    )

    val state by viewModel.state.collectAsState()


    Surface{
        NoteListScreen(
            noteListState = state,
            newNote = viewModel.newNote,
            onEvent = viewModel::onEvent
        )
    }

}