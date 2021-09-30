package com.librairiebenevole.libbackend.service;
import java.util.List;

import com.librairiebenevole.libbackend.model.Section;

/**
 * SectionService
 */
public interface SectionService {
    public Section add(Section section);

    public List<Section> getAll();
    
    public Section get(Long id);

    public Section update(Long id, Section section);

    public void delete(Long id);
}