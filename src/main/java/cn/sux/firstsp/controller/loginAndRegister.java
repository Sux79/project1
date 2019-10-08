package cn.sux.firstsp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.*;

@RestController
@RequestMapping("/login")
public class loginAndRegister {

    @RequestMapping("/login")
    public Map login(HttpServletRequest request){
        Map result =new HashMap();
        HttpSession session = request.getSession();
        String verificationCode = (String) session.getAttribute("VerificationCode");
        result.put("code",verificationCode);
        return result;
    }

}
