package com.bjsxt.service;

import com.bjsxt.pojo.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    List<User> findUserAll();
    User findUserById(Integer id);
    void updateUser(User user);
    void deleteUserById(Integer id);
    User  loign(User user);
}
