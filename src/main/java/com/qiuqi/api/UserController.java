package com.qiuqi.api;

import com.qiuqi.model.User;
import com.qiuqi.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "get user list", notes = "get user list")
    @GetMapping(value = "/users")
    @ResponseStatus(HttpStatus.OK)
    public List<User> getUser(){
        return userService.getUserList();
    }

    @ApiOperation(value = "update user base id", notes = "update user")
    @PutMapping(value = "/users/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public User updateUser(@PathVariable("id") String id, @RequestBody User user){
        return userService.update(id, user);
    }
}
