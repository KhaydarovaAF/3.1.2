package com.example.demo.service;


import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    void addUser(User user);
    List<User> getUsers();
    User getUserById(int id);
    void update(int id, User updateUser);
    void delete(int id);
}
