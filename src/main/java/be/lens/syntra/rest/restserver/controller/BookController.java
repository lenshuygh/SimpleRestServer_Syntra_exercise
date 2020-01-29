package be.lens.syntra.rest.restserver.controller;

import be.lens.syntra.rest.restserver.model.Book;
import be.lens.syntra.rest.restserver.model.BookList;
import be.lens.syntra.rest.restserver.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @GetMapping
    public ResponseEntity<BookList> getAllBooks(){
        return new ResponseEntity<>(new BookList(bookRepository.getBooks()), HttpStatus.OK);
    }

    @GetMapping("{isbn}")
    public ResponseEntity<Book> getBookByIsbn(@PathVariable String isbn){
        System.out.println("isbn : " + isbn);
        return new ResponseEntity<>(bookRepository.getBook(isbn),HttpStatus.OK);
    }
}
