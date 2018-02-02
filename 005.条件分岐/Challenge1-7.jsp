<%-- 
    Document   : Challenge1-7
    Created on : 2018/02/02, 17:11:47
    Author     : geust1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
char i = 'A';
switch(i) {
    case 'A':
     out.print("英語");
     break;
     case 'あ':
     out.print("日本語");
     break;
     default:
     out.print("");
     break;
         
}
%>
