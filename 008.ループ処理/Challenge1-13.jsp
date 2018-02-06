<%-- 
    Document   : Challenge1-13
    Created on : 2018/02/06, 14:34:30
    Author     : geust1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.text.*" %>
<%
    
int num = 0;
for (int i = 0; i <= 100; i++) {
    num += i;
    
}

out.print(num);
%>