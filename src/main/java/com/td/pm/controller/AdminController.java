package com.td.pm.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.td.pm.bean.Equipments;
import com.td.pm.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping("/admin")
@Controller
public class AdminController {
    @Autowired
    private AdminService service;
    @RequestMapping(value = "/equipments",method = RequestMethod.POST)
    @ResponseBody
    public String getEquipments(){
        List<Equipments> equipmentsList = service.queryAll();
        String data = "";
        //判断是否为空
        if (equipmentsList == null)
            return null;
        //转化为json
        try {
            data = new ObjectMapper().writeValueAsString(equipmentsList);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return data;
    }
    @RequestMapping(value = "/addEquip",method = RequestMethod.POST)
    @ResponseBody
    public String addEquipments(@RequestBody(required = false) Equipments equipments){
        Boolean result = service.save(equipments);
        String data = "";
        //判断是否为空
        if (result == true)
            data = "success";
        //转化为json
        try {
            data = new ObjectMapper().writeValueAsString(data);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return data;
    }
    @RequestMapping(value = "/deleteEquip",method = RequestMethod.POST)
    @ResponseBody
//    public String deleteEquipments(@RequestBody(required = false) List<String> list){
    public String deleteEquipments(@RequestBody(required = false) String[] array){
        Boolean result = service.deleteByIds(array);
        String data = "";
        //判断是否为空
        if (result == true)
            data = "success";
        //转化为json
        try {
            data = new ObjectMapper().writeValueAsString(data);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return data;
    }
    @RequestMapping(value = "/editEquip",method = RequestMethod.POST)
    @ResponseBody
    public String updateEquipments(@RequestBody(required = false) Equipments equipments){
        Boolean result = service.updateEquipments(equipments);
        String data = "";
        //判断是否为空
        if (result == true)
            data = "success";
        //转化为json
        try {
            data = new ObjectMapper().writeValueAsString(data);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return data;
    }

    @RequestMapping(value = "/{id}/getEquip",method = RequestMethod.POST)
    @ResponseBody
    public String getEquipments(@PathVariable("id") String id){
        Equipments equipments = service.getEquipById(id);
        String data = "";
        //判断是否为空
        if (equipments == null)
            return null;
        //转化为json
        try {
            data = new ObjectMapper().writeValueAsString(equipments);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return data;
    }
}
