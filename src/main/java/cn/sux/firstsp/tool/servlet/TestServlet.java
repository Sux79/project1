package cn.sux.firstsp.tool.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author sux
 */

@WebServlet(value = "/test1")
public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置编码集（设置返回类型json）
        resp.setContentType("application/json");
        //设置字符集（设置返回字符集）
        resp.setCharacterEncoding("UTF-8");
        //创建写出流（创建输出对象）
        PrintWriter writer = resp.getWriter();
        writer.write("创建post成功");
        writer.close();
    }
}
