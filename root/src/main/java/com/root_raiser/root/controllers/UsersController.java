package com.root_raiser.root.controllers;

import com.root_raiser.root.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UsersController {


    /**
     * Existing user is logging in. Check that the username and passwords are related and exist
     *
     * @param username name of the user
     * @param password password of the user
     * @return
     * */
    @GetMapping("/login")
    @ResponseBody
    public Map<String, String> login(@RequestParam String username, @RequestParam String password) {
        HashMap<String, String> result = new HashMap<>();
        result.put("username", username);
        result.put("password", password);


        // check if login is correct
        /*
        * if login is correct, place the user profile into the hashmap and return
        *
        * else, return result with an error code / indicator
        * */



        System.out.println(username + " " + password);
        return result;
    }



}
