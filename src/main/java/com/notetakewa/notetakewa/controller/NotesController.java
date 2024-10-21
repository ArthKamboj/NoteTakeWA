package com.notetakewa.notetakewa.controller;

import com.notetakewa.notetakewa.entity.Notes;
import com.notetakewa.notetakewa.service.NotesService;
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

    @DeleteMapping(path = "{noteId}")
    public void deleteNote(@PathVariable("noteId") Integer id) {
        notesService.deleteNote(id);
    }

    @PutMapping("/update/{noteId}")
    public void updateNote(@PathVariable("noteId") Integer id, @RequestBody Notes note) {
        notesService.updateNote(id, note);
    }
}
