package com.librairiebenevole.libbackend.repository;

import com.librairiebenevole.libbackend.model.Book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book, Long> {
    
}