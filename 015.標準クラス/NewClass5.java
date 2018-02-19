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
//2016年11月4日 10時0分0秒のタイムスタンプを作成し、「年-月-日 時:分:秒」で表示してください。

public class NewClass5 {
        public static void main(String[] args) {
        // 今日の日付作成
        Date now = new Date(1478221200000L);
        // SimpleDateFormat作成
        SimpleDateFormat sdf =
            new SimpleDateFormat("yyyy:年MM月dd日HH時mm分ss秒");

        System.out.print(sdf.format(now));
        
    }
}

