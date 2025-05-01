package com.baidu.day28_boot_02._02_ParamController;

/*
   练习简单零散数据
 */

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:5173")  // 允许来自指定来源的请求
@RestController
@RequestMapping("p1")
public class Param1 {

    // 使用传统的方式获取参数 了解
    // HttpServletRequest 代表的就是一个完整的请求对象，该对象由web服务器负责创建，并在浏览器请求这个方法的时候，传递到这个方法
    @GetMapping("ikun")
    public String method1(HttpServletRequest request) {
        // 面向request对象获取参数
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String[] hobbies = request.getParameterValues("hobby");
        System.out.println(name + " " + age + " " + Arrays.toString(hobbies));
        System.out.println("--------------------------------");
        Map<String, String[]> parameterMap = request.getParameterMap();
        System.out.println(parameterMap);
        return name + " " + age + " " + Arrays.toString(hobbies);
    }

    @PostMapping("ikun")
    public String method2(HttpServletRequest request) {
        System.out.println("post......");
        // 面向request对象获取参数
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String[] hobbies = request.getParameterValues("hobby");
        System.out.println(name + " " + age + " " + Arrays.toString(hobbies));
        System.out.println("--------------------------------");
        Map<String, String[]> parameterMap = request.getParameterMap();
        System.out.println(parameterMap);
        return name + " " + age + " " + Arrays.toString(hobbies);
    }

    @PostMapping("ikun1")
    public String method2(@RequestParam(value = "name2", required = false, defaultValue = "haha") String name, Integer age, String[] hobby) {
        System.out.println("post ikun1......");
        System.out.println(name + " " + age + " " + Arrays.toString(hobby));
        return name + " " + age + " " + Arrays.toString(hobby);
    }
}
