package com.librairiebenevole.libbackend.service.impl;
import java.util.List;

import com.librairiebenevole.libbackend.model.Section;
import com.librairiebenevole.libbackend.repository.SectionRepo;
import com.librairiebenevole.libbackend.service.SectionService;
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
    
}
