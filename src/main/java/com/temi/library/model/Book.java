package com.temi.library.model;

import lombok.*;

import javax.persistence.*;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "books", uniqueConstraints = {@UniqueConstraint(columnNames = "title")})
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "Author", nullable = false)
    private String author;

    @Column(name = "NumberOfPages", nullable = false)
    private int numberOfPages;

    @Column(name = "Color", nullable = false)
    private String color;

    @Column(name = "DateAdded", nullable = false)
    private String dateAdded;



}
