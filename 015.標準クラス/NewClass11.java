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

//課題「ファイルの書き出しと保存」で作成したテキストファイルを読み込み，その内容を画面に表示してください。

public class NewClass11 {

    public static void main(String[] args) {
    try{
File fp = new File("test.txt");

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