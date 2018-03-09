/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.sql.*;

/**
 *
 * @author geust1Day
 */

public class JdbcTest8 {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost/Challenge_db";
            String user = "Challenge";
            String password = "19941122";

            System.out.println("URL      :" + url);
            System.out.println("USER     :" + user);
            System.out.println("PASSWORD :" + password);

            System.out.println("データベースに接続します...");
            Connection conn = DriverManager.getConnection(url, user, password);

            System.out.println("データベースと接続しました");

            //データベース表示
            Statement stm = conn.createStatement();
            String sql = "update profiles set name='伊藤健次' where profilesID = 4";
    
      int num = stm.executeUpdate(sql);

      sql = "select * from profiles";
      ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("profilesID");
                String name = rs.getString("name");
                String tel = rs.getString("tel");
                String age = rs.getString("age");
                String birthday = rs.getString("birthday");
                System.out.println("取得結果 -> " + id + ":" + name+":"+tel+":"+age+":"+birthday);
               
            }
            
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
