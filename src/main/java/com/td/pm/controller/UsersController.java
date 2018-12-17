package com.td.pm.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.org.apache.xpath.internal.operations.Bool;
import com.td.pm.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/users")
@Controller
public class UsersController {
@Autowired
private UsersService usersService;
@RequestMapping(value = "/{userId}/{userPassword}/login",method = RequestMethod.POST)
@ResponseBody
public String login(@PathVariable("userId")String userId,@PathVariable("userPassword")String userPassword){
    Boolean b  = usersService.login(userId,userPassword);
    String result = null;
    //result ==true ·µ»Ø true
    if (b != null && b){
        result = "success";
    }else
        result = "failure";
    //json×ª»»
    ObjectMapper mapper = new ObjectMapper();
    try {
        result = mapper.writeValueAsString(result);
    } catch (JsonProcessingException e) {
        e.printStackTrace();
    }
    return result;
}
}
