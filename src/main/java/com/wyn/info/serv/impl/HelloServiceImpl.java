package com.wyn.info.serv.impl;

import com.wyn.info.serv.HelloService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    public void print() {

        System.out.println("hello");
    }
}
