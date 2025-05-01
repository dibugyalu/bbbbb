    package com.baidu.day28_boot_02._02_ParamController;

    /*
       练习获取日期类型的 参数
     */

    import com.baidu.day28_boot_02.User;
    import org.springframework.format.annotation.DateTimeFormat;
    import org.springframework.web.bind.annotation.*;

    import java.time.LocalDateTime;

    @CrossOrigin(origins = "http://localhost:5173")
    @RestController
    @RequestMapping("p5")
    public class Param5 {

        @PostMapping("m1/{a}/{b}")
        public String method1(@PathVariable String a, @PathVariable Integer b){
            System.out.println(a + b);
            return a + b;
        }


    }
