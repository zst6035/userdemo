package com.bjsxt.mapper;

import com.bjsxt.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface UserMapper {
    void insertUser(User user);
    List<User> selectUserAll();
    User selectUserById(Integer id);
    void updateUser(User user);
    void deleteUserById(Integer id);
    User login(User user);
}
