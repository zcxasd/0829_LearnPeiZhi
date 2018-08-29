package com.neuedu;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    public  HelloServlet(){
        System.out.println("========构造方法==hello servlet========");
    }

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("========init==hello servlet========");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("====doPost====");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("====doGet====");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String phone = request.getParameter("phone");
        System.out.println("username="+username+ " password="+password+" phone="+phone);
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
