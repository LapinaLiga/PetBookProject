package com.example.bookapp.repository;

import com.example.bookapp.entity.BookToLend;
import com.example.bookapp.entity.BookToSell;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookToLendRepo extends CrudRepository<BookToLend, Long> {
}
