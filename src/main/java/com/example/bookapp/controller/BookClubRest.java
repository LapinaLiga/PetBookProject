package com.example.bookapp.controller;

import com.example.bookapp.entity.BookClub;
import com.example.bookapp.service.BookClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user/{userId}/bookclub")
public class BookClubRest {

    @Autowired
    BookClubService bookClubService;

    @GetMapping
    public Iterable<BookClub> getAllBookClubs() {
        return bookClubService.getAllBookClubs();
    }

    @GetMapping("/{id}")
    public BookClub getBookClub(@PathVariable Long id) {
        return bookClubService.getBookClub(id);
    }

    @PostMapping
    public BookClub addBookClub(@RequestBody BookClub bookClub) {
        return bookClubService.save(bookClub);
    }

    @DeleteMapping("/{id}")
    public void deleteBookClub(@PathVariable Long id) {
        bookClubService.deleteBookClub(id);
    }

}

