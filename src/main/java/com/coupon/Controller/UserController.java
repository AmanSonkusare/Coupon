package com.coupon.Controller;

import com.coupon.Service.UserService;
import com.coupon.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/usersave")
    public String save(@RequestBody User user){
        userService.save(user);
        return "insert data successfully";
    }
}
