package com.example.graphql.services;

import com.example.graphql.entites.Book;

import java.util.List;

public interface BookService {

    //create
    Book crete(Book book);

    // get all
    List<Book> getAll();

    // get single book
    Book get(int bookId);
}
