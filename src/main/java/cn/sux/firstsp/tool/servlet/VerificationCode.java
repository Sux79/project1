package cn.sux.firstsp.tool.servlet;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.ICaptcha;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.OutputStream;
import java.util.stream.Stream;

/**
 * @author sux
 * 验证码
 */
@WebServlet(value = "/VerificationCode")
public class VerificationCode extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ICaptcha captcha = CaptchaUtil.createLineCaptcha(102,40,4,18);
        try {
            captcha.write(resp.getOutputStream());
        }catch (Exception e){
            e.printStackTrace();
        }
        // 存入会话session
        HttpSession session = req.getSession(true);
//        session.removeAttribute();
        System.out.println(captcha.getCode());
    }
}
