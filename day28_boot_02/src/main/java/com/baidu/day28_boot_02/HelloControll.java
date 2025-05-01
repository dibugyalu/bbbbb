package com.baidu.day28_boot_02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("mc")
public class HelloControll {
    @GetMapping("ikun1")
    public String hello(){
        return "HelloControll中的hello...";
    }

    @GetMapping("list")
    public List<User> collection(){

        return List.of(new User("ikun1", 18), new User("ikun2", 19));
    }
}
