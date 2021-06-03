package com.example.bookapp.entity;

import javax.persistence.*;

@Entity
@Table(name = "BOOKS_TO_GIVE_AWAY")
public class BookToGiveAway extends Book{

    @ManyToOne
    @JoinColumn(name="userBookStore_id", nullable=false)
    private UserBookStore userBookStore;

    public BookToGiveAway() {
        super();
    }
}
