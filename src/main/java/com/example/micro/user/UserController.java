package com.example.micro.user;

import com.example.micro.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/user"})
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping(value = "/{id}")
    public User findUserById(@PathVariable("id") long id){
        Optional<User> user = userService.findUserById(id);
        return user.isPresent() ? user.get() : null;
    }

    @PostMapping
    public User createUser(@RequestBody @Validated User user){
        return userService.createOrUpdateUser(user);
    }

    @PutMapping
    public User update(@RequestBody User user){
        return userService.createOrUpdateUser(user);
    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable("id") long id) {
        userService.delete(id);
    }

    @GetMapping
    public Iterable<User> findAll(){
        return userService.findAll();
    }
}
