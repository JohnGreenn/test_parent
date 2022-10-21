package com.ge.test_parent.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping
    public String findAll() {
        return "nihaoa";
    }

}

