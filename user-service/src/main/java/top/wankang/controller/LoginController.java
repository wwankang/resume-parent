package top.wankang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wankang
 * @version 1.0
 * @date 2020/5/27 10:14
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String userLogin() {

        return "login";
    }
    @RequestMapping("/login-error")
    public String userLoginError() {

        return "login-error";
    }
}
