package com.temi.library.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    private long id;

    private String title;

    private String author;

    private int numberOfPages;

    private String color;

    private Date dateAdded;



}
