package com.example.bookapp.entity;

import javax.persistence.*;

@Entity
@Table(name = "POSTS")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;

    @ManyToOne
    @JoinColumn(name="bookClub_id", nullable=false)
    private BookClub bookClub;

    @Column(name="POST_BODY")
    private String postBody;

    public Post() {
    }

    //    public Post(User user, BookClub bookClub, String postBody) {
//        this.user = user;
//        this.bookClub = bookClub;
//        this.postBody = postBody;
//    }

    public User getUser() {
        return user;
    }

    public BookClub getBookClub() {
        return bookClub;
    }

    public String getPostBody() {
        return postBody;
    }
}
