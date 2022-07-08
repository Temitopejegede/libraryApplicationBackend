package com.temi.library.service;

import com.temi.library.model.Book;

import java.util.List;

public interface BookService {

    Book saveBook(Book myBook);

    List<Book> getAllBooks();
}
