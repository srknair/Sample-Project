package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookRepository.Bookrepository;
import com.example.model.Book;

@Service
public class BookService {


    @Autowired
    private Bookrepository bookrepo;

    public Book add(Book book)
    {
        return bookrepo.save(book);
    }

    public List getAllBooks()
    {
        return bookrepo.findAll();
    }

    public Book getbyId(Long id)
    {
        return bookrepo.findById(id).orElseThrow(()->new RuntimeException("No Book found with  Id"));
    }
}
