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

import java.util.Date;
import java.text.SimpleDateFormat;
//現在の日時を「1988年5月21日 1時23分45秒」といった形式で表現してください。
class NewClass4 {
     
        public static void main(String[] args) {
        // 今日の日付作成
        Date now = new Date();
        // SimpleDateFormat作成
        SimpleDateFormat sdf =
            new SimpleDateFormat("1988年5月21日　1時23分45秒");

        System.out.print(sdf.format(now));
        
    }
}
  