package com.example.graphql.services.impl;

import com.example.graphql.entites.Book;
import com.example.graphql.entites.repo.BookRepo;
import com.example.graphql.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepo bookRepo;

    @Override
    public Book crete(Book book) {
        return bookRepo.save(book);
    }

    @Override
    public List<Book> getAll() {
        return bookRepo.findAll();
    }

    @Override
    public Book get(int bookId) {
        return bookRepo.findById(bookId).orElseThrow(() -> new RuntimeException("Book not found"));
    }
}
