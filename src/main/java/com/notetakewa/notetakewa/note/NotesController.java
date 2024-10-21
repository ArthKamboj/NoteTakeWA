package com.notetakewa.notetakewa.note;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping()
public class NotesController {

    private final NotesService notesService;

    @Autowired
    public NotesController(NotesService notesService) {
        this.notesService = notesService;
    }

    @GetMapping("/")
    public List<Notes> getNotes() {
        return notesService.getNotes();
    }

    @PostMapping
    public void registerNote(@RequestBody Notes note) {
        notesService.addNote(note);
    }
}
