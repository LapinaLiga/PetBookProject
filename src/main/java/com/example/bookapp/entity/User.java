package com.example.bookapp.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "APP_USERS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "USERNAME")
    private String userName;

    @Column(name = "FIRST_NAME")
    private String userFirstName;

    @Column(name = "SURNAME")
    private String userSurname;

    @Column(name = "E_MAIL")
    private String userEmail;

    @Column(name = "BIO")
    private String userBio;

    @OneToMany (mappedBy="user", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    private List<Review> userReviews;

    @OneToMany (mappedBy="user", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    private List<Rating> userRatings;

    @OneToMany (mappedBy="user", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    private List<Post> userPosts;

    @OneToMany(mappedBy = "user")
    private Set<BookClubUser> bookClubUser;

//    @ManyToMany(fetch=FetchType.LAZY,
//            cascade = {CascadeType.PERSIST, CascadeType.MERGE,
//                    CascadeType.DETACH, CascadeType.REFRESH
//            })
//    @JoinTable(name = "BOOK_CLUB_MEMBERS",
//            joinColumns = @JoinColumn(name = "USER_ID", referencedColumnName = "ID"),
//            inverseJoinColumns = @JoinColumn(name="BOOK_CLUB_ID", referencedColumnName = "ID"))
//    private Set<BookClub> bookClubsInWhichUserAsMember;

//    @OneToMany (mappedBy="user", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
//    private Set<BookClub> bookClubsInWhichUserAsAdmin;

    //private Set<Book> booksReadByUser;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "USER_BOOK_STORE_ID", referencedColumnName = "ID")
    private UserBookStore userBookStore;

    public User() {
    }

//    public User(String userName, String userFirstName, String userSurname, String userEmail) {
//        this.userName = userName;
//        this.userFirstName = userFirstName;
//        this.userSurname = userSurname;
//        this.userEmail = userEmail;
//        //this.booksReadByUser = new HashSet<>();
//        this.userBio = null;
//        //this.userBookStore = new UserBookStore(this);
//        //this.userReviews = new ArrayList<>();
//    }

//    public boolean addBookToBooksReadByUser(Book book) {
//        return booksReadByUser.add(book);
//    }

//    public void addReview(Book book, String reviewBody) {
//        Review review = new Review(this, book, reviewBody);
//        book.getUsersBookReviews().add(review);
//    }

//    public void addRating(Book book, Double rating) {
//        book.getUsersBookRatings().add(rating);
//    }

//    public void addPost(BookClub bookClub, String postBody) {
//        Post post = new Post(this, bookClub, postBody);
//        bookClub.getPosts().add(post);
//    }

//    public void addBookToUserBookStore(Book book, BookStatusForUserStore status) {
//        userBookStore.addBooksToUserStore(book, status);
//    }

//    public BookClub createBookClub(String bookClubName) {
//        BookClub bookClub = new BookClub(this, bookClubName);
//        return bookClub;
//    }
//
//    public void joinABookClub(BookClub bookClub) {
//        bookClub.joinBookClub(this);
//    }

    public long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserBio() {
        return userBio;
    }

    public void setUserBio(String userBio) {
        this.userBio = userBio;
    }

//    public UserBookStore getUserBookStore() {
//        return userBookStore;
//    }
//
//    public Set<Book> getBooksReadByUser() {
//        return booksReadByUser;
//    }

}
