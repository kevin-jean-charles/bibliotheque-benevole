package com.librairiebenevole.libbackend.service;

import java.util.List;

import com.librairiebenevole.libbackend.model.Book;

public interface BookService {
    Book add(Book book);

    List<Book> getAll();

    Book get(Long id);

    Book update(Long id, Book book);
    
    void delete(Long id);
}
