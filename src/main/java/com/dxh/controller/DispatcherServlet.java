package com.dxh.controller;

import com.dxh.controller.frontend.MainPageController;
import com.dxh.controller.frontend.superadmin.HeadLineOperationController;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author https://github.com/CoderXiaohui
 * @Description
 * 1. 拦截所有请求
 * 2. 解析所有请求
 * 3. 派发给对应的Controller的方法进行处理
 * @Date 2020-08-06 00:33
 */
@WebServlet("/")
public class DispatcherServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //假如访问 http://127.0.0.1:8080/DxhFrameWork/find/getMainInfo
        System.out.println("request path is " + req.getServletPath()); // request path is /find/getMainInfo
        System.out.println("request method is " + req.getMethod()); // request method is GET
        if(req.getServletPath().equals("/frontend/getMainPageInfo") && req.getMethod().equals("GET")){
            new MainPageController().getMainPageInfo(req, resp);
        }else if(req.getServletPath().equals("/superadmin/addHeadLine") && req.getMethod().equals("POST")){
            new HeadLineOperationController().addHeadLine(req, resp);
        }
    }
}
