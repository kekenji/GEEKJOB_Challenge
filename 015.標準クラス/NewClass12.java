/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenge;

/**
 *
 * @author geust1Day
 */

//Java の標準クラスについて，これまでに扱っていないものを自身で調査し，その標準クラスを利用した処理を記述してください。 
//その際，「ファイル操作編」の単元で学習した内容を利用して，以下の内容が記載されたログファイルを作成してください。
//1. 処理の内容（例：文字列の置換） 
//2. 処理を開始する旨と，その時刻（例：2000-01-01 12:00 開始） 
//3. 処理を終了する旨と，その時刻（例：2000-04-04 11:00 終了） 
//※ なお，ログファイルとは，一定の記録（Log）が記述されたファイルの一般的な名称です（特定のファイル形式を指すものではありません）。
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NewClass12 {
    public static void main(String[] args) {
    // ファイルオープン
    try{
               Date now = new Date(1451574000000L);
        //1478221200000L
 
        // SimpleDateFormat作成
        SimpleDateFormat sdf =
            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss 開始");

        System.out.print(sdf.format(now));
               String word = "あきかえお";
        
        // 文字の置換 
        word = word.replace("か", "う");
        word = word.replace("き", "い");
        System.out.print(word);
    File fp = new File("log");
    // FileWriter作成
    FileWriter fw = new FileWriter(fp);
    // 書き込み
    fw.write(sdf.format(now));
    fw.write(word);
    // クローズ
    fw.close();
    } catch (IOException e){
      e.printStackTrace();
    }}}
