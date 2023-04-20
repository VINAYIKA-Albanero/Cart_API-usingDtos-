package com.example.demo.Controller;
import com.example.demo.Dtos.UserDto;
import com.example.demo.Services.UserService;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/hui")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/post")
    public User createUser(@RequestBody UserDto userDto) {
        User user = new User();
        user.setUsername(userDto.getName());
        return userService.createUser(user);
    }

    @GetMapping("/get/{id}")
    public User getUser(@PathVariable String name) {
        return userService.getUser(name);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable String id, @RequestBody UserDto userDto) {
        return userService.updateUser(id, userDto);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id) {
        userService.deleteUser(id);
    }
}

