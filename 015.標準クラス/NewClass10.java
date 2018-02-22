/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenge;

import java.io.*;
/**
 *
 * @author geust1Day
 */

//自己紹介の記述されたテキストファイルを作成してください。ファイルの作成は，File クラスなどを利用することによって行ってください。

public class NewClass10 {

    public static void main(String[] args) {
    // ファイルオープン
    try{
    File fp = new File("test.txt");

    // FileWriter作成
    FileWriter fw = new FileWriter(fp);
    
    // 書き込み
    fw.write("あ");
    
    // クローズ
    fw.close();
   
    } catch (IOException e){
      e.printStackTrace();
      
    }
    }
}
