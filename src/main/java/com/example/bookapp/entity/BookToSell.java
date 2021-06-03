package com.example.bookapp.entity;

import javax.persistence.*;

@Entity
@Table(name = "BOOKS_TO_SELL")
public class BookToSell extends Book {

    @ManyToOne
    @JoinColumn(name="userBookStore_id", nullable=false)
    private UserBookStore userBookStore;

    @Column(name = "PRICE")
    private double price;

    public BookToSell() {
        super();
    }
}
