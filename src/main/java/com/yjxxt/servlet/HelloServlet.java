package com.yjxxt.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设定编码
        req.setCharacterEncoding("utf-8");
        //设定值
        req.setAttribute("msg","hello freemarker..");
        req.setAttribute("flag",true);
        //转发
        req.getRequestDispatcher("template/f01.ftl").forward(req,resp);

    }
}
