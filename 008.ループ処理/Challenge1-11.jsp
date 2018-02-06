<%-- 
    Document   : Challenge1-11
    Created on : 2018/02/06, 11:19:30
    Author     : geust1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
    
<%
    

int total = 1;
for (int i = 0; i < 20; i++) {
    total *= 8;
}

out.print(total);


%>