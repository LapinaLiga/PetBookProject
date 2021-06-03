package com.example.bookapp.entity;

import javax.persistence.*;

@Entity
@Table(name = "RATINGS")
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @ManyToOne
    @JoinColumn(name="book_isbn", nullable = false)
    private Book book;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;

    @Column(name="RATING_VALUE")
    private double rating;

    public Rating() {
    }

//    public Rating(double rating, Book book, User user) {
//        this.rating = rating;
//        this.book = book;
//        this.user = user;
//    }

//        public double calculateAverageBookRating(Book book) {
//        double ratingSum = 0;
//        double numberOfRatings = 0;
//        List<Rating> usersBookRatings = new ArrayList<>(book.getUsersBookRatings());
//        List<Double> usersBookRatingValues = new ArrayList<>();
//        usersBookRatingValues.stream()
//                .forEach(s -> getRating());
//
//        for(Double e: usersBookRatingValues) {
//            numberOfRatings++;
//            ratingSum += e;
//        }
//        return bookAverageRatingByUsers = ratingSum / numberOfRatings;
//    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
