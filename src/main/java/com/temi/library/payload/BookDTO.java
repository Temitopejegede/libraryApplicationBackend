package com.temi.library.payload;

import lombok.Data;

@Data
public class BookDTO {
    private Long id;
    private String title;
    private String author;
    private String numberOfPages;
    private String color;
    private String dateAdded;
}
