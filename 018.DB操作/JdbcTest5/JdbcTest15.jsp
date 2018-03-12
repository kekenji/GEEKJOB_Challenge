<%-- 
    Document   : JdbcTest15
    Created on : 2018/03/12, 11:18:08
    Author     : geust1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>データベースに接続しました。</h1>
    </body>
</html>
<%@ page import="java.io.IOException" %>
<%@ page import="java.io.PrintWriter"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.SQLException"%>
<%@ page import="java.sql.Statement"%>
<h2>現在の商品情報</h2>
<%

  
                Class.forName("com.mysql.jdbc.Driver");

                request.setCharacterEncoding("UTF-8");
                
                String url = "jdbc:mysql://localhost/Challenge_db";
                String user = request.getParameter("txtuser");
                String password = request.getParameter("txtpas");

                Connection conn = DriverManager.getConnection(url, user, password);

 
                                Statement stm = conn.createStatement();
         String sql = "select * from product";

                ResultSet rs = stm.executeQuery(sql);

                while (rs.next()) {
                    int id = rs.getInt("商品番号");
                    String name = rs.getString("商品名");
       out.println("商品番号："+id);
       out.println("商品名："+name);
       out.println("<br>");
                }
%>
<form action="./JdbcTest17.jsp" method="post">
<br><br>
<br><br>
＊商品番号を入力してください。
<br>
<input type="text" name="txtnumber">
<br><br><br>
＊商品名を入力してください。
<br>
<input type="text" name="txtname">
<br><br><br>
<input type="submit" name="insert" value="追加">
</form>