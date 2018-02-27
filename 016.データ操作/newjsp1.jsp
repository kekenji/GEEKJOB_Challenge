<%-- 
    Document   : newjsp1
    Created on : 2018/02/26, 14:32:41
    Author     : geust1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%

// 受け取るパラメータの文字コード
request.setCharacterEncoding("UTF-8");
String num1 = request.getParameter("txtName1");
int a = Integer.parseInt(num1); 
String num2 = request.getParameter("txtName2");
int b = Integer.parseInt(num2);
int total = a*b;
// チェックボックスの情報
out.println(request.getParameter("chkTest"));
// テキストボックスの情報
out.println(total);
if(total < 3000){
out.println(total*0);
} else if(total < 5000){
out.println(total*0.04);
} else {
out.print(total*0.05);
}
%>