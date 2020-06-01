package top.wankang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 登录页面controller
 * @author wankang
 * @version 1.0
 * @date 2020/5/27 10:14
 */
@Controller
public class LoginController {

    /**
     * 登录页面
     * @return
     */
    @RequestMapping("/login")
    public String userLogin() {

        return "/login";
    }

}
