package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.BookService;
import com.example.model.Book;

@RestController
@RequestMapping("/books")
public class Controller {

    @Autowired
    private BookService bookService;


    @PostMapping
    public ResponseEntity<Book> addBook(@RequestBody Book book){
        Book newBook = bookService.add(book);
        return new ResponseEntity<>(newBook, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks()
    {
        return new ResponseEntity<>(bookService.getAllBooks(),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookbyId(@PathVariable Long id)
    {
        return new ResponseEntity<>(bookService.getbyId(id),HttpStatus.OK);
    }
}
