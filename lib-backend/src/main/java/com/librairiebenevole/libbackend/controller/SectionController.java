package com.librairiebenevole.libbackend.controller;

import javax.validation.Valid;

import com.librairiebenevole.libbackend.model.Section;
import com.librairiebenevole.libbackend.service.SectionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//add cross origini + api version

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class SectionController {

    @Autowired
    SectionService sectionService;
    
    @PostMapping("/sections")
    public ResponseEntity<Section> addSection(@Valid @RequestBody Section section) {
        System.out.println("section :"+ section.getName());
        Section savedSection = sectionService.add(section);
        return new ResponseEntity<Section>(savedSection, HttpStatus.CREATED);
    }
}
