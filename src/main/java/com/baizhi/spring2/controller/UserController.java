package com.baizhi.spring2.controller;

import com.baizhi.spring2.entity.User;
import com.baizhi.spring2.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "queryAll", produces = "application/json;charset=utf-8")
    @ResponseBody
    public List<User> queryAll() {
        return userMapper.selectAll();
    }

    @RequestMapping("index")
    public String index() {
        return "index2";
    }


}
