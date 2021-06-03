package com.example.bookapp.entity;

import javax.persistence.*;

@Entity
@Table(name = "BOOKS_TO_LEND")
public class BookToLend extends Book{

    @ManyToOne
    @JoinColumn(name="userBookStore_id", nullable=false)
    private UserBookStore userBookStore;

    @Column(name = "TIME_PERIOD_IN_DAYS")
    private int timePeriodInDays;

    public BookToLend() {
        super();
    }
}
