package org.iesfm.library;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@IdClass(BookLendId.class)
@Table(name = "bool_lend")
public class BookLend {

    @Id
    @Column(name = "member_id",nullable = false)
    private Integer memberId;
    @Id
    @Column(name = "isbn",nullable = false)
    private String isbn;
    @Id
    @Column(name = "lend_date",nullable = false)
    private Date lendDate;

    public BookLend() {
    }

    public BookLend(Integer memberId, String isbn, Date lendDate) {
        this.memberId = memberId;
        this.isbn = isbn;
        this.lendDate = lendDate;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Date getLendDate() {
        return lendDate;
    }

    public void setLendDate(Date lendDate) {
        this.lendDate = lendDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookLend bookLend = (BookLend) o;
        return Objects.equals(memberId, bookLend.memberId) && Objects.equals(isbn, bookLend.isbn) && Objects.equals(lendDate, bookLend.lendDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberId, isbn, lendDate);
    }

    @Override
    public String toString() {
        return "BookLend{" +
                "memberId=" + memberId +
                ", isbn='" + isbn + '\'' +
                ", lendDate=" + lendDate +
                '}';
    }
}