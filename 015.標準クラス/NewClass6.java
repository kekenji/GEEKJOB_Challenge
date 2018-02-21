/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenge;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author geust1Day
 */
public class NewClass13 {
    public static void main(String[] args){

        //2015年1月1日 0時0分0秒と2015年12月31日 23時59分59秒の差（ミリ秒）を表示してください。
        
       // 当日の日時で日付情報を作成
       
        Date d = new Date(31535999000L);
       //1420038000000L *2015/1/1 00:00:00
       //1451573999000L *2015/12/31 23:59:59
       
       // SimpleDateFormat作成
        SimpleDateFormat sdf =
            new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        // 日付示 -- 英語表記の日時表示
       
        // タイムスタンプ表示
        System.out.print(d.getTime());
   
    }
}
