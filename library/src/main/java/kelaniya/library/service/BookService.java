package kelaniya.library.service;

import kelaniya.library.model.Book;
import java.util.List;

public interface BookService {

    Book addBook(Book book);
    List<Book> getAllBooks();
    Book getBookById(String id);
    Book updateBook(Book book);
    void deleteBook(String id);
    List<Book> findBooksByYear(int year);
    String getGenreById(String id);
    void deleteBooksByYear(int year);
}
