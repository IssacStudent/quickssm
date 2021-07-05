package com.wyn.info.controller;
import com.wyn.info.serv.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//import org.springframework.web.bind.annotation.RestController;
@Controller
@RequestMapping(value = "/test")
public class WynTestController {
    @Autowired
    HelloService helloService;

    @GetMapping("/sayHello")
    public String sayHello(){
        return "hello";
    }
}
