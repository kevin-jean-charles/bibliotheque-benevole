package com.librairiebenevole.libbackend.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Section {
    private Long id;
    private String name;
    private String desc;
    private List<String> booksList;
    private int booksTotal;
}
