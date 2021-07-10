package com.example.gfg.libraryapp.repository;

import com.example.gfg.libraryapp.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

//    @Query("select a from Author where a.email = :email")
//    Author getAuthorByEmail(String email);
//    OR

      Author findByEmail(String email);
}
