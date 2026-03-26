package com.example.springhibermvc.dao;

import com.example.springhibermvc.model.User;
import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
    User getUserById(Long id);
}