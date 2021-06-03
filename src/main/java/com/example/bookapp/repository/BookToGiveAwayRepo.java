package com.example.bookapp.repository;

import com.example.bookapp.entity.BookToGiveAway;
import com.example.bookapp.entity.BookToLend;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookToGiveAwayRepo extends CrudRepository<BookToGiveAway, Long> {
}
