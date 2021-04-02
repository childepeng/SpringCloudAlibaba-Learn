package cc.laop.controller;

import cc.laop.vo.UserVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: Administrator
 * @Date: create in 2021/4/1 17:09
 * @Description:
 */
@Controller
@ResponseBody
public class UserController {

    @GetMapping("user/{id}")
    public UserVO info(@PathVariable("id") Integer id, HttpServletRequest request) {
        System.out.println(request.getHeader("X-Forwarded-For"));
        return new UserVO(id, "user");
    }

}
