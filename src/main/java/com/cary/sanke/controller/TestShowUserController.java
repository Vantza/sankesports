package com.cary.sanke.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cary.sanke.pojo.Testusert;
import com.cary.sanke.service.TestusertService;

@Controller  
@RequestMapping("/user")
public class TestShowUserController {
	@Resource  
    private TestusertService userService;  
      
    @RequestMapping("/showUser")  
    public String toIndex(HttpServletRequest request,Model model){  
        int userId = Integer.parseInt(request.getParameter("id"));  
        Testusert user = this.userService.getUserById(userId);  
        model.addAttribute("user", user);  
        return "TestShowUser";  
    }
}
