package top.wankang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import top.wankang.api.UserControllerApi;
import top.wankang.entity.ResumeInfo;

/**
 * @author wankang
 * @version 1.0
 * @date 2020/6/1 14:12
 */
@Controller
public class ResumeController {

    @Autowired
    private UserControllerApi userControllerApi;//现在在使用的feign方式,,

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String resumeIndex(Model model){
        ResumeInfo resumeInfo = userControllerApi.resumeIndex();
        model.addAttribute("userinfo", resumeInfo.getUserInfo());
        model.addAttribute("projectList", resumeInfo.getProjectExperiences());
        model.addAttribute("skillList", resumeInfo.getSkills());
        model.addAttribute("workList", resumeInfo.getWorkExperiences());
        model.addAttribute("appraisalList", resumeInfo.getSelfAppraisal());
        return "resume/index";
    };
}
