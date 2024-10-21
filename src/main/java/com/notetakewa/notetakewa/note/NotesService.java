package com.notetakewa.notetakewa.note;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import  java.lang.IllegalArgumentException;
import java.util.List;
import java.util.Optional;

@Service
public class NotesService {

    @Autowired
    private final NotesRepository notesRepository;
    public NotesService(NotesRepository notesRepository) {
        this.notesRepository = notesRepository;
    }

    public List<Notes> getNotes() {
        return notesRepository.findAll();
    }

    public void addNote(Notes note) {
        Optional<Notes> noteOptional = notesRepository.findById(note.getId());
        notesRepository.save(note);
    }

    public void deleteNote(Integer id) {
        boolean exists = notesRepository.existsById(id);
        if (!exists) {
            throw new IllegalArgumentException("Note does not exist");
        }
        notesRepository.deleteById(id);
    }

    public void updateNote(Integer id, Notes note) {
        Optional<Notes> existingnote=notesRepository.findById(id);
        if(!existingnote.isPresent()){
            throw new IllegalArgumentException("Note does not exist");
        }
        else{
            existingnote.get().setTitle(note.getTitle());
            existingnote.get().setContent(note.getContent());
            notesRepository.save(existingnote.get());
        }


    }
}

