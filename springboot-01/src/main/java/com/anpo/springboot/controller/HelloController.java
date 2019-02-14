package com.anpo.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.websocket.server.PathParam;

@Controller
public class HelloController {

    @RequestMapping(value="/hello")
    @ResponseBody
    public String helloWorld(){
        System.out.println("Hello World !");
        return "Hello World!";

    }



}
