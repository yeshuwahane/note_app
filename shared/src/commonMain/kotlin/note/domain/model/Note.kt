package note.domain.model

data class Note(
    val title:String,
    val body:String,
    val id:Long? =null
)
