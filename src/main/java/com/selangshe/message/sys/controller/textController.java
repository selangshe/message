package com.selangshe.message.sys.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class textController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    private String test(){
        return  "/loginhh";
    }

}
