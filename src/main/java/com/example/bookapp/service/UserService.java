package com.example.bookapp.service;

import com.example.bookapp.entity.User;
import com.example.bookapp.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public User getUser(Long userId) {
        Optional<User> findUserById = userRepo.findById(userId);
        if(!findUserById.isPresent()) {
            System.out.println("User not found!");
        }
        User user = findUserById.get();
        return user;
    }

    public User save(User user) {
        return userRepo.save(user);
    }

    public void deleteUser(Long userId) {
        Optional<User> findUserById = userRepo.findById(userId);
        if(!findUserById.isPresent()) {
            System.out.println("User not found!");
        }
        User user = findUserById.get();
        userRepo.delete(user);
    }
}
