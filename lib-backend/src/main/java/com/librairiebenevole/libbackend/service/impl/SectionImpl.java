package com.librairiebenevole.libbackend.service.impl;
import java.util.List;

import com.librairiebenevole.libbackend.model.Section;
import com.librairiebenevole.libbackend.repository.SectionRepo;
import com.librairiebenevole.libbackend.service.SectionService;
import com.librairiebenevole.libbackend.exception.SectionNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SectionImpl implements SectionService{

    @Autowired
    private SectionRepo repo;

    @Override
    public Section add(Section section) {
        section.setBooksTotal(0);
        Section savedSection = repo.save(section);
        return savedSection;
    }

    @Override
    public List<Section> getAll() {
        List<Section> sections = repo.findAll();
        return sections;
    }

    @Override
    public Section get(Long id) {
        Section section = repo.findById(id).orElseThrow(() -> new SectionNotFoundException()); 
        return section;
    }

    @Override
    public Section update(Long id, Section section) {
        Section savedSection = repo.findById(id).orElseThrow(() -> new SectionNotFoundException()); 
        savedSection.setName(section.getName());
        savedSection.setDescription(section.getDescription());
        repo.save(savedSection);    
        return savedSection;
    }

    @Override
    public void delete(Long id) {
        repo.findById(id).orElseThrow(() -> new SectionNotFoundException()); 
        repo.deleteById(id);
    }
    
}
