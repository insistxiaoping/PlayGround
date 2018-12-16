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
    @RequestMapping("/personal2")
    public String personal2Link(){
        return "personal2";
    }
    @RequestMapping("/personal3")
    public String personal3Link(){ return "personal3"; }
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
    @RequestMapping("/NotSportActivity")
    public String NotSportActivityLink(){
        return "NotSportActivity";
    }
    @RequestMapping("/LostAndFound")
    public String LostAndFoundLink(){
        return "LostAndFound";
    }
    @RequestMapping("/notice")
    public String noticeLink(){
        return "notice";
    }
    @RequestMapping("/notice2")
    public String notice2Link(){
        return "notice2";
    }
    @RequestMapping("/notice3")
    public String notice3Link(){
        return "notice3";
    }
    @RequestMapping("/login")
    public String loginLink(){
        return "login";
    }
}
