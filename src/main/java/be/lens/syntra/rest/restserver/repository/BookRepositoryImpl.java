package be.lens.syntra.rest.restserver.repository;

import be.lens.syntra.rest.restserver.model.Book;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class BookRepositoryImpl implements BookRepository {
    private Map<String, Book> bookMap = new HashMap<>();

    public BookRepositoryImpl() {
        Book book = new Book();
        book.setIsbn("2000");
        book.setTitle("Java Self Help");
        book.setAuthor("Lens Huygh");
        book.setPrice(20f);
        this.bookMap.put(book.getIsbn(), book);
        Book book2 = new Book("1000", "Java For Non Dummies", "Steve", 40f);
        this.bookMap.put(book2.getIsbn(), book2);
        Book book3 = new Book("666", "Lords of Chaos", "Mr Beasto", 66.6f);
        this.bookMap.put(book3.getIsbn(), book3);
    }

    @Override
    public List<Book> getBooks() {
        return bookMap.values().stream().collect(Collectors.toList());
    }

    @Override
    public Book getBook(String isbn) {
        return bookMap.get(isbn);
    }
}
