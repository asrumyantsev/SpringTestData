package com.example.mytest.demo.controllers;


import com.example.mytest.demo.models.User;
import com.example.mytest.demo.repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping (path = "/demo")

public class MainController {
    @Autowired
    private UserRepository userRepository;

    // @ResponseBody means the returned String is the response, not a view name
    // @RequestParam means it is a parameter from the GET or POST request
    @PostMapping (path = "/add")
    public @ResponseBody String addNewUser (
            @RequestParam String name,
            @RequestParam String email
    ) {
        User newuser = new User();

        newuser.setName(name);
        newuser.setEmail(email);
        userRepository.save(newuser);
        return "Saved success";

    }

    @GetMapping (path = "/all/test")
    public @ResponseBody Iterable<User> getAllUsers() {
        // This returns a JSON or XML with the users
        return userRepository.findAll();
    }


}
