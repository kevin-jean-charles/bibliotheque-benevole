package com.librairiebenevole.libbackend.controller;

import com.librairiebenevole.libbackend.model.Book;
import com.librairiebenevole.libbackend.repository.BookRepo;
import com.librairiebenevole.libbackend.repository.SectionRepo;
import com.librairiebenevole.libbackend.service.SectionService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class BookController {


    private final BookRepo bRepo;
    private final SectionService sService;

    BookController(BookRepo bRepo, SectionRepo sRepo){
        this.bRepo = bRepo;
        this.sService = sService;
    }

    @PostMapping(value="sections/{id}/books")
    public ResponseEntity<Book> addBooks(@RequestBody Book book) {
        Section section = sRepo.findById());
        Book newBook = bRepo.save(book);
        return new ResponseEntity<Book>(newBook, HttpStatus.CREATED);
    }
    


}