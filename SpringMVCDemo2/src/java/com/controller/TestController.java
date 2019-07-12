/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author LOC
 */
@Controller
@RequestMapping(value = "/hello")
public class TestController {
    // view -> xinchao
    @RequestMapping(value = "/xinchao",method = RequestMethod.GET)
    public String hello(ModelMap mm){
        mm.put("name", "Le Thai Loc");
        return "hellojsp";
    }
    //get request.query
    @RequestMapping(value = "/query/{id}",method = RequestMethod.GET)
    public String query(@PathVariable(value = "id") int id,ModelMap mm){
        mm.put("query", id);
        return "query";
    }
    //view -> dangky
    @RequestMapping(value = "/dangky",method = RequestMethod.GET)
    public String dangky(ModelMap mm) {
        mm.addAttribute("user", new User());
        return "dangky";
    }
    //dangky post
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String actionDK(@ModelAttribute(value = "user") User user,ModelMap mm) {
        System.out.println(user.getUsername());
        mm.put("welcomeuser", user);
        return "welcome";
    }
    
}
