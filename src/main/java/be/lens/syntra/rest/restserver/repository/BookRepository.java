package be.lens.syntra.rest.restserver.repository;


import be.lens.syntra.rest.restserver.model.Book;

import java.util.List;

public interface BookRepository {
    List<Book> getBooks();

    Book getBook(String isbn);
}
