package com.example.Ecomm.service;

import com.example.Ecomm.model.User;

import java.util.List;

public interface IUserService {

    public void addUser(User user);

    public User findById(int id_u);


}
