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

//自分の氏名について，バイト数と文字数を取得してください。また，それぞれの値を画面に表示してください。

public class NewClass7 {
   
    public static void main(String[] args) {
        String word = "伊藤健次";

        // 文字列の長さを表示 -- 4
        System.out.println(word.length());
        //バイト数
        System.out.println(word.getBytes().length);
    }
}

