package presenter;

import notepadapi.Note;
import presenter.dto.NoteDto;
import ui.View;

import java.util.List;

public interface Presenter {
    NoteDto createNewNote(String note);

    List<NoteDto> getAllNotes();

    void deleteNoteByNumber(int index);
}
