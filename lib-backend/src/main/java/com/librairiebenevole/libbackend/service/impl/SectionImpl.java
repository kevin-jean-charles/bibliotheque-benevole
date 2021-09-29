package com.librairiebenevole.libbackend.service.impl;
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
    
}
