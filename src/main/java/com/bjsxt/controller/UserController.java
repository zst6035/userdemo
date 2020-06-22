package com.bjsxt.controller;


import com.bjsxt.pojo.User;
import com.bjsxt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

/*
* 页面跳转
*
* */

    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }


    /*
    * 添加用户
    * */
    @RequestMapping("/addUser")
        public String addUser(User user){
            this.userService.addUser(user);
            return "ok";

        }

        /*
        * 查询全部用户
        * */
        @RequestMapping("/findUserAll")
        public String findUserAll(Model model){
            List<User> list=this.userService.findUserAll();
            model.addAttribute("list",list);
            return "showUsers";
        }

    @RequestMapping("/findUserById")
    public String findUserById(Integer id,Model model){
        User user = this.userService.findUserById(id);
        model.addAttribute("user", user);
        return "updateUser";
    }
    /**
     * 更新用户
     */
    @RequestMapping("/editUser")
    public String editUser(User user){
        this.userService.updateUser(user);
        return "ok";
    }

    /**
     * 删除用户
     */
    @RequestMapping("/delUser")
    public String delUser(Integer id){
        this.userService.deleteUserById(id);
        return "redirect:/users/findUserAll";
    }

    //前台使用json字符串提交
    @RequestMapping(value = "/login2", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String login2(@RequestBody  User user){
       User user1= this.userService.loign(user);
       if(user1!=null){
           return "登录成功";
       }
       else return "登录失败";
    }

    //前台使用普通表单方式提交
    @RequestMapping(value = "/login")
    @ResponseBody
    public String login(User user){
        User user1= this.userService.loign(user);
        if(user1!=null){
            return "登录成功";
        }
        else return "登录失败";
    }
}
