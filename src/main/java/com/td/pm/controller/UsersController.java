package com.td.pm.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.org.apache.xpath.internal.operations.Bool;
import com.td.pm.bean.ApplyEquip;
import com.td.pm.bean.Equipments;
import com.td.pm.bean.Users;
import com.td.pm.service.AdminService;
import com.td.pm.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/users")
@Controller
public class UsersController {
    @Autowired
    private UsersService usersService;
    @RequestMapping(value = "/{userId}/{userPassword}/login",method = RequestMethod.POST)
    @ResponseBody
    public String login(@PathVariable("userId")String userId,
                        @PathVariable("userPassword")String userPassword,
                        @RequestParam(value = "isAdmin",required = false) String isAdmin){
        Boolean b  = usersService.login(userId,userPassword,isAdmin);
        String result = null;
        //result ==true 返回 true
        if (b != null && b){
            result = "success";
        }else
            result = "failure";
        //json转换
        ObjectMapper mapper = new ObjectMapper();
        try {
            result = mapper.writeValueAsString(result);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return result;
    }
    @RequestMapping(value = "/regist",method = RequestMethod.POST)
    @ResponseBody
    public String regist(@RequestBody(required = false) Users users){
        users.setUserId(users.getUserPhone());
        Boolean b  = usersService.saveUser(users);
        String result = null;
        //result ==true 返回 true
        if (b != null && b){
            result = "success";
        }else
            result = "failure";
        //json转换
        ObjectMapper mapper = new ObjectMapper();
        try {
            result = mapper.writeValueAsString(result);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return result;
    }
    @RequestMapping(value = "/applyEquip",method = RequestMethod.POST)
    @ResponseBody
    public String applyEquip(@RequestBody(required = false) ApplyEquip apply){
        Boolean b  = usersService.saveApplyEquip(apply);
        String result = null;
        //result ==true 返回 true
        if (b != null && b){
            result = "success";
        }else
            result = "failure";
        //json转换
        ObjectMapper mapper = new ObjectMapper();
        try {
            result = mapper.writeValueAsString(result);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return result;
    }
}
