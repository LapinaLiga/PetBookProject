package com.example.bookapp.entity;

import javax.persistence.*;

@Entity
@Table(name = "REVIEWS")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;

    @ManyToOne
    @JoinColumn(name="book_isbn", nullable = false)
    private Book book;

    @Column(name = "REVIEW_BODY")
    private String reviewBody;

    public Review() {
    }

//    public Review(User user, Book book, String reviewBody) {
//        this.user = user;
//        this.book = book;
//        this.reviewBody = reviewBody;
//    }

    public long getId() {
        return id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getReviewBody() {
        return reviewBody;
    }

    public void setReviewBody(String reviewBody) {
        this.reviewBody = reviewBody;
    }
}
