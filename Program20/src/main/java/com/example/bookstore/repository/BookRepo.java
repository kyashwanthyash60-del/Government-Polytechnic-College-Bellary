package com.example.bookstore.repository;
import com.example.bookstore.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface BookRepo extends MongoRepository<Book, Integer> { }
