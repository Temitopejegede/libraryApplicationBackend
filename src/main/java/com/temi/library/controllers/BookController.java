package com.temi.library.controllers;

import com.temi.library.model.Book;
import com.temi.library.payload.BookDTO;
import com.temi.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/book")
@CrossOrigin
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/add")
    public ResponseEntity<BookDTO> addBook(@RequestBody BookDTO myBook){
        return new ResponseEntity<>(bookService.saveBook(myBook), HttpStatus.CREATED);
    }

    @GetMapping("/getAllBooks")
    public List<BookDTO> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookDTO> getBookById(@PathVariable(name = "id") Long id){
        return ResponseEntity.ok(bookService.getBookById(id));
    }
}
