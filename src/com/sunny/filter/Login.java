package com.sunny.filter;

import javax.servlet.*;
import java.io.IOException;

public class Login implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {


    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("Login filter");


    }

    @Override
    public void destroy() {

    }
}
