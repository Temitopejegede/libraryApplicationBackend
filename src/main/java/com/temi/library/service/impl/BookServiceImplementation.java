package com.temi.library.service.impl;

import com.temi.library.model.Book;
import com.temi.library.repository.BookRepository;
import com.temi.library.service.BookService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImplementation implements BookService {
    private BookRepository bookRepository;
    @Override
    public Book saveBook(Book myBook) {
        return bookRepository.save(myBook);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}
