package com.example.bookapp.repository;

import com.example.bookapp.entity.BookClub;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookClubRepo extends CrudRepository<BookClub, Long> {
}
