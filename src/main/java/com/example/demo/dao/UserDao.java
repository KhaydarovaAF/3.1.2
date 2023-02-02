package com.example.demo.dao;


import com.example.demo.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);
    User getUserById(int id);
    List<User> getUsers();
    void update(int id, User user);
    void delete(int id);
}
