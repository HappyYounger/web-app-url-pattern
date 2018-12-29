package com.sunny.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.HashMap;
import java.util.Map;

public class AppContextListener implements ServletContextListener {

    private ServletContext servletContext;
    private Map<String, String> paramMap;

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {

        this.servletContext = servletContextEvent.getServletContext();
        paramMap = new HashMap<>();
        paramMap.put("url", "http://www.sunny-edu.com");
        paramMap.put("name","阳光教育");
        this.servletContext.setAttribute("params", paramMap);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
