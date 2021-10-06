package com.librairiebenevole.libbackend.controller;

import java.util.List;

import javax.validation.Valid;

import com.librairiebenevole.libbackend.exception.SectionNotFoundException;
import com.librairiebenevole.libbackend.model.Section;
import com.librairiebenevole.libbackend.service.SectionService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;


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
    public ResponseEntity<List<Section>> getAllSection() {
        List<Section> sections = sectionService.getAll();
        return new ResponseEntity<List<Section>>(sections, HttpStatus.OK);
    }

    @GetMapping("/sections/{id}")
    public ResponseEntity<Section> getSection(@PathVariable Long id)  {
        try {
            Section section = sectionService.get(id);
            return new ResponseEntity<Section>(section, HttpStatus.OK);
        } catch (SectionNotFoundException ex) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/sections/{id}")
    public ResponseEntity<Section> updateSection(@PathVariable Long id, @RequestBody Section section )  {
        try {
            Section savedSection = sectionService.update(id, section);
            return new ResponseEntity<Section>(savedSection, HttpStatus.OK);
        } catch (SectionNotFoundException ex) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/sections/{id}")
    public ResponseEntity<Void>deleteSection(@PathVariable Long id)  {
            sectionService.delete(id);
            return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
