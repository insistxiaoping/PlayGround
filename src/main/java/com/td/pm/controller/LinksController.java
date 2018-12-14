package com.td.pm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//存放页面的跳转操作
@Controller
@RequestMapping("/links")
public class LinksController {
    @RequestMapping("/home")
    public String homeLink(){
        return "home";
    }
    @RequestMapping("/personal")
    public String personalLink(){
        return "personal";
    }
    @RequestMapping("/applyEquipment")
    public String applyEquipmentLink(){
        return "applyEquipment";
    }
    @RequestMapping("/applyArea")
    public String applyAreaLink(){
        return "applyArea";
    }
    @RequestMapping("/SportActivity")
    public String SportActivityLink(){
        return "SportActivity";
    }
    @RequestMapping("/notice")
    public String noticeLink(){
        return "notice";
    }
}
