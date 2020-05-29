package top.wankang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.wankang.entity.UserInfo;
import top.wankang.service.UserService;

/**
 * @author wankang
 * @version 1.0
 * @date 2020/5/26 16:32
 */
@RestController
public class UserInfoController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/userInfo")
    public UserInfo getUserInfoByName(@RequestParam("name") String name){
        return userService.getUserInfoByName(name);
    }
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String userList(@RequestParam("name") String name){
        System.out.println("userList执行。。。");
        return name;
    }
    @RequestMapping("/hello")
    @ResponseBody
    public String helloWorld(){
        return "spring security hello world";
    }

}
