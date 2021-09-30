package com.librairiebenevole.libbackend.exception;

public class SectionNotFoundException extends RuntimeException {
    
    public SectionNotFoundException () {
        super("Section Not Found");
    }

}
