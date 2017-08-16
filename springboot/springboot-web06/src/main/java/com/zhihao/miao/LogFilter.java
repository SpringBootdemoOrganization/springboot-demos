package com.zhihao.miao;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/user/servlet")
public class LogFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("income log filter " + request.getRemoteHost());
        chain.doFilter(request, response);

    }

    public void destroy() {

    }

}
