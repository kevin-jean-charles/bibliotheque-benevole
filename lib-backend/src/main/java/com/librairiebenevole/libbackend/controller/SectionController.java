package com.librairiebenevole.libbackend.controller;

import com.librairiebenevole.libbackend.model.Section;
import com.librairiebenevole.libbackend.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SectionController {

    @Autowired
    SectionService sectionService;
    

    @PostMapping("/section")
    public ResponseEntity<Section> addSection(Section section) {
        Section savedSection = sectionService.add(section);
        return new ResponseEntity<Section>(savedSection, HttpStatus.CREATED);
    }
}