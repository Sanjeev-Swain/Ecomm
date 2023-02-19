package com.example.Ecomm.service;

import com.example.Ecomm.model.User;
import com.example.Ecomm.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class UserService implements IUserService{

    private static List<User> users =new ArrayList<>();

    @Autowired
    UserRepository userRepository;


    @Override
    public void addUser(User user)
    {
        userRepository.save(user);
    }

    @Override
    public User findById(int id_u)
    {
        return userRepository.findById(id_u).get();
    }

}
