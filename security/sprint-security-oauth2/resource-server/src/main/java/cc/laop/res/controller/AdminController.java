package cc.laop.res.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Administrator
 * @Date: create in 2021/4/9 17:18
 * @Description:
 */
@RestController
@RequestMapping("admin")
public class AdminController {
    
    @GetMapping("test")
    public String test() {
        return "hello";
    }

}
