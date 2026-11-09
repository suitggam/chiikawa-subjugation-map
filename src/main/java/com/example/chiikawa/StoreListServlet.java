package com.example.chiikawa;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/stores")
public class StoreListServlet extends HttpServlet {
    
    @Override
    protected void doGet(
        HttpServletRequest request,
        HttpServletResponse response
    ) throws IOException {
        
        response.setContentType("text/html; charset=UTF-8");
        
        response.getWriter().println("""
            <!DOCTYPE html>
            <html lang="ko">
            <head>
                <meta charset="UTF-8">
                <title>치이카와 토벌 지도</title>
            </head>
            <body>
                <h1>치이카와 굿즈 판매처</h1>
                <ul>
                    <li>연습용 판매처 A</li>
                    <li>연습용 판매처 B</li>
                </ul>
            </body>
            </html>
        """);
    }
}