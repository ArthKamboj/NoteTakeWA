package com.notetakewa.notetakewa.repository;

import com.notetakewa.notetakewa.entity.Notes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotesRepository extends JpaRepository<Notes, Integer> {

}
