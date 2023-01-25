package org.iesfm.library.repository;

import org.iesfm.library.BookLend;
import org.iesfm.library.BookLendId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookLendRepository extends JpaRepository<BookLend, BookLendId> {
}