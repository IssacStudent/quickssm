package com.wyn.info.controller;

import com.wyn.info.model.WynUser;
import com.wyn.info.serv.impl.WynUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class WynUserController {
    @Autowired
    WynUserServiceImpl wynUserService;

    @GetMapping("/findAll")
    public String findAll(){
        List<WynUser> wynUserList = wynUserService.findAll();
        for(WynUser wynUser : wynUserList){
            System.out.println("id: " + wynUser.getId());
            System.out.println("name: " + wynUser.getName());
        }
        wynUserService.findAll();
        return "hello";
    }
}
