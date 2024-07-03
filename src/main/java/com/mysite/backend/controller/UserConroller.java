package com.mysite.backend.controller;

import com.mysite.backend.model.User;
import com.mysite.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserConroller {

    @Autowired
    private UserRepository userRepository;

    //새 유저 생성 localhost:8080/api/users 포스트
    @PostMapping("/users")
    User addUser(@RequestBody User newUser) {
        return userRepository.save(newUser);
    }

    @GetMapping("/users")
    List<User> getAllUsers(){
        return userRepository.findAll();
    }

}
