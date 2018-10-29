package com.selangshe.message.sys.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;


@Controller
public class textController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    private String test(HttpServletRequest request){
       // request.setAttribute("id","你好世界");

        return  "/login";
    }

}
