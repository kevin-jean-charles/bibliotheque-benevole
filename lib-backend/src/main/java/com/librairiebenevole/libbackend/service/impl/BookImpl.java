package com.librairiebenevole.libbackend.service.impl;

import java.util.List;

import com.librairiebenevole.libbackend.model.Book;
import com.librairiebenevole.libbackend.repository.BookRepo;
import com.librairiebenevole.libbackend.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;

public class BookImpl implements BookService {

    @Autowired
    private BookRepo bRepo;

    @Override
    public Book add(Book book) {
        Book newBook = bRepo.save(book);
        return newBook;
    }

    @Override
    public List<Book> getAll() {
        List<Book> books = bRepo.findAll();
        return books;
    }

    @Override
    public Book get(Long id) {
        
        return null;
    }

    @Override
    public Book update(Long id, Book book) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        
    }
    
}
