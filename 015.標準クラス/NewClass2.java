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

       // 当日の日時で日付情報を作成
        Date d = new Date(1451574000000L);
       //1451574000000L
       // SimpleDateFormat作成
        SimpleDateFormat sdf =
            new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        // 日付表示 -- 英語表記の日時表示
       System.out.print(sdf.format(d));
        // タイムスタンプ表示
        System.out.print(d.getTime());
   
    }
}
