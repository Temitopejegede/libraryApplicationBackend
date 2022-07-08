package com.temi.library.service.impl;

import com.temi.library.exception.ResourceNotFoundException;
import com.temi.library.model.Book;
import com.temi.library.payload.BookDTO;
import com.temi.library.repository.BookRepository;
import com.temi.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImplementation implements BookService {
    @Autowired
    private BookRepository bookRepository;

    public BookServiceImplementation(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }
    @Override
    public BookDTO saveBook(BookDTO inputBookTO) {
        Book book = mapToModel(inputBookTO);

        Book newBook = bookRepository.save(book);

        BookDTO bookResponse = mapToDTO(newBook);

        return bookResponse;
    }

    @Override
    public List<BookDTO> getAllBooks() {
        List<Book> books = bookRepository.findAll();
        return books.stream().map(book -> mapToDTO(book)).collect(Collectors.toList());
    }

    public BookDTO getBookById(Long id){
        Book book = bookRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Book", "id", id));
        return mapToDTO(book);
    }

    private BookDTO mapToDTO(Book book){
        BookDTO bookDTO = new BookDTO();
        bookDTO.setId(book.getId());
        bookDTO.setTitle(book.getTitle());
        bookDTO.setAuthor(book.getAuthor());
        bookDTO.setColor(book.getColor());
        bookDTO.setNumberOfPages(book.getNumberOfPages());
        bookDTO.setDateAdded(book.getDateAdded());

        return bookDTO;
    }

    private Book mapToModel(BookDTO bookDTO){
        Book book = new Book();
        book.setTitle(bookDTO.getTitle());
        book.setAuthor(bookDTO.getAuthor());
        book.setColor(bookDTO.getColor());
        book.setNumberOfPages(bookDTO.getNumberOfPages());
        book.setDateAdded(bookDTO.getDateAdded());

        return book;
    }
}
