package top.wankang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}
