package com.mooc.house.api.controller;

import com.mooc.house.api.common.RestResponse;
import com.mooc.house.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/9/2.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("getTestUserName")
    public RestResponse getUserName(long id){
        return userService.getTestUerName(id);
    }
}
