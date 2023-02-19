package com.example.Ecomm.controller;

import com.example.Ecomm.model.User;
import com.example.Ecomm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/ecomm-app-user")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/create-user")
    public void addUser(@RequestBody User user)
    {
        userService.addUser(user);
    }

    @GetMapping("/find-user/id/{id}")
    public User findUserById(@PathVariable int id_u)
    {
        return userService.findById(id_u);
    }

}
