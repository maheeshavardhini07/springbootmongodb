package com.sony.task2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sony.task2.model.User;
import com.sony.task2.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
      System.out.println("Userservice");
        return userRepository.findAll();
       }
      public Optional<User> getById(String id) {
        return userRepository.findById(id);
       }
      public User update(String id, User user) {
        return userRepository.save(user);
       }
      public User save(User user) {
        return userRepository.save(user);
       }
       
       public void delete(String id) {
        return;
       }
}
