package org.example.vahn.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.vahn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public ResponseEntity<Object> addUser(@RequestParam(value = "name") String name) {
        log.info("Req received for adding user with name " + name);
        userService.addUser(name);
        return null;
    }
}
