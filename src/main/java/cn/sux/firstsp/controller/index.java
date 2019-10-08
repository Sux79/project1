package cn.sux.firstsp.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration

/**
 * 此类用于启动第一个页面，访问项目的登录页面
 */
public class index {

    @RequestMapping(value = "/index")
    public String indexLogin() {
        return "login";
    }

    @RequestMapping(value = "/register")
    public  String register() {
        return "register";
    }
}
