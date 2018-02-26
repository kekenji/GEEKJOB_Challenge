<%-- 
    Document   : newjsp
    Created on : 2018/02/26, 10:41:52
    Author     : geust1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
// 受け取るパラメータの文字コード
request.setCharacterEncoding("UTF-8");
// テキストボックスの情報
out.println(request.getParameter("txtName"));
// ラジオボタンの情報
out.println(request.getParameter("rdoSample"));
// コンボボックス（select）の情報
out.println(request.getParameter("cmbList"));
// テキストエリアの情報
out.println(request.getParameter("mulText"));
%>