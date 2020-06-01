package top.wankang.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import top.wankang.entity.UserInfo;

/**
 * @author wankang
 * @version 1.0
 * @date 2020/5/26 16:49
 */
@FeignClient("user-service")
public interface UserControllerApi {

    @RequestMapping(value = "/userInfo")
    UserInfo getUserInfoByName(@RequestParam("name") String name);
}
