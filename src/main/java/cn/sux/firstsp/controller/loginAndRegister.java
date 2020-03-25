package cn.sux.firstsp.controller;

import cn.sux.firstsp.service.LoginService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.*;

@RestController
@EnableAutoConfiguration
@RequestMapping("/loginAndRegister")
public class loginAndRegister {

    @Resource
    private LoginService loginService;

    @RequestMapping(value ="/login")
    public Map login(@RequestBody HashMap map, HttpServletRequest request) throws Exception{
        Map result =new HashMap();
        result = map;
        HttpSession session = request.getSession();
        String verificationCode = (String) session.getAttribute("VerificationCode");
        result.put("code",verificationCode);
        return result;
    }

    @RequestMapping(value ="/info")
    public List userInfo () throws Exception{
        List result =new ArrayList();
        result = loginService.queryList();
        return result;
    }
}
