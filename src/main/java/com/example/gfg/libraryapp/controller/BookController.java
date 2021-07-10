package com.example.gfg.libraryapp.controller;

import com.example.gfg.libraryapp.models.Book;
import com.example.gfg.libraryapp.requests.BookCreateRequest;
import com.example.gfg.libraryapp.services.AuthorService;
import com.example.gfg.libraryapp.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/book/{id}")
    public Book getBook(@PathVariable("id") int id){

        return bookService.getBook(id);
    }

    @GetMapping("/book/all")
    public List<Book> getBooks(){

        return bookService.getBooks();
    }

    @PostMapping("/book")
    public void createStudent(@RequestBody BookCreateRequest bookCreateRequest){

        bookService.createBookWithAuthorDetails(bookCreateRequest);
    }
}
