    package com.baidu.day28_boot_02._02_ParamController;

    /*
       练习获取对象参数
     */

    import com.baidu.day28_boot_02.User;
    import org.springframework.web.bind.annotation.*;

    import javax.servlet.http.HttpServletRequest;
    import java.util.Arrays;
    import java.util.Map;
    @CrossOrigin(origins = "http://localhost:5173")
    @RestController
    @RequestMapping("p2")
    public class Param2 {

        @PostMapping("m1")
        public User method1(@RequestBody User us){
            System.out.println(us);
            return us;
        }

        @PostMapping("m2")
        public User method2(User us){
            System.out.println(us);
            return us;
        }
    }
