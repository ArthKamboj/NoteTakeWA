package com.notetakewa.notetakewa.NoteConfiguration;


import com.notetakewa.notetakewa.entity.Notes;
import com.notetakewa.notetakewa.repository.NotesRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class NotesConfig {
    @Bean
    CommandLineRunner commandLineRunner(NotesRepository repository) {
        return args -> {
            Notes no1 = new Notes("FIRST NOTE", "This is first note.");

            Notes no2 = new Notes("SECOND NOTE", "This is Second note.");

            repository.saveAll(List.of(no1, no2));
        };
    }
}
