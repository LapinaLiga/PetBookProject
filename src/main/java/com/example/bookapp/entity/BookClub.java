package com.example.bookapp.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "BOOK_CLUBS")
public class BookClub {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "BOOK_CLUB_NAME")
    private String bookClubName;

//    @ManyToMany(fetch=FetchType.LAZY,
//            cascade = {CascadeType.PERSIST, CascadeType.MERGE,
//                    CascadeType.DETACH, CascadeType.REFRESH
//            })
//    @JoinTable(name = "BOOK_CLUB_MEMBERS",
//    joinColumns = @JoinColumn(name="BOOK_CLUB_ID", referencedColumnName = "ID"),
//    inverseJoinColumns = @JoinColumn(name = "USER_ID", referencedColumnName = "ID"))
//    private Set<User> bookClubMembers;

    @OneToMany(mappedBy = "bookClub")
    private Set<BookClubUser> bookClubUser;

    @Column(name = "BIO")
    private String bookClubBio;

    @OneToMany (mappedBy="user", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    private List<Post> posts;

    public BookClub() {
    }

//    public BookClub(User bookClubCreatorAdmin, String bookClubName) {
//        this.bookClubName = bookClubName;
//        this.bookClubCreatorAdmin = bookClubCreatorAdmin;
//        this.bookClubMembers = new LinkedHashSet<>();
//        this.bookClubBio = null;
//        this.posts = new LinkedList<>();
//    }

//    public void joinBookClub(User user) {
//        this.bookClubMembers.add(user);
//    }
//
    public void setBookClubName(String bookClubName) {
        this.bookClubName = bookClubName;
    }

    public String getBookClubName() {
        return bookClubName;
    }
//
//    public User getBookClubCreatorAdmin() {
//        return bookClubCreatorAdmin;
//    }
//
//    public Set<User> getBookClubMembers() {
//        return bookClubMembers;
//    }
//
    public String getBookClubBio() {
        return bookClubBio;
    }

    public void setBookClubBio(String bookClubBio) {
        this.bookClubBio = bookClubBio;
    }

    //
//    public List<Post> getPosts() {
//        return posts;
//    }
}
