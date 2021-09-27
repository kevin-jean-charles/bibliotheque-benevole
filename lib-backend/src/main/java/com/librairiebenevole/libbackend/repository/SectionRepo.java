package com.librairiebenevole.libbackend.repository;

import com.librairiebenevole.libbackend.model.Section;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionRepo extends JpaRepository<Section, Long> {
    
}