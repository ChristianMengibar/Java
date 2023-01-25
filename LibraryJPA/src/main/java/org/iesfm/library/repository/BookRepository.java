package org.iesfm.library.repository;

import org.iesfm.library.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, String> {

    boolean existsByAuthor(String author);

    List<Book> findByAuthor(String author);

    List<Book> getLentBooks();
}