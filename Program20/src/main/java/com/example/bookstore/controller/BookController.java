package com.example.bookstore.controller;
import com.example.bookstore.entity.Book;
import com.example.bookstore.repository.BookRepo;
import java.util.List;
import org.springframework.web.bind.annotation.*;
@RestController
public class BookController {
  private final BookRepo repo;
  public BookController(BookRepo repo) { this.repo=repo; }
  @PostMapping("/addBook") public String saveBook(@RequestBody Book book) { repo.save(book); return "Added Successfully"; }
  @GetMapping("/findAllBooks") public List<Book> getBooks() { return repo.findAll(); }
  @DeleteMapping("/delete/{id}") public String deleteBook(@PathVariable Integer id) { repo.deleteById(id); return "Deleted Successfully"; }
}
