<%-- 
    Document   : Challenge1-10
    Created on : 2018/02/06, 10:42:00
    Author     : geust1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<%@ page import="java.util.*" %>
<%
    HashMap<String, String> user1 = 
                     new HashMap<String, String>();
    
    HashMap<String, String> user2 =
                      new HashMap<String, String>();
    
    HashMap<String, String> user3 =
                      new HashMap<String, String>();
    
    HashMap<String, String> user4 =
                      new HashMap<String, String>();

user1.put("1","AAA");
user2.put("hello","world");
user3.put("soeda","33");
user4.put("20", "20");

ArrayList<HashMap> data = new ArrayList<HashMap>();

data.add(user1);
data.add(user2);
data.add(user3);
data.add(user4);

out.println(user1);
out.println(user2);
out.println(user3);
out.print(user4);

%>
    
