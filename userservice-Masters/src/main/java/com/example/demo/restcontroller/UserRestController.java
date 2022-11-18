package com.example.demo.restcontroller;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserRestController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
    @Cacheable(value = "user",key = "#id")
    @GetMapping("/user/{id}")
    public User getUserByID(@PathVariable int id){
        System.out.println("Load getUserByID from DB");
        return userService.getUserByID(id);
    }
    @PostMapping("/user")
    public User addNewUser(@RequestBody User user) {
        return userService.addUser(user);
    }
    
    @DeleteMapping("/user/{id}")
    @CacheEvict(value = "user",allEntries = true)
    public String deleteUserByID(@PathVariable int id){
        return userService.deleteUserByID(id);
    }
   

}
