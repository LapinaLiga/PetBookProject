package com.example.bookapp.repository;

import com.example.bookapp.entity.Rating;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingRepo extends CrudRepository<Rating, Long> {
}
