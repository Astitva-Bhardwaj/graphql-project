package com.example.graphql.entites.repo;

import com.example.graphql.entites.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Integer> {
}
