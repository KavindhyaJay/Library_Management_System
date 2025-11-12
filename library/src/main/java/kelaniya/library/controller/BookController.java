package kelaniya.library.controller;

import kelaniya.library.model.Book;
import kelaniya.library.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
@CrossOrigin
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @PostMapping
    public Book addBook(@RequestBody Book book){
        return service.addBook(book);
    }

    @GetMapping
    public List<Book> getAllBooks(){
        return service.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable String id){
        return service.getBookById(id);
    }

    @PutMapping
    public Book updateBook(@RequestBody Book book){
        return service.updateBook(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable String id){
        service.deleteBook(id);
    }

    @GetMapping("/year/{year}")
    public List<Book> getBooksByYear(@PathVariable int year){
        return service.findBooksByYear(year);
    }

    @GetMapping("/genre/{id}")
    public String getGenre(@PathVariable String id){
        return service.getGenreById(id);
    }

    @DeleteMapping("/year/{year}")
    public void deleteBooksByYear(@PathVariable int year){
        service.deleteBooksByYear(year);
    }
}
