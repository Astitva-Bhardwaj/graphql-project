package com.example.graphql;

import com.example.graphql.entites.Book;
import com.example.graphql.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlProjectApplication implements CommandLineRunner {

	@Autowired
	private BookService bookService;
	public static void main(String[] args) {
		SpringApplication.run(GraphqlProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book book = new Book();
		book.setTitle("Complete Reference");
		book.setDesc("For java");
		book.setPages(2000);
		book.setPrice(5000);
		book.setAuthor("ABC");

		Book book1 = new Book();
		book1.setTitle("Complete Reference python");
		book1.setDesc("For python");
		book1.setPages(3000);
		book1.setPrice(6000);
		book1.setAuthor("XYZ");

		Book book2 = new Book();
		book2.setTitle("Complete Reference C++");
		book2.setDesc("For C++");
		book2.setPages(4000);
		book2.setPrice(7000);
		book2.setAuthor("Charles");

		bookService.crete(book);
		bookService.crete(book1);
		bookService.crete(book2);
	}
}
