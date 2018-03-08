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
public class JdbcTest4 {

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

            //データベース追加
            Statement stmt = conn.createStatement();

            String sql = "insert into profiles (profilesID, name) values (8, '辻井伸行')";
            int num = stmt.executeUpdate(sql);

            //データベース取得
            sql = "select * from profiles";
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                int id = rs.getInt("profilesID");
                String name = rs.getString("name");
                String tel = rs.getString("tel");
                String age = rs.getString("age");
                String birthday = rs.getString("birthday");
                System.out.println("取得結果 -> " + id + ":" + name + ":" + tel + ":" + age + ":" + birthday);

            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
