package com.baidu.day28_boot_02._04_response;

/*
    练习响应各种数据并统一结果
 */

import com.baidu.day28_boot_02._03_entry.R;
import org.springframework.web.bind.annotation.*;

//@Controller
@RestController
@RequestMapping("r2")
public class Response2 {

    @PostMapping("m1")
//    @ResponseBody
    public R<String> method1() {
        R<String> sucess = R.sucess("真实的字符串数据....");
        return sucess;
    }

    @DeleteMapping("m2/{id}")
//    @ResponseBody
    public R method2(@PathVariable Integer id) {
        if(id != null && id == 1) {
            R sucess = R.sucess("根据：" + id + "删除成功了...");
            return sucess;
        }

        R fail = R.fail("根据：" + id + "删除失败...");
        return fail;
    }
}