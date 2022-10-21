package com.ge.test_parent.controller;


import com.ge.test_parent.entity.User;
import com.ge.test_parent.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author glq
 * @since 2022-10-21
 */
@RestController
@RequestMapping("/test_parent/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping
    public String findAll() {
        return "nihaoa";
    }

    @GetMapping("all")
    public List findAll2() {
        List<User> users = userMapper.selectList(null);
        return users;
    }

}

