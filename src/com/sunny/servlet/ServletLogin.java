package com.sunny.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

public class ServletLogin extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.getWriter().write("login servlet");
        HashMap<String, String> params = (HashMap<String, String>) getServletContext().getAttribute("params");

        String contextParam = getServletConfig().getInitParameter("userDefine");

        System.out.println(contextParam);
        String url = params.get("url");
        String name = params.get("name");
        System.out.println(url);
        System.out.println(name);
    }
}
