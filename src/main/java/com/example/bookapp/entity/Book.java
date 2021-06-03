package com.example.bookapp.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance (strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "BOOKS")
public class Book {

    @Id
    @Column(name = "ISBN")
    private long bookISBN;

    @Column(name = "NAME")
    private String bookName;

    @Column(name = "AUTHOR")
    private String bookAuthor;

    //private double averageBookRating;

    @OneToMany (mappedBy="book", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    private List<Review> usersBookReviews;

    @OneToMany (mappedBy="book", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    private List<Rating> usersBookRatings;

    public Book() {
    }

////    public Book(long bookISBN, String bookName, String bookAuthor) {
////        this.bookISBN = bookISBN;
////        this.bookName = bookName;
////        this.bookAuthor = bookAuthor;
////        this.usersBookReviews = new ArrayList<>();
////        this.usersBookRatings = new ArrayList<>();
////        this.averageBookRating = averageBookRating;
////    }

    public long getBookISBN() {
        return bookISBN;
    }

    public void setBookISBN(long bookISBN) {
        this.bookISBN = bookISBN;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

//
////    public double getUserAverageBookRating() {
////        calculateReaderAverageBookRating();
////        return userAverageBookRating;
////    }

    public List<Rating> getUsersBookRatings() {
        return usersBookRatings;
    }

    public List<Review> getUsersBookReviews() {
        return usersBookReviews;
    }
}
