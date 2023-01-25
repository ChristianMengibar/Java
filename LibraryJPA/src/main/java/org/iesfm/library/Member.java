package org.iesfm.library;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "member")
public class Member {

    @Id
    @GeneratedValue
    private Integer id;
    @Column(unique = true)
    private String nif;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String surname;
    private List<BookLend> bookLendList;

    public Member() {
    }

    public Member(Integer id, String nif, String name, String surname, List<BookLend> bookLendList) {
        this.id = id;
        this.nif = nif;
        this.name = name;
        this.surname = surname;
        this.bookLendList = bookLendList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<BookLend> getBookLendList() {
        return bookLendList;
    }

    public void setBookLendList(List<BookLend> bookLendList) {
        this.bookLendList = bookLendList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(id, member.id) && Objects.equals(nif, member.nif) && Objects.equals(name, member.name) && Objects.equals(surname, member.surname) && Objects.equals(bookLendList, member.bookLendList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nif, name, surname, bookLendList);
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", bookLendList=" + bookLendList +
                '}';
    }
}