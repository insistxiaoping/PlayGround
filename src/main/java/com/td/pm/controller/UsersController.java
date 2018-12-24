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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

@RequestMapping("/users")
@Controller
public class UsersController {
    @Autowired
    private UsersService usersService;
    @RequestMapping(value = "/{userId}/{userPassword}/login",method = RequestMethod.POST)
    @ResponseBody
    public String login(@PathVariable("userId")String userId,
                        @PathVariable("userPassword")String userPassword,
                        @RequestParam(value = "isAdmin",required = false) String isAdmin,
                        HttpServletRequest request){
        Boolean b  = usersService.login(userId,userPassword,isAdmin);
        if (b){
            request.getSession().setAttribute("userId",userId);
        }
        return  getResult(b);
    }
    @RequestMapping(value = "/regist",method = RequestMethod.POST)
    @ResponseBody
    public String regist(@RequestBody(required = false) Users users){
        users.setUserId(users.getUserPhone());
        Boolean b  = usersService.saveUser(users);
        return  getResult(b);
    }
    @RequestMapping(value = "/applyEquip",method = RequestMethod.POST)
    @ResponseBody
    public String applyEquip(@RequestBody(required = false) ApplyEquip applyEquip){
        Boolean b  = usersService.saveApplyEquip(applyEquip);
        return  getResult(b);

    }
    @RequestMapping(value = "/applyData",method = RequestMethod.GET)
    @ResponseBody
    public String applyDataList(HttpServletRequest request){
        String userId = (String)request.getSession().getAttribute("userId");
        List<ApplyEquip> applyEquipList = usersService.queryByUserId(userId);
        ObjectMapper mapper = new ObjectMapper();
        try {
            return  mapper.writeValueAsString(applyEquipList);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
    //返回结果
    public String getResult(Boolean b){
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
