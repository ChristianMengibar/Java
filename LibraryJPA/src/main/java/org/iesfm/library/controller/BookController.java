package org.iesfm.library.controller;

import org.iesfm.library.Book;
import org.iesfm.library.repository.BookRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class BookController {

    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping(method = RequestMethod.GET, path = "books")
    public Iterable<Book> list(@RequestParam(value = "author") String author) {
        if (bookRepository.existsByAuthor(author)) {
            return bookRepository.findByAuthor(author);
        } else if (author == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "El campo de author está vacío.");
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No se encontró ningún libro con tal author.");
        }
    }

    @RequestMapping (method = RequestMethod.GET, path = "/lentBooks")
    public List<Book> findBooksLent (){
        return bookRepository.getLentBooks();
    }
}