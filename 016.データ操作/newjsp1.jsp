<%-- 
    Document   : newjsp1
    Created on : 2018/02/20, 17:04:46
    Author     : geust1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
  <head>
    <title>コントロールサンプル</title>
  </head>
  <body>
      
      名前、性別、趣味、住まい、自己紹介を入力してください。

    <form action="./newjsp2.jsp" method="post">
      <!-- formタグで括られた入力項目はこれら -->
      
      名前：
      <input type="text" name="txtName">
      性別：
      
      <input type="radio" name="男">男
      
      <input type="radio" name="女">女
       住まい：
 <input type="checkbox" name="properties" value="CellPhone" /> 埼玉県
 <input type="checkbox" name="properties" value="Car" /> 東京都
 <input type="checkbox" name="properties" value="Cottage" /> 千葉県
     趣味：
       <select name="趣味">
   <option>読書</option>
   <option>スポーツ</option>
   <option>音楽</option>
 </select>
      自己紹介
      <textarea name="mulText"></textarea>
      <input type="submit" name="btnSubmit">
      <input type="reset" value="削除" />
    </form>
  </body>
</html>

