package com.temi.library.controllers;

import com.temi.library.model.Book;
import com.temi.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/book")
@CrossOrigin
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/add")
    public String addBook(@RequestBody Book myBook){
        bookService.saveBook(myBook);
        return "New Book Added";
    }
}
