package com.example.chiikawa;

import java.io.IOException;
import java.io.PrintWriter;

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
        
        String keyword = request.getParameter("keyword");
        
        String[] storeNames = {
            "연습용 판매처 A",
            "연습용 판매처 B",
            "연습용 판매처 C"
        };
        
        response.setContentType("text/html; charset=UTF-8");
        
        PrintWriter writer = response.getWriter();
        
        writer.println("""
            <!DOCTYPE html>
            <html lang="ko">
            <head>
                <meta charset="UTF-8">
                <title>치이카와 토벌 지도</title>
            </head>
            <body>
                <h1>치이카와 굿즈 판매처</h1>
                <form method="get">
                    <input name="keyword" placeholder="판매처 이름">
                    <button type="submit">검색</button>
                </form>
                <ul>
            """);
            
    for (String storeName : storeNames) {
        if (keyword == null
            || keyword.isBlank()
            || storeName.contains(keyword)) {
                
            writer.println("<li>" + storeName + "</li>");
        }
    }
    
    
    writer.println("""
                </ul>
            </body>
            </html>
        """);
    }
}