package com.td.pm.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.td.pm.bean.UserTable;
import com.td.pm.service.UserTableService;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("/user")
public class UserTableController {

	private Logger logger = LoggerFactory.getLogger(UserTableController.class);
	
	@Autowired
	private UserTableService userService;
	
	@RequestMapping("/test")
	@ResponseBody
	public JSONObject testUser(HttpServletRequest request) {
		String id = request.getParameter("id");
		UserTable userTable = userService.getUserById(Integer.valueOf(id));
		JSONObject jsonObject = JSONObject.fromObject(userTable);
		return jsonObject;
	}
}
