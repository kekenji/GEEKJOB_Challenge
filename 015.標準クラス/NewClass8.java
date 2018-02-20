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

//変数を宣言し，自分のメールアドレス（架空のものでも構いません）をその値としてください。その後，String クラスのメソッドを利用して，メールアドレスの「@」以降の文字数を画面に表示してください。


public class NewClass8 {
  
    public static void main(String[] args) {
        String word = "ito@gmail.com";

        // 4番目以降を取得 -- "@～"
        System.out.print(word.substring(3));
    }
}

