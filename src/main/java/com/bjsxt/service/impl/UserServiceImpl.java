package com.bjsxt.service.impl;

import com.bjsxt.mapper.UserMapper;
import com.bjsxt.pojo.User;
import com.bjsxt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    /*
    * 在userMapper接口上加上两个注解，就不会标红了@Mapper
@Repository
    * */
    @Autowired
    private UserMapper userMapper;
    @Override
    public void addUser(User user) {
        this.userMapper.insertUser(user);
    }

    @Override
    public List<User> findUserAll() {
        return this.userMapper.selectUserAll();
    }

    @Override
    public User findUserById(Integer id) {

        return this.userMapper.selectUserById(id);
    }

    @Override
    public void updateUser(User user) {
        this.userMapper.insertUser(user);

    }

    @Override
    public void deleteUserById(Integer id) {
        this.userMapper.deleteUserById(id);
    }

    @Override
    public User  loign(User user) {
       return this.userMapper.login(user);
    }
}
