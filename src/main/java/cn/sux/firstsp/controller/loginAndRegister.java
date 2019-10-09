package cn.sux.firstsp.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.*;

@RestController
@RequestMapping("/loginAndRegister")
public class loginAndRegister {

    @RequestMapping("/login")
    public Map login(@RequestBody HashMap map, HttpServletRequest request){
        Map result =new HashMap();
        result = map;
        HttpSession session = request.getSession();
        String verificationCode = (String) session.getAttribute("VerificationCode");
        result.put("code",verificationCode);
        return result;
    }

}
