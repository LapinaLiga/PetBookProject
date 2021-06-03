package com.example.bookapp.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "BOOK_CLUB_USERS")
public class BookClubUser {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @ManyToOne
    @MapsId("USER_ID")
    private User user;

    @ManyToOne
    @MapsId("BOOK_CLUB_ID")
    private BookClub bookClub;

    @Enumerated(EnumType.STRING)
    private UserRole userRole;

    public BookClubUser() {
    }
}
