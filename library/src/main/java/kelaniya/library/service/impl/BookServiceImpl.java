package kelaniya.library.service.impl;

import kelaniya.library.model.Book;
import kelaniya.library.repository.BookRepository;
import kelaniya.library.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book addBook(Book book){
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public Book getBookById(String id){
        return bookRepository.findById(id).orElse(null);
    }

    public Book updateBook(Book book){
        return bookRepository.save(book);
    }

    public void deleteBook(String id){
        bookRepository.deleteById(id);
    }

    public List<Book> findBooksByYear(int year){
        return bookRepository.findByPublicationYear(year);
    }

    public String getGenreById(String id){
        Book book = getBookById(id);
        return (book != null) ? book.getGenre() : null;
    }

    public void deleteBooksByYear(int year){
        List<Book> books = bookRepository.findByPublicationYear(year);
        bookRepository.deleteAll(books);
    }
}
