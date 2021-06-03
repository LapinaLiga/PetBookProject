package com.example.bookapp.entity;
import javax.persistence.*;
import java.util.HashSet;
import java.util.List;

@Entity
@Table(name = "USER_BOOK_STORE")
public class UserBookStore {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @OneToOne(mappedBy = "userBookStore")
    private User user;

    @OneToMany (mappedBy="userBookStore", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    private List<BookToSell> booksToSell;

    @OneToMany (mappedBy="userBookStore", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    private List<BookToLend> booksToLend;

    @OneToMany (mappedBy="userBookStore", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    private List<BookToGiveAway> booksToGiveAway;

    public UserBookStore() {
    }
}
