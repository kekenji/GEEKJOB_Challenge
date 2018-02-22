/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenge;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author geust1Day
 */
public class NewClass13 {
    public static void main(String[] args){

    try{
        
        Date now = new Date(1451576000000L);
                SimpleDateFormat sdf =
            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss 終了");
File fp = new File("log");

    // FileReader作成
    FileReader fr = new FileReader(fp);
    // BufferedReader作成
    BufferedReader br = new BufferedReader(fr);
    // 1行読み出し
    System.out.print(br.readLine());

    br.close();
       } catch (IOException e){
      e.printStackTrace();
      
  }}}
