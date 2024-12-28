package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v/user")
@CrossOrigin
public class UserController {

    @GetMapping("/getUser")
    public String getUser() {
        return "Hello World";
    }
    @PostMapping("/saveUser")
    public String postUser() {
        return "User save";
    }
    @PutMapping("/UpdateUser")
    public String putUser() {
        return "User update";
    }
    @DeleteMapping("/UserDelete")
    public String deleteUser() {
        return "User delete";
    }

}
