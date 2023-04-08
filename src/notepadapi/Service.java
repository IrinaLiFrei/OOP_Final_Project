package notepadapi;

import presenter.dto.NoteDto;

import java.util.List;
public interface Service {


    NoteDto createNote(String note);

    List<NoteDto> getAllNotes();

    void deleteNoteByNumber(int index);
}
