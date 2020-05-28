package top.wankang.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author wankang
 * @version 1.0
 * @date 2020/5/26 16:32
 */
@RestController
public class UserInfoController {

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
