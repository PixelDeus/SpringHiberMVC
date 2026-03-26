package com.example.springhibermvc.service;

import com.example.springhibermvc.model.User;
import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
    User getUserById(Long id);
}