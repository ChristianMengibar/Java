package org.iesfm.library.controller;

import org.iesfm.library.repository.BookLendRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookLendController {

    private BookLendRepository bookLendRepository;

    public BookLendController(BookLendRepository bookLendRepository) {
        this.bookLendRepository = bookLendRepository;
    }
}