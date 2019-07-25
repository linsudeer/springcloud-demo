package com.linsu.springcloud.authservice.controller;

import com.linsu.springcloud.authservice.domain.User;
import com.linsu.springcloud.authservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "current", method = RequestMethod.GET)
    public Principal getUser(Principal principal) {
        return principal;
    }

    @PreAuthorize(value = "#oauth2.hasScope('server')")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public void createUser(User user){
        userService.create(user);
    }

}
