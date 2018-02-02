<%-- 
    Document   : Challenge1-3
    Created on : 2018/02/02, 12:00:57
    Author     : geust1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
   final int BASE = 100;
   int num = 5;
   int tasu = BASE + num;
   int hiku = BASE - num;
   int kake = BASE * num;
   int wari = BASE / num;
   int amari = BASE % 3;
   
   out.println(tasu);
   out.println(hiku);
   out.println(kake);
   out.println(wari);
   out.println(amari);
   %>