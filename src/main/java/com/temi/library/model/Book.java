package com.temi.library.model;

import lombok.*;

import javax.persistence.Column;
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

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "Author", nullable = false)
    private String author;

    @Column(name = "Number Of Pages", nullable = false)
    private int numberOfPages;

    @Column(name = "Color", nullable = false)
    private String color;

    @Column(name = "Date Added", nullable = false)
    private Date dateAdded;



}
