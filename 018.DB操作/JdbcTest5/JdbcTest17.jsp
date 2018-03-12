<%-- 
    Document   : JdbcTest16
    Created on : 2018/03/12, 13:18:20
    Author     : geust1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <h1>商品情報を更新しました。</h1>
    </body>
</html>
<%@ page import="java.io.IOException" %>
<%@ page import="java.io.PrintWriter"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.SQLException"%>
<%@ page import="java.sql.Statement"%>
<%
    Class.forName("com.mysql.jdbc.Driver");

    request.setCharacterEncoding("UTF-8");

    String url = "jdbc:mysql://localhost/Challenge_db";
    String user = "Challenge";
    String password = "19941122";

    Connection conn = DriverManager.getConnection(url, user, password);

    String a = request.getParameter("txtnumber");
    String b = request.getParameter("txtname");
    
    Statement stmt = conn.createStatement();
     String sql = "insert into product (商品番号,商品名) values ('"+a+"','"+b+"')";
        int num = stmt.executeUpdate(sql);
    
    Statement stm = conn.createStatement();
    

     sql = "select * from product";
    ResultSet rs = stm.executeQuery(sql);

    while (rs.next()) {
        int id = rs.getInt("商品番号");
        String name = rs.getString("商品名");
        out.print(id +name);
        
    }
%>
<form action="./JdbcTest16.html">
<br><br>
<input type="submit" value="ログアウト">
</form>