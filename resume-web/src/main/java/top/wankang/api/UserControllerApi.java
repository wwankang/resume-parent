package top.wankang.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import top.wankang.entity.ResumeInfo;

import javax.servlet.http.HttpServletRequest;

/**
 * @author wankang
 * @version 1.0
 * @date 2020/5/26 16:49
 */
@FeignClient("user-service")
public interface UserControllerApi {
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String userList(@RequestParam("name") String name);

    @RequestMapping(value = "/resume/index", method = RequestMethod.GET)
    public ResumeInfo resumeIndex();
}
