package com.temi.library.service;

import com.temi.library.model.Book;
import com.temi.library.payload.BookDTO;

import java.util.List;

public interface BookService {

    BookDTO saveBook(BookDTO BookDTO);

    List<BookDTO> getAllBooks();

    BookDTO getBookById(Long id);
}
