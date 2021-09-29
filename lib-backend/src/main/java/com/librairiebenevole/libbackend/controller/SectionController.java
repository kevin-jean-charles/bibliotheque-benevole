package com.librairiebenevole.libbackend.controller;

import java.util.List;

import javax.validation.Valid;

import com.librairiebenevole.libbackend.model.Section;
import com.librairiebenevole.libbackend.service.SectionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
        Section savedSection = sectionService.add(section);
        return new ResponseEntity<Section>(savedSection, HttpStatus.CREATED);
    }

    @GetMapping("/sections")
    public ResponseEntity <List<Section>> getAllSection() {
        List<Section> sections = sectionService.getAll();
        return new ResponseEntity<List<Section>>(sections, HttpStatus.OK);
    }

}
