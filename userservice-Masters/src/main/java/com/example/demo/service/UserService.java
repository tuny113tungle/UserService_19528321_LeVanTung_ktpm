package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

public interface UserService {
    public User addUser(User user);
    public User getUserByID(int userID);
    public List<User> getAllUser();
    public String deleteUserByID(int userID);
    

}
