package cc.laop.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Administrator
 * @Date: create in 2021/4/9 10:50
 * @Description:
 */
@RestController
@RequestMapping("admin")
public class AdminController {

    @GetMapping("test1")
    public String test() {
        return "hello";
    }

    @GetMapping("test2")
    public String test2() {
        return "hello2";
    }

    @GetMapping("test3")
    public String test3() {
        return "hello3";
    }

    @GetMapping("test4")
    @PreAuthorize("hasRole('admin')")
    // @PreAuthorize("permitAll()")
    public String test4() {
        return "hello4";
    }

}
