package com.example.bookapp.repository;

import com.example.bookapp.entity.BookClub;
import com.example.bookapp.entity.UserBookStore;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserBookStoreRepo extends CrudRepository<UserBookStore, Long> {
}
