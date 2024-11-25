package com.nik11.sem5.Contoller;


import com.nik11.sem5.Model.User;
import com.nik11.sem5.Repo.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()
public class ApiController {

    @Autowired
    private UserRepo userRepo;
    @GetMapping("/")
    public String getpage(){
        return "welcome";
    }

    @GetMapping("/user")
    public List<User> getUsers() {
        return userRepo.findAll();
    }
    @PostMapping("/save")
    public String saveUser(@RequestBody User user) {
        userRepo.save(user);
        return "saved";
    }
}
