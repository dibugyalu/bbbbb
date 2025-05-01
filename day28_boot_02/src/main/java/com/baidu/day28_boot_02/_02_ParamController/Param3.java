    package com.baidu.day28_boot_02._02_ParamController;

    /*
       练习获取数组和集合参数
     */

    import com.baidu.day28_boot_02.User;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;

    @CrossOrigin(origins = "http://localhost:5173")
    @RestController
    @RequestMapping("p3")
    public class Param3 {

        @PostMapping("m1")
        public Integer[] method1(Integer[] arr){
            System.out.println(arr);
            return arr;
        }

        @PostMapping("m2")
        public List<Integer> method2(@RequestParam List<Integer> list){
            System.out.println(list);
            return list;
        }
    }
