package com.librairiebenevole.libbackend.service;
import java.util.List;

import com.librairiebenevole.libbackend.model.Section;

/**
 * SectionService
 */
public interface SectionService {
    public Section add(Section section);
    public List<Section> getAll();


}