package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    @Transactional
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getUsers() {
        return userDao.getUsers();
    }

    @Override
    @Transactional(readOnly = true)
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Override
    @Transactional
    public void update(int id, User updateUser) {
        userDao.update(id, updateUser);
    }

    @Override
    @Transactional
    public void delete(int id) {
        userDao.delete(id);
    }
}