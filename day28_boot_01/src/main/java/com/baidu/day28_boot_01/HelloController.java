package com.baidu.day28_boot_01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("ikun")
   public String hello(){
       System.out.println("我们自定义controller执行了...");
       return "hello...day28";
   }
}
