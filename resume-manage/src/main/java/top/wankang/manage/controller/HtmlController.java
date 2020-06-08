package top.wankang.manage.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wankang
 * @version 1.0
 * @date 2020/6/7 10:56
 */
@Controller
public class HtmlController {
    @RequestMapping("/welcome.html")
    public String welcome(Model model){
        UserDetails principal = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username = principal.getUsername();
        model.addAttribute("username",username);
        return "welcome";
    }
    @RequestMapping("/index")
    public String index(Model model){
        UserDetails principal = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username = principal.getUsername();
        model.addAttribute("username",username);
        return "index";
    }
}
