package com.swarg.controller;

import com.swarg.modal.User;
import com.swarg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/profile")
    public ResponseEntity<User> findUserByJwtToken(@RequestHeader("Authorization")String jwt)throws Exception{

      User user=userService.findUserByJwtToken(jwt);

      return new ResponseEntity<>(user, HttpStatus.OK);


    }
}
