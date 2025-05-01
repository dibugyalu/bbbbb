package com.baidu.day28_boot_02._04_response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
@RequestMapping("r")
public class Response1 {

    @GetMapping("hello")
//    @ResponseBody
    public String hello() {
        System.out.println("hello--------------");
        return "/index.html";
    }
}
