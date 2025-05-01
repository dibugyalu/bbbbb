    package com.baidu.day28_boot_02._02_ParamController;

    /*
       练习获取日期类型的 参数
     */

    import com.baidu.day28_boot_02.User;
    import org.springframework.format.annotation.DateTimeFormat;
    import org.springframework.web.bind.annotation.*;

    import java.time.LocalDateTime;
    import java.util.List;

    @CrossOrigin(origins = "http://localhost:5173")
    @RestController
    @RequestMapping("p4")
    public class Param4 {

        @PostMapping("m1")
        public LocalDateTime method1(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm") LocalDateTime ldt){
            System.out.println(ldt);
            return ldt;
        }

        @PostMapping("m2")
        public User method2(User user){
            System.out.println(user);
            return user;
        }

        @PostMapping("m3")
        public User method3(@RequestBody User user){
            System.out.println(user);
            return user;
        }


    }
