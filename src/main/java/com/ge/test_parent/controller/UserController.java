package com.ge.test_parent.controller;


import com.ge.test_parent.entity.User;
import com.ge.test_parent.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    //@Autowired
    //private UserMapper userMapper;

    @Autowired
    private UserService service;

    @GetMapping
    public String findAll() {
        return "nihaoa";
    }

    @GetMapping("all")
    public List findAll2() {
        List<User> users = service.list(null);
        return users;
    }

    @PostMapping("add")
    public boolean addInfo(@RequestBody User user) {
        boolean save = service.save(user);
        return save;
    }

}

