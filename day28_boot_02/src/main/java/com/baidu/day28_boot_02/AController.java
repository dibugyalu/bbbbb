package com.baidu.day28_boot_02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
    controller
    service
    dao
 */
@RestController
@RequestMapping("ac")
public class AController {
    @GetMapping("ikun1")
    public String hello(){
        return "AController中的hello...";
    }
}
