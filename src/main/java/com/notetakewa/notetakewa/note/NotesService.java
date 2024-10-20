package com.notetakewa.notetakewa.note;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotesService {

    public List<Notes> getNotes() {
        return List.of(
                new Notes(
                        "MY FIRST NOTE",
                        "Hello everyone. I am Arth Kamboj and this the first note i am writing."
                )
        );
    }
}

