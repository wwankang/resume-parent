package top.wankang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.wankang.api.UserControllerApi;
//import top.wankang.api.UserControllerApi;

/**
 * @author wankang
 * @version 1.0
 * @date 2020/5/26 16:39
 */
@RestController
public class ConsumerDemoController {

    @Autowired
    private UserControllerApi userControllerApi;//现在在使用的feign方式,,

    //现在在使用的feign方式,,
    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public String query(@RequestParam("name") String name) {
        System.out.println("开始调用远程服务。。。");
        String s = userControllerApi.userList(name);
        System.out.println("调用远程服务结束。。。");
        return name;
    }
}

