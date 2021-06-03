package com.example.bookapp.service;

import com.example.bookapp.entity.BookClub;
import com.example.bookapp.repository.BookClubRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

@Service
public class BookClubService {

    @Autowired
    BookClubRepo bookClubRepo;

    public Collection<BookClub> getAllBookClubs() {
        Iterable<BookClub> iterableBookClub = bookClubRepo.findAll();
        Collection<BookClub> bookClubCollection = new ArrayList<BookClub>();
        iterableBookClub.forEach(bookClubCollection::add);

        return bookClubCollection;
    }

    public BookClub getBookClub(Long userId) {
        Optional<BookClub> findBookClubById = bookClubRepo.findById(userId);
        if(!findBookClubById.isPresent()) {
            System.out.println("Book club not found!");
        }
        BookClub bookClub = findBookClubById.get();
        return bookClub;
    }

    public BookClub save(BookClub bookClub) {
        return bookClubRepo.save(bookClub);
    }

    public void deleteBookClub(Long userId) {
        Optional<BookClub> findBookClubById = bookClubRepo.findById(userId);
        if(!findBookClubById.isPresent()) {
            System.out.println("Book club not found!");
        }
        BookClub bookClub = findBookClubById.get();
        bookClubRepo.delete(bookClub);
    }
}
