package com.notetakewa.notetakewa.note;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}

